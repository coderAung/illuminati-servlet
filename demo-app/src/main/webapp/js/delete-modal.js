
document.addEventListener("DOMContentLoaded", () => {
	document.querySelectorAll(".delete-btn")
	.forEach(d => {
		d.addEventListener("click", () => {
			const userid = d.getAttribute("userid")
			const username = d.getAttribute("username")
			
			const msg = document.querySelector("#msg")
			const text = `Are You Sure To Delete User : '${username}'?`
			
			msg.innerHTML = text
			
			const useridInput = document.getElementById("userid-input")
			useridInput.value = userid
			
			const usernameInput = document.getElementById("username-input")
			usernameInput.value = username
			
			console.log(useridInput.value)
			const modal = new bootstrap.Modal("#delete-confirm")
			modal.show()
		})
	})
})