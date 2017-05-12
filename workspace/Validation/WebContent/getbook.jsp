<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books</title>
</head>
<body>
	<h3>Get Books</h3>
	<form action="GetBook.do" method="POST">
		<select name="isbn">
			<c:forEach var="book" items="${books}">
				<option value="${book.isbn}">${book.title}</option>
			</c:forEach>
		</select> <input type="submit" value="Get Book" />
	</form>
</body>
</html>