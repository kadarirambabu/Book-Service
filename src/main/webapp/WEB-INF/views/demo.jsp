<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sample JSP Page</title>
</head>
<body>
         <h1>Hello<h1>
           <c:forEach items="${bookList}" var="book" >
                         ${book.Isbn}
                         ${book.name}
                         ${book.author}
             </c:forEach>

</body>
</html>
