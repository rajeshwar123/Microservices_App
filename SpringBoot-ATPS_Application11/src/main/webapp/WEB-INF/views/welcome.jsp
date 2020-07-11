<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><tiles:insertAttribute name="title" /></title>
<style>
/* table, td, th {
	border: 1px solid black;
}
 */
table {
	width: 100%;
	height: 100%;
}
</style>

</head>
<body>
	<table border="1">
		<tr bgcolor="pink" height="10%">
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr height="80%">
			<td width="50%" bgcolor="cyan"><tiles:insertAttribute
					name="images" /></td>
			<td width="50%" bgcolor="cyan"><tiles:insertAttribute
					name="body" /></td>
		</tr>
		<tr height="10%" bgcolor="pink">
			<td colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</body>
</html>