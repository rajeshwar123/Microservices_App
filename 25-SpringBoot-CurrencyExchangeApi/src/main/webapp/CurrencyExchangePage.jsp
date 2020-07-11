<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Currency Exchange Page...</title>
</head>
<body>
	<form:form action="CurrencyExchage" method="POST"
		modelAttribute="cExchangeData">

		<table>
			<tr>
				<td>Currency From:</td>
				<td><form:input path="currencyFrom"/></td>
			</tr>
			<tr>
				<td>CurrencyTo</td>
				<td><form:input path="currencyTo"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Convert"></td>
			</tr>
		</table>

	</form:form>


</body>
</html>