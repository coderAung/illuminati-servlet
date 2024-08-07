<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url var="home" value="/home"></c:url>
<c:url var="profile" value="/profile"></c:url>
<c:url var="login" value="/login"></c:url>

<div class="py-3 px-4 d-flex justify-content-between bg-white border shadow mb-4 sticky-top">
		<div class="fs-4">User Management</div>
		<div class="d-flex justify-content-evenly align-items-center w-25">
			<a href="${home}">HOME</a>
			<a href="${profile}">PROFILE</a>
			<a href="${login}">LOGIN</a>
			<a href="#">LOGOUT</a>
		</div>
</div>