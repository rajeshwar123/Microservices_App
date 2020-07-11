<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
    height: 80%;
	width: 100%;
}
</style>
</head>
<body>
	<h1 style="color: green; text-align: center;">${adminRegMsg}</h1>
	<h1 style="color: green; text-align: center;">${recoverPwdMsg}</h1>
	<font style="font-size: 50" color="green">${regMsg}</font>
	<font style="font-size: 50" color="green">${unlockActiveMsg}</font>
	<h1 style="color: red; text-align: center; font-family: monospace;">${loginMsg}</h1>
	<h1 style="text-align: center">Login Here</h1>

	<form:form action="loginUser" method="post" modelAttribute="loginData">
		<table border="1" >
			<tr>
				<td>Username :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Sign In"></td>
			</tr>
			<tr>
				<td align="left"><a href="forgetPwd">Forget Password ?</a></td>
				<td align="right"><a href="signUp">Sign Up</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>