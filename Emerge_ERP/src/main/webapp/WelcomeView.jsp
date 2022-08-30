<%@page import="emerge.bean.LoginBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="emerge.bean.UserBean"%>
<%@page import="emerge.bean.RoleBean"%>
<%@page import="emerge.controller.CustomerListCtl"%>
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

	<jsp:useBean id="RoleBean" scope="request" class="emerge.bean.RoleBean"></jsp:useBean>

	<form action="WelcomeCtl" method="post">
		<h1>WELCOME</h1>

		<%
			UserBean bean = (UserBean) session.getAttribute("name");
			if (bean.getRoleId() == 1) {
		%>

		<a href="CustomerListCtl">Customer List</b></a> |
		<a href="EstnPackageListCtl">EstnPackage List</b></a> | <a
			href="InvetoryListCtl">Inventory List</b></a> | <a
			href="MyEmergePcListCtl">MyEmergePc List</b></a> |
			 <a href="OrderListCtl">Order List</b>
		</a> | <a href="ProductListCtl">Product List</b></a> |
		
		<a href="CustomerCtl">Add a new Customer</a>
		<a href="ESTN_AddPackageView.jsp">Add a new ESTN - Package</a>
		<a href="InventoryAddView.jsp">Add new Product to the inventory</a>
		<a href="OrderAddView.jsp">Add a new Order</a>
		<a href="ProductAddView.jsp">Add a new Product</a>
		<%
			}
		%>
		
		<%
			UserBean bean1 = (UserBean) session.getAttribute("name");
			if (bean.getRoleId() == 2) {
		%>

		<a href="CustomerListCtl">Customer List</b></a> | <a
			href="EstnPackageListCtl">EstnPackage List</b></a> | <a
			href="MyEmergePcListCtl">MyEmergePc List</b></a> |
			 <a href="OrderListCtl">Order List</b>
		</a> | <a href="ProductListCtl">Product List</b></a> |
		<%
			}
		%>
		
		
	
</body>
</html>