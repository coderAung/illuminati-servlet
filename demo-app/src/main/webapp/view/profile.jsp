<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo | Profile</title>
<jsp:include page="/css/bootstrap.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/component/nav-bar.jsp"></jsp:include>
	
	<div class="container-fluid d-flex">
		<div class="card mx-auto w-50">
			<div class="card-header">Profile</div>
			<div class="row">
				<div class="col-4 d-flex justify-content-center align-items-center">
					<img alt="profile image" src="" class="image-fluid">
				</div>
				<div class="col-7">
					<div class="card-body">
						<table class="table">
							<tbody>
								<tr>
									<th>ID</th>
									<th>:</th>
									<th>1</th>
								</tr>
								<tr>
									<th>Name</th>
									<th>:</th>
									<th>Aung Aung</th>
								</tr>
								<tr>
									<th>Email</th>
									<th>:</th>
									<th>aung@gmail.com</th>
								</tr>
								<tr>
									<th>Role</th>
									<th>:</th>
									<th>ADMIN</th>
								</tr>
								<tr>
									<td colspan="3">
										<a href="#" class="btn btn-warning w-100">Edit Profile</a>
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<a href="#" class="btn btn-primary w-100">Change Password</a>
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<a href="#" class="btn btn-danger w-100">Delete Account</a>
									</td>
								</tr>
							</tbody>
						</table>						
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>