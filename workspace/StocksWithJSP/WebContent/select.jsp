<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Stocks</title>
</head>
<body>
	<form action="Stocks" method="POST">
		<c:forEach var="stock" items="${stocks}">
			<input type="radio" 
			       name="symbol" 
			       value="${stock.symbol}"/>${stock.name}<br/>
		</c:forEach>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>