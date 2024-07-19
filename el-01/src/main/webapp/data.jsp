<%@page import="edu.ucsy.entity.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Id</td>
			<td>${product.id}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${product.name}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${product.price} Ks</td>
		</tr>
	</table>
</body>
</html>