<%--
  Created by IntelliJ IDEA.
  User: Gabe
  Date: 2020/11/2
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传于下载</title>
</head>
<style type="text/css">
    body {
        background-color: #333333;
    }

    * {
        margin: 0;
        padding: 0;
        outline: none;
        text-decoration: none;
        border: none;
        list-style: none;
        color: #333333;
    }

    div {
        display: flex;
    }

    .bigbox {
        width: 300px;
        height: 200px;
        margin: 100px auto;
        border: 2px grey solid;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }

    .b2 {
        height: 50px;
        width: 100%;
        align-items: center;
    }

    .b2:nth-child(3) {
        justify-content: center;
    }

    .b2 span {
        color: white;
        width: 40%;
        text-align: center;
    }

    .b2 input {
        height: 100%;
        width: 50%;
    }

    .b2 div {
        height: 31px;
        width: 50%;
    }
</style>

<body>
<form action="http://localhost:8080/Java/fileUp" enctype="multipart/form-data" method="post">
    <div class="bigbox">-
        <div class="b2">
            <span>请输入用户名:</span>
            <input type="text" placeholder="请输入用户名" name="uname">
        </div>

        <div class="b2">
            <span>请选择头像:</span>
            <div>
                <input type="file" name="uico"/>
            </div>
        </div>

        <div class="b2">
            <input type="submit" />
        </div>
    </div>
</form>
<form action="http://localhost:8080/Java/fileDown" method="post">
    <div class="bigbox">
        <div class="b2">
            <input type="submit" value="下载" />
        </div>
    </div>
</form>
</body>
</html>
