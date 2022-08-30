<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Iventory</title>
</head>
<body>

<form action="InventoryCtl" method="post">
	<table>
		<tr>
			<td> <label>Enter Product category: </label>
			<td> <input type="text" name="ProductCategory"><br>
		
		</tr>
	
		<tr>
			<td> <label>Enter Product sub-category: </label>
			<td> <input type="text" name="ProductSubCategory"><br>
		
		</tr>
		
		
		<tr>
			<td> <label>Enter Product specification: </label>
			<td> <input type="text" name="Specificaton"><br>
		
		</tr>
		
		<tr>
			<td> <label>Enter Product Warranty: </label>
			<td> <input type="text" name="Warranty"><br>
		
		</tr>
	
			
		<tr>
			<td> <label>Enter Product Brand: </label>
			<td> <input type="text" name="Brand"><br>
		
		</tr>
		
		
		
		<tr>
			<td> <label>Enter Product Price: </label>
			<td> <input type="text" name="Price"><br>
		
		</tr>
		
		<tr>
			<td> <label>Enter Quantity Bought: </label>
			<td> <input type="text" name="Quantity"><br>
		
		</tr>
		
		<tr>
			<td> <label>Product Order Value: </label>
			<td> <input type="text" name="OrderValue"><br>
		
		</tr>
		
		<tr>
			<td> <label>Enter Vendor Name: </label>
			<td> <input type="text" name="Vendorname"><br>
		
		</tr>
		
		<tr>
			<td> <label>Enter Vendor Address: </label>
			<td> <input type="text" name="Vendoraddress"><br>
		
		</tr>
		
		<tr>
				<td><input type="submit" value="submit"></td>
				
			</tr>
	
	
	
	</table>


</form>
</body>
</html>