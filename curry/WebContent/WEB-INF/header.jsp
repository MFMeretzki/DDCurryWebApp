<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/constants.jspf" %>
<%	String user = (String) session.getAttribute(UserSession.USER); %>
    

<div>
	<% if(user == null || user.equals("") || user.isEmpty()) { %>
		<a href='/curry/login.jsp'>  login  </a>
		<a href='/curry/signup.jsp'>  signup  </a>
	<% } else { %>
		<a href="/curry/logout">logout</a>
	<% } %>
	
</div>