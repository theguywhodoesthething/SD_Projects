<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>Stocks</title>
</head>
<body>
	<form action="Stocks" method="POST">
		<c:forEach var="stock" items="${applicationScope.stockDAO.allStocks}">
			<input type="radio" name="symbol" value="${stock.symbol}" />${stock.name}<br />
		</c:forEach>
		<input type="submit" value="Submit" />
	</form>
	<c:if test="${! empty(sessionScope.stocks)}">
		<table border="0">
			<tr>
				<th>symbol</th>
				<th>name</th>
				<th>price</th>
				<th>open</th>
				<th>trend</th>
			</tr>
			<c:forEach var="stock" items="${sessionScope.stocks}">
				<tr>
					<td>${stock.symbol}</td>
					<td>${stock.name}</td>
					<td><fmt:formatNumber value="${stock.price}" type="currency" />
					</td>
					<td><fmt:formatNumber value="${stock.openPrice}"
							type="currency" /></td>
					<c:choose>
						<c:when test="${stock.price < stock.openPrice}">
							<td><img src="images/downarrow.png" /></td>
						</c:when>
						<c:otherwise>
							<td><img src="images/uparrow.png" /></td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>