<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>States</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty state}">
			<ul>
				<li>${state.abbreviation}</li>
				<li>${state.name}</li>
				<li>${state.capital}</li>
				<li>${state.population}</li>
				<li>${state.bird}</li>
			</ul>
		</c:when>
		<c:otherwise>
			<p>No state found</p>
		</c:otherwise>
	</c:choose>
	<form action="GetStateData.do" method="GET">
		<button name="id" value="previous">Previous</button>
	</form>
	<form action="GetStateData.do" method="GET">
		<button name="id" value="next">Next</button>
	</form>
	<br>
</body>
</html>