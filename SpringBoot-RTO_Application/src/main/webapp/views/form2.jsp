<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vehicle details</title>
</head>
<body bgcolor="pink">
	<h1 style="color: red; text-align:center">***Vehicle Details***</h1>
	<form:form action="vehicleDetails" method="POST"
		modelAttribute="vehicleDtlData">
		<center>
		<table>
		<tr>
			<td>Vehicle Dtls Id :</td>
			<td><form:input path="vehicleDtlId"/></td>
		</tr>
		<tr>
		<td>Vehicle Owner Id</td>
		<%-- <td><input type="text" name="vehicleOwnerId" value="${ownrId}"  readonly="readonly"></td> --%>
		<td><form:input path="vehicleOwnerId" value="${ownrId}" readonly="ture"/></td>
		</tr>
		<tr>
			<td>VehicleType:</td>
			<td><form:select path="vehicleType" items="${typeList}"/></td>
		</tr>
		<tr>
			<td>MFG Year</td>
			<td><form:input path="mfgYear" /></td>
		</tr>
		<tr>
			<td>Vehicle Brand Name</td>
			<td><form:select path="vehicleBrand" items="${brandList}"/></td>
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