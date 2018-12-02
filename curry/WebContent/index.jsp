<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/constants.jspf" %>	
<%
		String user = (String) session.getAttribute(Session.SESSION_USER);
		if(user != null && !user.equals("") && !user.isEmpty())
			 response.sendRedirect(Url.MENU);
		else
			 response.sendRedirect(Url.LOGIN);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You shouldn't be here</title>
</head>
<body>

</body>
</html>