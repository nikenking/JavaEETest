<%--
  Created by IntelliJ IDEA.
  User: Gabe
  Date: 2020/10/26
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.List"%>
<%@ page import="com.dell.pojo.User"%>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>El测试</title>
    <base href="http://localhost:8080/Java/">
  </head>
  <body>

    <% List<User> users = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
    users.add(new User("C"+String.valueOf(i+1),String.valueOf(i)));
    }
    %>
    <%for (User user : users) {%>
    <tr>
      <td><%="username="+user.getName()%></td>
      <td><%="userpassword="+user.getPassword()%></td>
    </tr>
  <%}%>
  </body>
</html>
