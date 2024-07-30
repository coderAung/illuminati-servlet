<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<table class="table table-striped w-50 mx-auto border shadow">
			<thead>
				<tr class="align-middle">
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th class="text-end">
						<button class="btn btn-primary w-100"
						data-bs-toggle="modal" data-bs-target="#add-user-form">
						Add User</button>
					</th>
				</tr>
			</thead>
			<tbody>
				<tr class="align-middle">
					<td>1</td>
					<td>Aung Aung</td>
					<td>aung@gmail.com</td>
					<td class="text-center">
						<a href="#" class="btn btn-outline-danger">Delete</a>
					</td>
				</tr>
			</tbody>
		</table>
		<jsp:include page="/component/modal/add-user-form.jsp"></jsp:include>
	</section>
	
</body>
</html>