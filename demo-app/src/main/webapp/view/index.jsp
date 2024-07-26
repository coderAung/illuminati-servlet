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
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Aung Aung</td>
					<td>aung@gmail.com</td>
				</tr>
			</tbody>
		</table>
	</section>
	
</body>
</html>