<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
  <head>
    <meta charset="UTF-8"/>
    <title>JSTLTest</title>
    <base href="http://localhost:8080/Java/">
    <link type="text/css" href="../../static/css/c1.css" rel="stylesheet">
  </head>
  <body>
  <%
    Map<String,String> map = new HashMap<>();
    map.put("1","ali");
    map.put("2","bai");
    map.put("3","tenc");
    request.setAttribute("map",map);
  %>
  <ul>
    <c:forEach items="${requestScope.map}" var="entry">
      <li><span>${entry.key}:${entry.value}</span></li>
    </c:forEach>
  </ul>
  <%--应该是Tomcat版本问题，此处不多试验--%>
  </body>
</html>
