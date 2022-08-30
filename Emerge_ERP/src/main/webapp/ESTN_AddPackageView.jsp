<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add ESTN Packages</title>
</head>
<body>
<h1> Add Emerge Service Tags to Emerge Service Tag Packages</h1>

	<form action="EstnPackageCtl" method="post">
		<table>
			<tr>
				<td> <label> Enter Configuration:  </label></td>
				<td> <input type= "text" name="Config"></td>
			</tr>
			
						<tr>
				<td> <label> Generate an Emerge Service Tag Number:  </label></td>
				<td> <input type= "text" name="estn"></td>
			</tr>
			
						<tr>
				<td> <label> Pick an Emerge Service Tag Package:   </label></td>
				<td> <input type= "text" name="estn_p"></td>
			</tr>
		
		
		
			<tr>
				<td><input type="submit" value="submit"></td>
				
			</tr>
		</table>





	</form>
</body>
</html>