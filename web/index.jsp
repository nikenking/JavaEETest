<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>登录界面</title>
    <base href="http://localhost:8080/Java/">
    <link type="text/css" href="static/css/c1.css" rel="stylesheet">
</head>
<style type="text/css">
</style>
<body>
<%@ include file="/WEB-INF/pages/nav.jsp"%>
<div class="d1">
    <div class="logo">Logo</div>
    <form action="login" class="form" method="post">
        <div class="d2">
            <div class="d3">
                <input type="text" name="uname" placeholder="请输入账号" autocomplete="off">
            </div>
            <div class="d3">
                <input type="password" name="upass" placeholder="请输入密码" autocomplete="off">
            </div>
        </div>
        <div class="d2">
            <input type="hidden" value="login" name="action"/>
            <input type="submit" value="提交到服务器"/>
        </div>
    </form>
    <div>
        <form action="login" method="post" class="form">
            <div class="d4">
                <input type="hidden" value="regist" name="action"/>
                <input type="submit" value="注册"/>
            </div>
        </form>
    </div>
</div>
</body>
</html>
