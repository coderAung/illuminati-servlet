<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jstl</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<form action="index.jsp" method="post" class="w-25 mx-auto mt-4 border p-3">
		<input type="text" class="mb-3 form-control" name="name" placeholder="Enter Name"/>
		<input type="number" class="mb-3 form-control" name="age" placeholder="Enter Age"/>
		<button type="submit" class="btn btn-primary">Send</button>
	</form>
	<table class="table border mt-3 w-25 mx-auto">
		<tbody>
			<tr>
				<td>Name</td>
				<td>
					<c:set var="name" value="${param.name}"></c:set>
					<c:out default="Not Defined" value="${name}"></c:out>
				</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>
					<c:set var="age" value="${param.age}"></c:set>
					<c:out default="Not Defined" value="${age}"></c:out>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>