<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Lucky Numbers</title>
<link rel="stylesheet" href="css.css">
</head>
<body>
	<h2>Lottery Number Generator</h2>
	<h4>Please enter how many you want and a range for your numbers.</h4>
	<br>
	<form method="POST" action="GetNums.do">
		<label>How many? <input type="text" name="amount"></label> <label>Between
			0 and <input type="text" name="range">?
		</label> <input type="submit" value="Get Your Lucky Numbers">
	</form>
	<h3>Your lucky numbers are:</h3>
	<table>
		<c:forEach var="allNums" items="${luckyNums}">
			<tr>
				<c:forEach var="ball" items="${allNums}">
					<div>${ball}</div>
				</c:forEach>
			</tr>
			<br>
		</c:forEach>
	</table>
</body>
</html>