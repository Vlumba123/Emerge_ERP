<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.CustomerBean"%>
<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>

    <%
		List<CustomerBean> list = (List<CustomerBean>) request.getAttribute("list");
		Iterator<CustomerBean> it = list.iterator();
	%>
	<table>
		<tr>
			<th>Customer_Id</th>
			<th>Customer_Name</th>
			<th>Mobile</th>
			<th>Address</th>
			<th>Emerge Service Tag Package Number</th>
		</tr>
		<%
			while (it.hasNext()) {

				CustomerBean bean = (CustomerBean) it.next();
		%>

		<tr>
			<td><%=bean.getCustomer_Id() %></td>
			<td><%=bean.getCustomerName()%></td>
			<td><%=bean.getMobile()%></td>
			<td><%=bean.getAddress()%></td>
			<td><%=bean.getESTN_P()%></td>
			
		</tr>

		<%
			}
		%>


	</table>
	
	
</body>
</html>