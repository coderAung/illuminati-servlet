<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	
	<c:url var="index" value="/index.jsp"></c:url>
	<c:url var="test" value="/test"></c:url>
	<c:url var="redirect" value="/index.jsp">
		<c:param name="isRedirect" value="true"></c:param>
	</c:url>
	
	<div class="mt-3 w-25 mx-auto">
		<a href="${test}" class="btn w-100 btn-outline-info">Go to test</a>
	</div>
	<div class="mt-3 w-25 mx-auto">
		<a href="${redirect}" class="btn w-100 btn-outline-success">Reirect</a>
	</div>
	
	<c:if test="${'true' eq param.isRedirect }">
		<c:redirect url="/redirect-page.jsp"></c:redirect>
	</c:if>
	
	<form action="${index}" method="post" class="w-25 mx-auto mt-4 border p-3">
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
					<c:out default="---" value="${name}"></c:out>
				</td>
			</tr>
			<tr>
				<td>Age</td>
				<c:choose>
					<c:when test="${param.age lt 0}">
						<td class="bg-danger">
							<c:set var="age" value="${param.age}"></c:set>
							<c:out default="---" value="${age}"></c:out>
						</td>
					</c:when>
					<c:when test="${param.age gt 0 and param.age lt 20}">
						<td class="bg-success">
							<c:set var="age" value="${param.age}"></c:set>
							<c:out default="---" value="${age}"></c:out>
						</td>
					</c:when>
					<c:when test="${param.age gt 20}">
						<td class="bg-primary">
							<c:set var="age" value="${param.age}"></c:set>
							<c:out default="---" value="${age}"></c:out>
						</td>
					</c:when>
					<c:when test="${empty param.age}">
						<td >
							<c:set var="age" value="${param.age}"></c:set>
							<c:out default="---" value="${age}"></c:out>
						</td>
					</c:when>
				</c:choose>
			</tr>
		</tbody>
	</table>
</body>
</html>