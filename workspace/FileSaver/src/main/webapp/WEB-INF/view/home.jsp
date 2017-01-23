<%@page import="org.springframework.ui.ModelMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<title>DMS - Document Management System</title>
<link rel="stylesheet" media="all" href="css/base.css" type="text/css">
<link rel="stylesheet" media="all" href="css/application.css"
	type="text/css">
</head>
</head>
<body>
	<div class="header">
		<h2>Document Management System - DMS</h2>
		<div class="loginbox">
			<span class="loginText">Username: ${username}</span>
			<form class="logoutButton" method="GET" action="login.html">
				<input type="submit" name="logout" value="Logout">
			</form>
			<span class="clearBoth"></span>
			<c:if test="${usertype == 0}">
				<a class="userManager" href="usermanagement.html">Userverwaltung</a>
			</c:if>
		</div>
		<div class="navigation">
			
		</div>
	</div>
</body>
</html>