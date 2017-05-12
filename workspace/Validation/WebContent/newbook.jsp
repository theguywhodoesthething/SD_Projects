<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books</title>
</head>
<body>
	<h3>Add Book</h3>
	<form:form action="AddBook.do" modelAttribute="book">
		<table>
			<tr>
				<td>ISBN:</td>
				<td><form:input path="isbn" /></td>
				<td><form:errors path="isbn" /></td>
			</tr>
			<tr>
				<td>Title:</td>
				<td><form:input path="title" /></td>
				<td><form:errors path="title" /></td>
			</tr>
			<tr>
				<td>Author:</td>
				<td><form:input path="author" /></td>
				<td><form:errors path="author" /></td>
			</tr>
			<tr>
				<td>Year Published:</td>
				<td><form:input path="yearPublished" /></td>
				<td><form:errors path="yearPublished" /></td>
			</tr>
			<tr>
				<td>Books Sold:</td>
				<td><form:input path="totalSold" /></td>
				<td><form:errors path="totalSold" /></td>
			</tr>
		</table>
		<input type="submit" value="Add Book" />
	</form:form>
</body>
</html>