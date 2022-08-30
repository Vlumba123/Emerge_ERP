<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.InventoryBean"%>
<%@page import="java.util.List"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory List</title>
</head>
<body>
Complete list of Inventory held


<%
		List<InventoryBean> list = (List<InventoryBean>) request.getAttribute("list");
		Iterator<InventoryBean> it = list.iterator();
	%>
	<table>
		<tr>
			<th>Product Category</th>
			<th>Product Sub-Category</th>
			<th>Specification</th>
			<th>Warranty</th>
			<th>Brand</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Order Value (INR)</th>
			<th>Vendor Name</th>
			<th>Vendor Address</th>
		</tr>
		<%
			while (it.hasNext()) {

				InventoryBean bean = (InventoryBean) it.next();
		%>

		<tr>
			<td><%=bean.getProductCategory() %></td>
			<td><%=bean.getProductSubCategory()%></td>
			<td><%=bean.getSpecification()%></td>
			<td><%=bean.getWarranty()%></td>
			<td><%=bean.getBrand()%></td>
			<td><%=bean.getPrice() %></td>
			<td><%=bean.getQuantity()%></td>
			<td><%=bean.getOrderValue()%></td>
			<td><%=bean.getVendorName()%></td>
			<td><%=bean.getVendorAddress()%></td>			
		</tr>

		<%
			}
		%>


	</table>
	


</body>
</html>