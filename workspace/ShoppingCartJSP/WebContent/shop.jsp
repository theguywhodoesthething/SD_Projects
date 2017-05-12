<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome, Please Buy Stuff</title>
</head>
<body>
	<h2>Welcome to the Store</h2>
	<form method="post" action="addItem.do">
		<select name="product">
			<c:forEach var="product" items="${inventory}">
				<option value="${product.upc}">${product.name}</option>
			</c:forEach>
		</select> <input type="submit" value="Add to Cart">
	</form>
	<hr>
	<c:choose>
	<c:when test="${not empty addedItem}">
		${addedItem.name} added to your cart.
	</c:when>
	<c:otherwise>Item not added.</c:otherwise>
	</c:choose>

	<h3>Your Cart</h3>
	<table>
	<c:set var="cartTotal" value="0"></c:set>
		<tr>
			<th>Item</th>
			<th>Price</th>
		</tr>
		<c:forEach var="item" items="${cart}">
			<tr>
				<td>${item.name}</td>
				<td><fmt:formatNumber value="${item.price}" type="currency"></fmt:formatNumber></td>
			</tr>
	<c:set var="cartTotal" value="${cartTotal+item.price}"></c:set>
		</c:forEach>
		<tr><td>Total:</td><td><fmt:formatNumber value="${cartTotal}" type="currency"></fmt:formatNumber></td></tr>
	</table>
</body>
</html>