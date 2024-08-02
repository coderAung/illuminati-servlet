<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


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
				<form action="#" method="post">
					<input id="userid-input" type="text" hidden="true" name="userid" value=""/>
					<button type="submit" class="btn btn-danger">Delete</button>				
				</form>
			</div>
		</div>
	</div>
</div>