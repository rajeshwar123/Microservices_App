<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Currency Conversion Page...</title>
</head>
<body>

<h1 style="color: red;text-align: center;">...Currency Conversion... </h1>
	<form:form action="convertCurrency" method="POST" modelAttribute="cConvertData">
		<center>
		<table border="1">

			<tr>
				<td>Currency Value</td>
				<td><form:input path="currencyVal" /></td>
			</tr>
			<tr>
				<td>Currency From:</td>
				<td><form:select path="currencyFrom" items="${cList}" /></td>
			</tr>
			<tr>
				<td>CurrencyTo</td>
				<td><form:select path="currencyTo"  items="${cList2}"/></td>
			</tr>
			<tr>
				<td><input type="submit"  value="Convert"></td>
			</tr>
		</table>
		</center>
	</form:form>
</body>
</html>