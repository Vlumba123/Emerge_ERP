<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.UserBean"%>
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
		List<UserBean> list = (List<UserBean>) request.getAttribute("list");
		Iterator<UserBean> it = list.iterator();
	%>
	<table>
		<tr>
			
			<th>User ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Role ID</th>
			
		</tr>
		<%
			while (it.hasNext()) {

				UserBean bean = (UserBean) it.next();
		%>

		<tr>
			
			<td><%=bean.getUserId()%></td>
			<td><%=bean.getFirstName()%></td>
			<td><%=bean.getLastName()%></td>
			<td><%=bean.getEmail()%></td>
			<td><%=bean.getPassword()%></td>
			<td><%=bean.getRoleId()%></td>
			
		</tr>

		<%
			}
		%>


	</table>


</body>
</html>