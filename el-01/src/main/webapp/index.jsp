<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El Expression</title>
</head>
<body>
	<%
	request.setAttribute("n1", 10);
	request.setAttribute("n2", 20);
	%>
	<h1>Hello El</h1>
	<a href="data">Go To Data</a>
	<table>
		<tr>
			<td>Sum</td>
			<td>${n1 + n2}</td>
		</tr>
		<tr>
			<td>Sub</td>
			<td>${n1 - n2}</td>
		</tr>
		<tr>
			<td>Mul</td>
			<td>${n1 * n2}</td>
		</tr>
		<tr>
			<td>Div</td>
			<td>${n1 div n2}</td>
		</tr>
		<tr>
			<td>Modulas</td>
			<td>${n1 mod n2}</td>
		</tr>
	</table>
	<hr />
	<table>
		<tr>
			<td colspan="2">n1 = ${n1}, n2 = ${n2}</td>
		</tr>
		<tr>
			<td>Equal</td>
			<td>${n1 eq n2 ? "n1 And n2 Are Equal":"n1 And n2 Are Not Equal"}</td>
		</tr>
		<tr>
			<td>Greater Than</td>
			<td>${n1 gt n2 ? "n1 is Greater than n2":"n1 is Not Greater Than n2"}</td>
		</tr>
		<tr>
			<td>Less Than</td>
			<td>${n1 lt n2 }</td>
		</tr>
		<tr>
			<td>Greater Than or Equal</td>
			<td>${n1 ge n2 }</td>
		</tr>
		<tr>
			<td>Less Than or Equal</td>
			<td>${n1 le n2}</td>
		</tr>
		<tr>
			<td>Not Equal</td>
			<td>${n1 ne n2}</td>
		</tr>
	</table>
	<hr />
	<% String str = null; %>
	<span>Str = ${empty str}</span>
</body>
</html>