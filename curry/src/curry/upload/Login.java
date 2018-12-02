package curry.upload;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import curry.constants.RequestKeys.Forms;
import curry.constants.Session;
import curry.constants.Url;

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
		
		String usuario = request.getParameter(Forms.USERNAME);
		String password = request.getParameter(Forms.PASSWORD);
		
		//TODO check if the user can login into the server
		boolean correctLogin = true;
		
		if(correctLogin) {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute(Session.SESSION_USER, usuario);
			response.sendRedirect(Url.MENU);
		}
		else {
			response.sendRedirect(Url.LOGIN_ERROR);
		}
		
	}

}
