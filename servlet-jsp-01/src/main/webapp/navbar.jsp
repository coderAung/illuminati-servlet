<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container-fluid d-flex justify-content-between align-items-center py-2 px-3 bg-white shadow">
<%
	var activeMenu = request.getParameter("activeMenu");
%>
		<div>
			<h3>JSP Demo</h3>
		</div>
		<div class="w-25 d-flex justify-content-between">
			<span class="btn border <%= "home".equals(activeMenu) ? "bg-warning" : "" %>">
				<a class="text-decoration-none" href="index">Home</a>
			</span>
			<span class="btn border <%= "include".equals(activeMenu) ? "bg-warning" : "" %>">
				<a class="text-decoration-none" href="index?action=include">Include</a>
			</span>
			<span class="btn border <%= "forward".equals(activeMenu) ? "bg-warning" : "" %>">
				<a class="text-decoration-none" href="index?action=forward">Forward</a>
			</span>
		</div>
	</div>