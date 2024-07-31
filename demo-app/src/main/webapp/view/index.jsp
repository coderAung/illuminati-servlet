<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo | Home</title>
<jsp:include page="/css/bootstrap.jsp"></jsp:include>
</head>
<body>
	
	<jsp:include page="/component/nav-bar.jsp"></jsp:include>
	
	<section>
	<c:if test="${not empty success}">
		<div class="alert alert-success alert-dismissible fade show w-50 mx-auto" role="alert">
			<c:out value="${success}"></c:out>
			<button type="button" class="btn-close" data-bs-dismiss="alert"></button>
		</div>
		<c:remove var="success" scope="session"/>
	</c:if>
	
		<table class="table table-striped w-50 mx-auto border shadow">
			<thead>
				<tr class="align-middle">
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Role</th>
					<th class="text-end">
						<button class="btn btn-primary w-100"
						data-bs-toggle="modal" data-bs-target="#add-user-form">
						Add User</button>
					</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr class="align-middle">
						<td>
							<c:out value="${user.id}"></c:out>
						</td>
						<td>
							<c:out value="${user.name}"></c:out>
						</td>
						<td>
							<c:out value="${user.email}"></c:out>
						</td>
						<td>
							<c:out value="${user.role}"></c:out>
						</td>
						<td class="text-center">
							<a href="#" class="btn btn-outline-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<jsp:include page="/component/modal/add-user-form.jsp"></jsp:include>
	</section>
	
</body>
</html>