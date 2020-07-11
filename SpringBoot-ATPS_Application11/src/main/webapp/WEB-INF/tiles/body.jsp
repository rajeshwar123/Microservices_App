<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font style="font-size: 50" color="green">${regMsg}</font>
	<h1 style="text-align: center">Login Here</h1>
	<table>
		<tr>
			<td>Username :</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Sign In"></td>
		</tr>
		<tr>
		<td>
			<a href="#">Forget Password ?</a>
			<a href="signUp">Sign Up</a>
			</td>
		</tr>
	</table>
</body>
</html>