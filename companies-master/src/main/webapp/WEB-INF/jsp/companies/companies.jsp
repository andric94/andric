<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="<c:url value="/webjars/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"/>">

    <script src="<c:url value="/webjars/jquery/3.2.1/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript">
    $(document).ready(function() {
    	  $("#formButton").click(function() {
    	    $("#form1").toggle();
    	  });
    	});
    </script>
    <title>List of companies</title>

</head>
<body>

<nav class="navbar sticky-top navbar-dark bg-dark">
    <a class="navbar-brand" href="<c:url value="/companies/list"/>">List of Companies</a>
    <form class="form-inline" action="get">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" name="srch" aria-label="Search">
        <button class="btn btn-outline-light" data-toggle="modal" data-target="#oopsModal">Search</button>
    </form>
</nav>

<table class="table table-striped table-hover">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">PIB</th>
        <th scope="col">Company Type</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${companies}" var="comp">
        <tr>
            <td>${comp.id}</td>
            <td><c:out value="${comp.name}"/></td>
            <td><c:out value="${comp.pib}"/></td>
            <td><c:out value="${comp.companyType}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<button type="button" class="btn btn-primary mx-2" id="formButton" data-toggle="modal" data-target="#oopsModal">Add new company</button>
	<form id="form1" style="display:none" action="add" method= "post">
	<input style="margin: 0.5rem" type="text" name= "ncId" placeholder= "NewCompany ID"><br>
	<input style="margin: 0.5rem" type="text" name= "ncName" placeholder= "NewCompany Name"><br>
	<input style="margin: 0.5rem" type="text" name= "ncPib" placeholder= "NewCompany PIB"><br>
	<input style="margin: 0.5rem" type="text" name= "ncType" placeholder= "NewCompany Type"><br>
	<input style="margin: 0.5rem" type= "submit">
	</form>

</body>
</html>
