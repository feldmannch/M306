<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<link rel="stylesheet" media="all" href="css/base.css" type="text/css">
<link rel="stylesheet" media="all" href="css/application.css" type="text/css">
</head>
<body>
	<div class="header">
		<h2>Document Management System - DMS</h2>
		<div class="loginbox">
			
		</div>
	</div>
	<div class="login">
		<form method="POST" action="login.html">
			<table>
				<tr>
					<td class="first">Benutzername:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td class="first">Passwort:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td class="first"><a href="info.html">Kein Login?</a></td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
