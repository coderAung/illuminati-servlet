<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/css/bootstrap.jsp"></jsp:include>

</head>
<body>
	<jsp:include page="/component/nav-bar.jsp"></jsp:include>
	
	
	
	<section>
		<form class="w-50 mx-auto border shadow rounded">
			<h1 class="h4 bg-primary rounded-top p-3 text-white">Login Here</h1>
			<div class="px-4 pb-3">
				<label for="email" class="mb-1">Email</label>
				<input id="email" type="email" name="email" class="form-control mb-3 w-50"/>
				<label for="password" class="mb-1">Password</label>
				<input id="password" type="password" name="password" class="form-control mb-3 w-50"/>
				<button class="btn btn-primary">Login</button>
			</div>
		</form>
	</section>
</body>
</html>