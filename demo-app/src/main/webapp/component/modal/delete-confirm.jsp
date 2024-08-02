<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="modal fade" id="delete-confirm">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
			</div>
			<div class="modal-body">
				<span id="msg">Are You Sure To Delete User:?</span>
			</div>
			<div class="modal-footer">
				<button class="btn btn-warning" data-bs-dismiss="modal">Cancel</button>
				
				<c:url var="deleteUrl" value="/user/delete"></c:url>
				<form action="${deleteUrl}" method="post">
					<input id="userid-input" type="text" hidden="true" name="userid" value=""/>
					<input id="username-input" type="text" hidden="true" name="username" value=""/>
					<button type="submit" class="btn btn-danger">Delete</button>				
				</form>
			</div>
		</div>
	</div>
</div>