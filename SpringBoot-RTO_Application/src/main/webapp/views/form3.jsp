<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>address details</title>
</head>
<body bgcolor="pink">
	<h1 style="color: red; text-align: center">***Vehicle Onwner Address Details***</h1>
	<form:form action="vehicleOwnerAddrsDetails" method="Post"
		modelAttribute="vhclOnrAddrsDtlData">
		<center>
		<table >
			<tr>
				<td>Home Number</td>
				<td><form:input path="hNo" /></td>
			</tr>
			<tr>
				<td>Street Name</td>
				<td><form:input path="streetName" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>Zip Code</td>
				<td><form:input path="zipCode" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="reset" value="Reset" /> <input
					type="submit" value="Previous" /> <input type="submit"
					value="Next" />
		     	</td>
			</tr>
		</table>
		</center>
	</form:form>
	
</body>
</html>