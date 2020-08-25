<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>

<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="container pt-4">
	<div class="row">
		<div class="col-sm-12">
<h3>New Cateogry Form</h3>
<form:form action="new_category.htm" method="post" modelAttribute="category">
<label>Name</label>
<form:input path="name" class="form-control" /> <br>
<input type="submit" value="Save" class="btn btn-primary" />
</form:form>
</div>
</div>
</div>
