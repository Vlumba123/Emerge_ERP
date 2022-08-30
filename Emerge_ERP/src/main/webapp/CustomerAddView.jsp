<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	<h1> Welcome a new customer to our budding family</h1>
	<form action= "CustomerCtl" method="post">
	<table>
		<tr>
			<td><label>Set a Customer ID: </label></td>
			<td><input type="text" name="CustomerId"></td><br>
		</tr>
		
		<tr>
			<td><label>Customer Name:  </label></td>
			<td><input type="text" name="Cname"></td><br>
		</tr>
		
		<tr>
			<td><label>Customer Mobile No.: </label></td>
			<td><input type="text" name="Cmobile"></td><br>
		</tr>
		
		<tr>
			<td><label>Customer Address: </label></td>
			<td><input type="text" name="Caddress"></td><br>
		</tr>
		
		<tr>
			<td><label>Emerge Service Tag Package Number: </label></td>
			<td><input type="text" name="Cestn_p"></td><br>
		</tr>
		
		
		<tr>
				<td><input type="submit" value="submit"></td>
				
		</tr>
		
	</table>
	
	
	</form>
</body>
</html>