<%@page import = "java.util.ArrayList" %>
<%@page import="com.product.portal.ProductClass"%>
<%@page import="java.util.Iterator"%>
<%@page import = "java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Portal</title>
</head>
<body>

<% 
ArrayList<ProductClass> table = (ArrayList)request.getAttribute("data");
%>
<div align ="center">
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Product</th>
			<th>Price</th>
			<th>Status</th>
		</tr>
		<%if(request.getAttribute("data")!=null){
			Iterator<ProductClass> iterator = table.iterator();
			
			while(iterator.hasNext()){
				ProductClass products = iterator.next();
			%>
		<tr>
			<td><%=products.getId() %></td>
			<td><%=products.getProduct() %></td>
			<td><%=products.getPrice() %></td>
			<td><%=products.getStatus() %></td>
		</tr>
		<%
		}
		}
		%>
	</table>
</div>
</body>
</html>