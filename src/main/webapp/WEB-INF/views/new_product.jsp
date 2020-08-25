<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>

<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="container pt-4">
	<div class="row">
		<div class="col-sm-12">
<h3>New Product Form</h3>
<form:form action="new_product.htm" method="post" modelAttribute="product">
<label>Name</label>
<form:input path="name" class="form-control"/> <br>
<label>Category</label>
<form:select path="category.id" class="form-control">
	<c:forEach items="${categoryList }" var="cate">
	<form:option value="${cate.id }">${cate.name }</form:option>
	</c:forEach>
	
</form:select><br>
<label>Price</label>
<form:input path="price" class="form-control"/> <br>
<label>Qty</label>
<form:input path="qty" class="form-control"/> <br>

<input type="submit" value="Save"class="btn btn-primary" />
</form:form>
</div>
</div>
</div>

