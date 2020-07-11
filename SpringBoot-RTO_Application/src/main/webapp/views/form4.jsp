<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vehicle registration details</title>
</head>
<body bgcolor="pink">
	<h1 style="color: red; text-align: center">**Vehicle Registration
		Details**</h1>
	<form:form action="vehicleRegDtls" method="post"
		modelAttribute="vhclRegDtlsData">
		<center>
		<table>

			<tr>
				<td>Registration Center</td>
				<td><form:input path="regCenter" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
		</center>
	</form:form>
</body>
</html>