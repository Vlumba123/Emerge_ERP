<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new User</title>
</head>
<body>

<form action="/UserCtl" method="post">

	<table>
		<tr>
			<td> <label>Generate a User ID: </label> </td>
			<td> <input type= "text" name="UserId"><br>
		</tr>
		
		
		<tr>
			<td> <label>Enter First Name of User: </label> </td>
			<td> <input type= "text" name="Fname"><br>
		</tr>
		
		
		<tr>
			<td> <label>Enter Last Name of User: </label> </td>
			<td> <input type= "text" name="Lname"><br>
		</tr>
		
		<tr>
			<td> <label>Enter Last Name of User: </label> </td>
			<td> <input type= "text" name="Lname"><br>
		</tr>
		
		<tr>
			<td> <label>Enter Last Name of User: </label> </td>
			<td> <input type= "text" name="Lname"><br>
		</tr>
		
		
		<tr>
			<td> <label>Enter Email of User: </label> </td>
			<td> <input type= "text" name="Email"><br>
		</tr>
		
		<tr>
			<td> <label>Set a Password for this User: </label> </td>
			<td> <input type= "text" name="Password"><br>
		</tr>
		
		<tr>
			<td> <label>Set a RoleID for this User(1:Admin, 2:CCE, 3:Customer): </label> </td>
			<td> <input type= "text" name="RoleId"><br>
		</tr>
		
		
		
		<tr>
				<td><input type="submit" value="submit"></td>
				
		</tr>
	
	
	
	</table>





</form>

</body>
</html>