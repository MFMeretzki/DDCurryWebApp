package curry.upload;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import curry.constants.Url;
import curry.constants.RequestKeys.Forms;
import curry.core.HibernateUtil;
import curry.model.User;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter(Forms.USERNAME);
		String password = request.getParameter(Forms.PASSWORD);
		String password2 = request.getParameter(Forms.PASSWORD2);
		
		boolean ok = true;
		
		if (!password.equals(password2)) {
			ok = false;
			response.sendRedirect(Url.SIGNUP_PASSWORD_DOESNT_MATCH);
		}
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = (Session) sessionFactory.openSession();
		
		if (ok) {
			User existingUser = null;
			try {
			existingUser = session.createQuery(
					"select user1 " +
					"from User user1 " +
					"where user1.nickName = :NickName", User.class)
				.setParameter( "NickName", user )
				.uniqueResult();
			}
			catch(Exception e) {
				e.printStackTrace();
				existingUser = null;
			}
			
			if (existingUser != null) {
				ok = false;
				response.sendRedirect(Url.SIGNUP_USERNAME_ALREADY_EXISTS);
			}
		}

		if (ok) {
			Transaction tx = null;
			long id = -1;
			
			try {
				tx = session.beginTransaction();
				
				User userData = new User();
				userData.setNickName(user);
				userData.setRawPassword(password);
				id = (Long) session.save(userData);
				
			tx.commit();
			}
			catch (RuntimeException e) {
				e.printStackTrace();
				if (tx != null) tx.rollback();
			}
				
			if (id > -1) {
				HttpSession httpSession = request.getSession(true);
				httpSession.setAttribute(curry.constants.UserSession.USER, user);
				response.sendRedirect(Url.MENU);
			}
			else {
				response.sendRedirect(Url.SIGNUP_ERROR);
			}
		}
		
		session.close();
	}

}
