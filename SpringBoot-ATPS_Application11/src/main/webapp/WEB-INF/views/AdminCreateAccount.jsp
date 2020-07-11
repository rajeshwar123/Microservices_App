<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Account</h1>
	<form:form action="regAdmin" method="Post" modelAttribute="adminRegDtls">
		<table>
			<tr>
				<td>First Name :</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Phone No :</td>
				<td><form:input path="phoneno" /></td>
			</tr>

			<tr>
				<td>Dob :</td>
				<td><form:input path="dob" id="datepicker" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="gender" value="male" />Male 
				<form:radiobutton path="gender" value="female" />Female</td>
			</tr>
			<tr>
				<td>Role :</td>
				<td><form:select path="role" items="${rollList}"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Sign Up"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>