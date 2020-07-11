<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vehicle owner details</title>
</head>
<body background="" bgcolor="pink">
	<h1 style="color:red;text-align:center">***Vehicle Owner Details***</h1>
	<form:form action="vehicleOwnerDtl" method="POST"
		modelAttribute="vehicleOnrData">
		<center>
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="Male" />Male <form:radiobutton
						path="gender" value="Female" />Female</td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Dob:</td>
				<td><form:input path="dob" /></td>
			</tr>

			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneno" /></td>
			</tr>
			<tr>
				<td>SSN Number:</td>
				<td><form:input path="ssn" /></td>
			</tr>

			<tr>
				<td colspan="2">
				<input type="reset" value="Reset" /> 
				
				<input type="submit" value="Next" />
		     	</td>
			</tr>
		</table>
		</center>
	</form:form>
</body>
</html>