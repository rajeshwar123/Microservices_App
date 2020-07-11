<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Unlock Account</title>
</head>
<body>

<h1 style="text-align: center;">Unlock Account Here</h1>
<form:form action="unlockUser" method="POST" modelAttribute="unlockUsrData">
      ${unlockErrMsg}
	<table>
		<tr>
			<td>Email:</td>
			<td><form:input path="email"   value="${emailId}" readonly="true"/></td>
		</tr>
		<tr>
			<td>Temporary Password:</td>
			<td><form:input path="tempPwd" /></td>
		</tr>
		
		<tr>
			<td>Choose New Password:</td>
			<td><form:input path="newPwd" /></td>
		</tr>
		
		<tr>
			<td>Confirm New Password:</td>
			<td><form:input path="confirmPwd" /></td>
		</tr>	
		<tr>
		<td><input type="submit" value="Un-Lock"></td>
		</tr>
	</table>
</form:form>
</body>
</html>