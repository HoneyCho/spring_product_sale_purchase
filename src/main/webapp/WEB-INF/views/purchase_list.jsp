<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>

<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<table class="table">
	<thead class="thead-dark">
		<tr>
			<th>No</th>
			<th>Category</th>
			<th>Name</th>
			<th>Price</th>
			<th>Qty</th>
			<th>Total</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${purchase}" var="p" varStatus="row">
			<tr>
				<td>${row.count }</td>
			<td>${p.product.category.name }</td>
			<td>${p.product.name}</td>
						<td>${p.product.price}</td>
			
				<td>${p.qty}</td>
				<td>${p.qty*p.product.price}
			</tr>
		</c:forEach>
	</tbody>
</table>
