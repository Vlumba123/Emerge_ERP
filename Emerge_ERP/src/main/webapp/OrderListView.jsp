<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.OrderBean"%>
<%@page import="java.util.List"%>





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		List<OrderBean> list = (List<OrderBean>) request.getAttribute("list");
		Iterator<OrderBean> it = list.iterator();
	%>
	<table>
		<tr>

			<th>CustomerName</th>
			<th>Mobile</th>
			<th>Address</th>
			<th>Requirements</th>
		</tr>
		<%
			while (it.hasNext()) {

				OrderBean bean = (OrderBean) it.next();
		%>

		<tr>

			<td><%=bean.getCustomerName()%></td>
			<td><%=bean.getMobile()%></td>
			<td><%=bean.getCustomerAddress()%></td>
			<td><%=bean.getRequirement()%></td>

		</tr>

		<%
			}
		%>


	</table>


</body>
</html>