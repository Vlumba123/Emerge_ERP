<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.ProductBean"%>
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
		List<ProductBean> list = (List<ProductBean>) request.getAttribute("list");
		Iterator<ProductBean> it = list.iterator();
	%>

	<table>
		<tr>
			<th>Catagory</th>
			<th>Brand</th>
			<th>Configuration</th>
			<th>ESTN</th>
		</tr>
		<%
			while (it.hasNext()) {

				ProductBean bean = (ProductBean) it.next();
		%>

		<tr>
			<td><%=bean.getCategory()%></td>
			<td><%=bean.getBrand()%></td>
			<td><%=bean.getConfiguration()%></td>
			<td><%=bean.getESTN()%></td>
		</tr>

		<%
			}
		%>


	</table>

</body>
</html>