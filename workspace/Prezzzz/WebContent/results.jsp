<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presidents of the USA</title>
</head>
<body>
	<h1>${president.presidentNumber}. ${president.firstName}
		${president.middleName} ${president.lastName}</h1><br>
	<img src="${president.picture}" height="200" width="150"></img>
	<br>
	<p>Was president from ${president.dateBegin} to
		${president.dateEnd}</p>
	<p>${president.funFact}</p>
	<form action="GetPresidents.do" method="POST">
		<button name="term" value="${president.presidentNumber-1}">Previous</button>
		<button name="term" value="${president.presidentNumber+1}">Next</button>
	</form>
	<br>
	<form action="GetPresidents.do" method="GET">
		<button name="Gallery">Return to Gallery</button>
	</form>
</body>
</html>