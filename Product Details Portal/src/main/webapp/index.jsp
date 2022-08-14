<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Portal</title>
</head>
<body>
<div>
<style>
h2{margin-top:10%;
margin-bottom:-5%;
}
</style>
	<form method="post" action="detail">
		<table cellpadding="2" cellspacing="2" align ="center">
		<h2 align="center">Product Details</h2>
		<tr>
		<td>Id:</td>
		<td><input type="number" name="id" required></td>
		</tr>
		<tr>
		<td>Product:</td>
		<td> <input type="text" name="product" required></td>
		</tr>
		<tr>
		<td>Price:</td>
		<td> <input type="text" name="price" required></td>
		</tr>
		<tr>
		<td>Status:</td> 
		<td> <input type="text" name="status" required></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="Submit"></td>
		</tr>
		</table>
	</form>
	</div>
</body>
</html>