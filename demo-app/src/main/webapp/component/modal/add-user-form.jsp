<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="modal fade" id="add-user-form">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<div class="btn btn-close" data-bs-dismiss="modal"></div>
			</div>
			<form action="#">
				<div class="modal-body">
						<input class="form-control mb-3" type="text" name="name" placeholder="Enter Name"/>
						<input class="form-control" type="email" name="email" placeholder="Enter Email"/>
				</div>
				<div class="modal-footer">
					<div href="#" class="btn btn-danger" data-bs-dismiss="modal">Cancle</div>
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
			</form>
		</div>
	</div>
</div>