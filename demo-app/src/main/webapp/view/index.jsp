<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo | Home</title>
<jsp:include page="/css/bootstrap.jsp"></jsp:include>
<c:url var="jquery" value="/js/jquery.min.js"></c:url>
<script type="text/javascript" src="${jquery}"></script>
</head>
<body>
	
	<jsp:include page="/component/nav-bar.jsp"></jsp:include>
	
	<section>
	<c:if test="${not empty alert}">
		
		<c:choose>
			<c:when test="${'ADDED' eq alert.type.toString()}">
				<c:set var="alertColor" value="alert-success"></c:set>
			</c:when>
			<c:when test="${'DELETED' eq alert.type.toString()}">
				<c:set var="alertColor" value="alert-danger"></c:set>
			</c:when>
		</c:choose>
	
		<div class="alert ${alertColor} alert-dismissible fade show w-50 mx-auto" role="alert">
			<c:out value="${alert.message}"></c:out>
			<button type="button" class="btn-close" data-bs-dismiss="alert"></button>
		</div>
		<c:remove var="alert" scope="session"/>
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
							<button userid="${user.id}" username="${user.name}" type="button" class="btn btn-outline-danger delete-btn">Delete</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<jsp:include page="/component/modal/add-user-form.jsp"></jsp:include>
		<jsp:include page="/component/modal/delete-confirm.jsp"></jsp:include>
	</section>
	
</body>
<c:url var="deleteModalJs" value="/js/delete-modal.js"></c:url>
<script type="text/javascript" src="${deleteModalJs}"></script>
<script type="text/javascript">
	$(document).ready(() => {
		console.log("Hello Jquery")
	})
</script>
</html>