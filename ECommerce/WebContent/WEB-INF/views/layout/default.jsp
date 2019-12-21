<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title><tiles:getAsString name="title"></tiles:getAsString></title>

<!-- Bootstrap core CSS -->

<link rel="stylesheet"
	href="<c:url value='/static/style/bootstrap/css/bootstrap.min.css'></c:url>" />
<link rel="stylesheet"
	href="<c:url value='/static/mystyle.css'></c:url>" />


</head>
<body>
	<div>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>

	<div role="main" class="container main_div">
		<tiles:insertAttribute name="content"></tiles:insertAttribute>
	</div>
	<div>
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
	<script
		src="<c:url value='/static/style/bootstrap/js/jquery.min.js' />"
		></script>
	<script
		src="<c:url value='/static/style/bootstrap/js/popper.min.js' />"></script>
	<script src=""></script>
<script
		src="<c:url value='/static/style/bootstrap/js/bootstrap.min.js' />"></script>
	<script src=""></script>

	<!-- Custom JavaScript -->


</body>
</html>