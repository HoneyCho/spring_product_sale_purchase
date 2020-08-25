<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>

<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="container pt-4">
	<div class="row">
		<div class="col-sm-12">
<form:form action="new_purchase.htm" method="post" modelAttribute="purchase">

<label>Product </label>
<form:select path="product.id" class="form-control">
	<c:forEach items="${productList}" var="p">
	<form:option value="${p.id }">${p.name }</form:option>
	</c:forEach>
</form:select><br>
<label>Qty</label>
<form:input path="qty" class="form-control"/> <br>
<input type="submit" value="Save"class="btn btn-primary" />
</form:form>
</div>
</div>
</div>

