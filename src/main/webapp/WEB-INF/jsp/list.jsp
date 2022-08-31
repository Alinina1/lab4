<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%--        ${currentList}--%>
        <ul>
        <c:forEach var="x" items="${currentList}">
            <li>
<%--                ${x}--%>
                <c:out value="${x}"/>
            </li>
        </c:forEach>
        </ul>
    </body>
</html>
