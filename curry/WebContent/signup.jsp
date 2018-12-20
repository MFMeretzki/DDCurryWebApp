<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/constants.jspf" %>

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
		<jsp:include page="/WEB-INF/header.jsp" />
		<div class="container">
			<h2>Sign Up in D&D 3.5 Güebapp</h2>
			<form method="post" action="signup">
				<div class="form-group">
					<label for="<%=Forms.USERNAME%>">User:</label>
					<br>
					<input type="text" name="<%=Forms.USERNAME%>" id="<%=Forms.USERNAME%>" placeholder="User accout name">
				</div>
				<div class="form-group">
					<label for="<%=Forms.PASSWORD%>">Password: </label> 
					<br>
					<input type="password" name="<%=Forms.PASSWORD%>" id="<%=Forms.PASSWORD%>" placeholder="Password">
				</div>
				<div class="form-group">
					<label for="<%=Forms.PASSWORD2%>">Repeat password: </label> 
					<br>
					<input type="password" name="<%=Forms.PASSWORD2%>" id="<%=Forms.PASSWORD2%>" placeholder="Repeat Password">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</body>
</html>