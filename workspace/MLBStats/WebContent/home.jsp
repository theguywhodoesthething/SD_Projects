<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2016 MLB Stats</title>
</head>
<h1>2016 Major League Baseball Statistics</h1>
<body>
	<form method="GET" action="welcome.do">
		<c:forEach var="team" items="${teams}">
			${team}
			<br>
		</c:forEach>
	</form>
</body>
</html>
