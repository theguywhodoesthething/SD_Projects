<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lottery</title>
</head>
<body>
  <h3>Lottery Numbers</h3>
  <form action="GetNumbers.do" method="GET">
    <input type="text" name="howmany" value="6" size="2"/> 
    <input type="submit" value="Get Numbers" />
  </form>
  <c:forEach var="number" items="${listOfNumbers}">
    ${number}
  </c:forEach>  
  <br/>
</body>
</html>
