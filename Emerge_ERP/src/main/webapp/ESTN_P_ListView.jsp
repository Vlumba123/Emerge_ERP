<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.EstnPackageBean"%>
<%@page import="java.util.List"%>





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ESTN_P List</title>
</head>
<body>
<h1> List of Emerge Service Tag Packages</h1>


<%
		List<EstnPackageBean> list = (List<EstnPackageBean>) request.getAttribute("list");
		Iterator<EstnPackageBean> it = list.iterator();
	%>
	<table>
		<tr>
			<th>Configuration</th>
			<th>Emerge Service Tag Number</th>
			<th>Emerge Service Tag Package Number</th>
			
		</tr>
		<%
			while (it.hasNext()) {

				EstnPackageBean bean = (EstnPackageBean) it.next();
		%>

		<tr>
			<td><%=bean.getConfiguration() %></td>
			<td><%=bean.getESTN()%></td>
			<td><%=bean.getESTN_P()%></td>

			
		</tr>

		<%
			}
		%>


	</table>
	




</body>
</html>