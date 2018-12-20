package curry.constants;

public interface Url {
	public static final String INDEX = "index.jsp";

	public static final String SIGNUP = "signup.jsp";
	public static final String SIGNUP_ERROR = "signup.jsp?" + RequestKeys.Parameters.STATUS + "=error";
	public static final String SIGNUP_PASSWORD_DOESNT_MATCH = "signup.jsp?" + RequestKeys.Parameters.STATUS + "=password_doesnt_match";
	public static final String SIGNUP_USERNAME_ALREADY_EXISTS = "signup.jsp?" + RequestKeys.Parameters.STATUS + "=username_already_exists";
	
	public static final String LOGIN = "login.jsp";
	public static final String LOGIN_ERROR = "login.jsp?" + RequestKeys.Parameters.STATUS + "=failed";
	
	public static final String MENU = "main_menu.jsp";
	
	public static final String CURRYDB = "jdbc:mysql://localhost:3306/curryDB";
}
