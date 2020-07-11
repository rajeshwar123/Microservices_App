<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forget password page</title>
</head>
<body>
	<form:form action="recoverPwd" method="Post" modelAttribute="fPwdData">
		<h1>Enter Your Email</h1>
		<table>
			<tr>
				<td>Email :</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>