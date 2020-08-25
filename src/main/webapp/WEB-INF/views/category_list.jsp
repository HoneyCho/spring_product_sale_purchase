<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>

<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category List</title>
</head>
<body>
	<h3>Category List</h3>
	<a href="new_category.htm">New Category</a>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th>No</th>
				<th>Category Name</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${categoryList}" var="cate" varStatus="row">
				<tr>
					<td>${row.count}</td>
					<td>${cate.name }</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>