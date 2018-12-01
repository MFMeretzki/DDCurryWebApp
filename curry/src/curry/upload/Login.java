package curry.upload;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import curry.accesoBD.CurryUsuariosDB;
import curry.constants.Formularios;
import curry.constants.Sesion;
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter(Formularios.USER_FIELD);
		String password = request.getParameter(Formularios.PASSWORD_FIELD);
		
		CurryUsuariosDB db = new CurryUsuariosDB();
		
		if(db.iniciarSesion(usuario, password)) {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute(Sesion.SESSION_USER, usuario);
			response.sendRedirect(Url.UPLOADER);
		}
		else {
			response.sendRedirect(Url.LOGIN_ERROR);
		}
		
	}

}
