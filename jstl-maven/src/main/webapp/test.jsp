<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<table class="table border table-striped shadow mt-3 mx-auto w-25">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="p" items="${products}">
				<tr>
					<td>${p.id}</td>
					<td>${p.name}</td>
					<td>${p.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>