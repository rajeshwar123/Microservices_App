<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign up</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<style>
.error {
	color: #FF0000
}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			changeMonth : true,
			changeYear : true,
			yearRange : "1960:" + new Date()
		});
	});
	$(function() {
		$('form[id="signUpId"]').validate({
			rules : {
				firstName : 'required',
				lastName : 'required',
				gender : 'required',
				dob : 'required',
				email : {
					required : true,
					email : true
				},
				phoneno : {
					required : true,
					minlength : 10,
					maxlength : 10
				}
			},
			messages : {
				firstName : 'Please enter firstName.',
				lastName : 'please enter lastName.',
				email : 'Please enter valid email.',
				gender : 'Please enter valid email.',
				dob : 'Please enter valid email.',

				phoneno : {
					required : 'please enter phone number.',
					minlength : 'please enter valid Phone No.',
					maxlength : 'please enter valid Phone No.'
				}
			},
			submitHandler : function(form) {
				form.submit();
			}
		});
	});
</script>
</head>

<body>

	<font style="font-size: 50" color="green">${regMsg}</font>
	<h1>Create Account</h1>
	<form:form action="regUser" method="Post" modelAttribute="userRegDtls"
		id="signUpId">
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
				<td><input type="submit" value="Sign Up"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>