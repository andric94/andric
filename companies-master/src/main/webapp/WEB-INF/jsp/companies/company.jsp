<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="<c:url value="/webjars/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"/>">

    <script src="<c:url value="/webjars/jquery/3.2.1/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"/>"></script>
	
    <title>List of companies</title>

</head>
<body>

<nav class="navbar sticky-top navbar-dark bg-dark">
    <a class="navbar-brand" href="<c:url value="/companies/list"/>">List of Companies</a>
    <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-light" type="submit" data-toggle="modal" data-target="#oopsModal">Search</button>
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
        <tr>
            <td>${company.id}</td>
            <td>${company.name}</td>
            <td>${company.pib}</td>
            <td>${company.companyType}</td>
        </tr>
    </tbody>
</table>

<button type="button" class="btn btn-primary mx-2" data-toggle="modal" data-target="#oopsModal">Add new company</button>


</body>
</html>
