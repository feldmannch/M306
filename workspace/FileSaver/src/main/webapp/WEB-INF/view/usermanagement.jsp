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

	</div>
	<div class="navigation"></div>
	<table>
		<tr>
			<th>UserID</th>
			<th>Vorname</th>
			<th>Nachname</th>
			<th>Username</th>
			<th>UserType</th>
			<th>Passwort</th>
			<th>Löschen / Hinzufügen</th>
		</tr>
		<c:forEach items="${userArray}" var="user">
			<tr>
				<td>${user.userID}</td>
				<td>${user.firstname}</td>
				<td>${user.surname}</td>
				<td>${user.username}</td>
				<td>${user.usertype}</td>
				<td>-</td>
				<td><form action="deleteUser.html?userID=${user.userID}" method="POST">
					<input type="submit" value="Löschen" />
				</form></td>
			</tr>
		</c:forEach>
		<form action="newUser.html" method="POST">
			<tr>
				<td>Auto-Gen.</td>
				<td><input type="text" name="firstname" /></td>
				<td><input type="text" name="surname" /></td>
				<td><input type="text" name="username" /></td>
				<td><select name="usertype" size="4">
						<option>0 - Admin</option>
						<option>1 - Geschäftsleiter</option>
						<option>2 - Abt. Leiter</option>
						<option>3 - Mitarbeiter</option>
				</select></td>
				<td><input type="password" name="password" /></td>
				<td><input type="submit" value="Hinzufügen" /></td>
			</tr>
		</form>
	</table>
</body>
</html>