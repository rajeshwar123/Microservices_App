<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Regester Student</title>
</head>
<body>

	<form:form action="studReg" method="Post" modelAttribute="studRegData">

		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="sNo"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Phone No:</td>
				<td><form:input path="phoneNo"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>