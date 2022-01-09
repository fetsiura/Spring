<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="i" begin="0" end="${rows}">
        <c:choose>
            <c:when test="${i == 0}">
                <tr>
                    <th>x</th>
                    <c:forEach var="j" begin="1" end="${cols}">
                        <th>${j}</th>
                    </c:forEach>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td>${i}</td>
                    <c:forEach var="j" begin="1" end="${cols}">
                        <td>${i * j}</td>
                    </c:forEach>
                </tr>
            </c:otherwise>
        </c:choose>
    </c:forEach>
</table>
</body>
</html>
