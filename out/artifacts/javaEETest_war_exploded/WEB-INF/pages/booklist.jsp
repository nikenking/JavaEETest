<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<head>
    <meta charset="UTF-8"/>
    <title>JSTLTest</title>
    <base href="http://localhost:8080/Java/">
</head>
<style type="text/css">
    * {
        margin: 0;
        padding: 0;
        outline: none;
        text-decoration: none;
        border: none;
        list-style: none;
    }

    div {
        display: flex;
    }

    .book-list-content {
        width: 80%;
        margin: 100px auto;
        flex-direction: column;
    }

    .book-list-oneline-box {
        width: 100%;
        margin: 0 auto;
        background-color: rgba(255, 106, 83, 0.5);
    }

    ul li {
        margin: 0 10px;
    }
</style>
<body>
<div class="book-list-content">
    <c:forEach items="${requestScope.get('booklist')}" var="book">
        <div class="book-list-oneline-box">
            <ul>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>
    </c:forEach>
</div>
</body>
</html>
