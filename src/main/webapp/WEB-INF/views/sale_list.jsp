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
		<c:forEach items="${sale}" var="sale" varStatus="row">
			<tr>
				<td>${row.count }</td>
			<td>${sale.product.category.name }</td>
			<td>${sale.product.name}</td>
						<td>${sale.product.price}</td>
			
				<td>${sale.qty}</td>
				<td>${sale.qty*sale.product.price}
			</tr>
		</c:forEach>
	</tbody>
</table>
