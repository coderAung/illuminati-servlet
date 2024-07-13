<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<jsp:include page="/navbar.jsp">
		<jsp:param value="forward" name="activeMenu"/>
	</jsp:include>

	<section>
		<div class="container d-flex justify-content-center mt-3">
			<div class="card">
				<div class="card-body">
					<table class="table">
						<tbody>
							<tr>
								<td>Name</td>
								<td>${ param.name }</td>
							</tr>
							<tr>
								<td>Age</td>
								<td><%= request.getParameter("age") %></td>
							</tr>
							<tr>
								<td>Email</td>
								<td><%= request.getParameter("email") %></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
</body>
</html>