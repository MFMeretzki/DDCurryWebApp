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

import curry.constants.Url;
import curry.constants.RequestKeys.Forms;
import curry.core.HibernateUtil;
import curry.core.PasswordUtil;
import curry.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter(Forms.USERNAME);
		String password = request.getParameter(Forms.PASSWORD);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = (Session) sessionFactory.openSession();
		
		User existingUser = null;
		
		try {
			existingUser = session.createQuery(
					"select u " +
					"from User u " +
					"where u.nickName = :NickName " +
					"and u.password = :Password",
					User.class)
				.setParameter( "NickName", userName )
				.setParameter( "Password", PasswordUtil.generateSecurePassword(password) )
				.uniqueResult();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			existingUser = null;
		}
		finally {
			session.close();
		}
		
		if (existingUser != null) {
			HttpSession httpSession = request.getSession(true);
			httpSession.setAttribute(curry.constants.UserSession.USER, userName);
			response.sendRedirect(Url.MENU);
		}
		else {
			response.sendRedirect(Url.LOGIN_ERROR);
		}
	}

}
