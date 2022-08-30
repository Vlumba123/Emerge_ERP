<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="OrderCtl" method="post">
		<table align="center">

			<h2 align="center">ORDER</h2>
			<tr>
				<th>CustomerName</th>
				<td><input type="text" name="Cname"></td>
			</tr>
			<tr>
				<th>Mobile</th>
				<td><input type="text" name="Cmobile"></td>
			</tr>
			<tr>
				<th>CustomerAddress</th>
				<td><input type="text" name="Caddress"></td>
			</tr>
			<th>Requirement</th>
			<td><input type="text" name="Crequirement"></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
				<a href="ProductListCtl">List</a>
			</tr>
		</table>
	</form>
</body>
</html>
</body>
</html>