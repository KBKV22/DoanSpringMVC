<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOMEPAGE</title>
<!-- Bootstrap core CSS -->
<link href="<c:url value='/templates/web/vendor/bootstrap/css/bootstrap.min.css'/> " rel="stylesheet" type="text/css">

<!-- Custom styles for this template -->
<link href="<c:url value='/templates/web/css/small-business.css'/> " rel="stylesheet" type="text/css">
</head>
<body>

	<%@ include file="/common/web/header.jsp"%>

	<dec:body/>
	
	<%@ include file="/common/web/footer.jsp"%>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="<c:url value='/templates/admin/vendor/jquery/jquery.min.js'/>"></script>
	<script	src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="<c:url value='/templates/admin/vendor/jquery/jquery.min.js'/>"></script>
</body>
</html>