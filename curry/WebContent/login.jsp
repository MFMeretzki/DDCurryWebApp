<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/constants.jspf" %>
<%
	String user = (String) session.getAttribute(Session.SESSION_USER);
	if(user != null && !user.equals("") && !user.isEmpty())
		 response.sendRedirect(Url.MENU);
	
	//Check if there was a failure during the login
	boolean loginFailed = request.getParameter("") == "";
		
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<h2>Bienvenido a D&D 3.5 Güebapp</h2>
			<form method="post" action="login">
				<div class="form-group">
					<label for="<%=Forms.USERNAME%>">Usuario:</label>
					<br>
					<input type="text" name="<%=Forms.USERNAME%>" id="<%=Forms.USERNAME%>" placeholder="Cuenta de usuario">
				</div>
				<div class="form-group">
					<label for="<%=Forms.PASSWORD%>">Contraseña: </label> 
					<br>
					<input type="password" name="<%=Forms.PASSWORD%>" id="<%=Forms.PASSWORD%>" placeholder="Introduce contraseña">
				</div>
				<button type="submit" class="btn btn-default">Entrar</button>
			</form>
		</div>
	</body>
</html>