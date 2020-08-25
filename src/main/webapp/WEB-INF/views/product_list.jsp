<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>

<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<h3>Product List</h3>
<a href="new_product.htm">New Product</a>
<table class="table">
<thead class="thead-dark">		<tr>
			<th>No</th>
			<th>Category</th>
			<th>Name</th>
			<th>Price</th>
			<th>Qty</th>
			</tr>
	</thead>
	<tbody>
		<c:forEach items="${product}" var="product" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${product.category.name}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.qty}</td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
