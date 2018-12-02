package curry.constants;

public interface Url {
	public static final String INDEX = "index.jsp";
	public static final String LOGIN = "login.jsp";
	//TODO maybe it brokes :/
	public static final String LOGIN_ERROR = "login.jsp?" + RequestKeys.Parameters.LOGIN_STATUS + "=failed";
	public static final String MENU = "main_menu.jsp";
}
