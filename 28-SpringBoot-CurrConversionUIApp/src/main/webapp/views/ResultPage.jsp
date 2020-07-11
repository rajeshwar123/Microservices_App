<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CurrencyConvert</title>
</head>

<body>

	<h1 style="color: red;text-align: center;">Converted Currency Cost</h1>
	<center>
	<table>
		<tr>
			<td>Total Converted Currency:</td>
			<td>${res.totalCostAmt} ${res.currencyTo}</td>
		</tr>
		
	</table>
	</center>
</body>

</html>