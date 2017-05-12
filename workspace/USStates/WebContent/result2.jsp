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
				<li><a
					href="http://maps.google.com/?q=${state.latitude},${state.longitude}">${state.capital}</a></li>
				<li>${state.population}</li>
				<li>${state.bird}</li>
				<iframe width="600" height="450" frameborder="0" style="border: 0"
					src="https://www.google.com/maps/embed/v1/place?key=AIzaSyD08sTtCIqJnwTOZwL_18Jvp8TJAR741ho
    				&q=${state.latitude},${state.longitude}"> </iframe>
			</ul>

		</c:when>
		<c:otherwise>
    No state found
  </c:otherwise>
	</c:choose>

	<br />
</body>
</html>