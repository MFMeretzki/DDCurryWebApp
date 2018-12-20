<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/checklogin.jspf" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Main menu</title>
	</head>
	<body>
		<jsp:include page="/WEB-INF/header.jsp" />
		<h1>Main Menu</h1>
		<h2>Welcome <%=user%></h2>
	</body>
</html>
