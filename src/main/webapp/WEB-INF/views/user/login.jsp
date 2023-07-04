<%--
  Created by IntelliJ IDEA.
  User: sujeong
  Date: 2023/07/04
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/user/login">
    <input type="text" name="email" />
    <input type="password" name="password" />
    <input type="submit" value="로그인" />
</form>
<a href="/user/signup">회원가입</a>
</body>
</html>
