<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h2>Welcom form home</h2>
	<table class="table border w-50 mx-auto">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Role</th>
			<th></th>
		</tr>
		<c:set var="users" value="${users}"></c:set>
		<tr class="align-middle">
			<th>${users[0].id}</th>
			<th>${users[0].name}</th>
			<th>${users[0].role}</th>
			<c:set var="role" value="${users[0].role}"></c:set>
			<th>
				<c:if test="${'member' eq role}">
					<button class="btn btn-danger">Delete</button>
				</c:if>
			</th>
		</tr>
		<tr class="align-middle">
			<th>${users[1].id}</th>
			<th>${users[1].name}</th>
			<th>${users[1].role}</th>
			<c:set var="role" value="${users[1].role}"></c:set>
			<th>
				<c:if test="${'member' eq role}">
					<button class="btn btn-danger">Delete</button>
				</c:if>
				<c:if test="${'admin' eq role}">
					<button class="btn btn-success">Active</button>
				</c:if>
			</th>
		</tr>
	</table>
</body>
</html>