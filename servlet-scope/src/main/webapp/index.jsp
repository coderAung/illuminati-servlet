<%@page import="edu.ucsy.scope.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope Demo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="d-flex flex-column align-items-center">
	<%
	Counter c1 = (Counter) request.getAttribute("counter");
	Counter c2 = (Counter) session.getAttribute("counter");
	Counter c3 = (Counter) application.getAttribute("counter");
	%>
	<h1>Scope Demo</h1>
	
	<table class="table border w-25">
	
		<tr>
			<td>Request Scope</td>
			<td><%= null != c1 ? c1.getNum() : 0 %></td>
		</tr>
		<tr>
			<td>Session Scope</td>
			<td><%= null != c2 ? c2.getNum() : 0 %></td>
		</tr>
		<tr>
			<td>Application Scope</td>
			<td><%= null != c2 ? c2.getNum() : 0 %></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="count" class="btn btn-danger w-100">Count Up</a>
			</td>
		</tr>
	</table>
</body>
</html>