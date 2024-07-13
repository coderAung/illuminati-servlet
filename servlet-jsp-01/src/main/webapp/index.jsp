<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<%
	var action = request.getParameter("action");
	String activeMenu = "";
	if (null == action) {
		activeMenu = "home";
	} else {
		activeMenu = "include";
	}
	%>
	<jsp:include page="/navbar.jsp">
		<jsp:param value="<%=activeMenu%>" name="activeMenu" />
	</jsp:include>

	<section>
		<div class="container d-flex justify-content-center mt-3">

			<%
			if (null != action && "include".equals(action)) {
			%>
			<jsp:include page="/include.jsp"></jsp:include>

			<%
			} else if (null != action && "forward".equals(action)) {
			%>
			<jsp:forward page="/forward.jsp">
				<jsp:param value="Aung Aung" name="name"/>
				<jsp:param value="22" name="age"/>
				<jsp:param value="aung@gmail.com" name="email"/>
			</jsp:forward>
			<%
			} else {
			%>
			<a href="index?action=include" class="btn btn-danger me-3">include</a>
			<a href="index?action=forward" class="btn btn-primary">forward</a>
			<%
			}
			%>
		</div>
	</section>
</body>
</html>