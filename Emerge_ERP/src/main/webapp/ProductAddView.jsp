<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Products</h1>

<form action="/ProductCtl" method ="post">
	<table>
		<tr>
			<td> <label>Enter Product Category: </label>
			<td><input type="text" name="Category"> <br>
			
		</tr>
		
		
		<tr>
			<td> <label>Enter Product Brand: </label>
			<td><input type="text" name="Brand"> <br>
			
		</tr>
		
		
		<tr>
			<td> <label>Enter Product Configuration: </label>
			<td><input type="text" name="Configuration"> <br>
			
		</tr>
		
		
		<tr>
			<td> <label>Generate Product Emerge Service Tag Number: </label>
			<td><input type="text" name="Estn"> <br>
			
		</tr>
		
		<tr>
				<td><input type="submit" value="submit"></td>
				
		</tr>


	</table>
	
</form>


</body>
</html>