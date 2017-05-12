<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>US Presidents</title>
<link rel="stylesheet" href="/Presidents/president.css">
</head>
<body>

	<div>
		<h1 class="title">US Presidents Gallery</h1>
	</div>

	<form method="POST" action="GetPresident.do">
		<c:forEach var="president" items="${matchedList}">
		<img src="${president.picture}" height="200" width="150"></img><br>
			<button name="term" value="${president.presidentNumber}">${president.firstName}
				${president.lastName}</button>
			<br>
		</c:forEach>
	</form>
</body>
</html>