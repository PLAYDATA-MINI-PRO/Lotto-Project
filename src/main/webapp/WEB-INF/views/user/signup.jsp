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
    <script type="text/javascript">
        function validateForm() {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;

            // 비밀번호와 비밀번호 확인이 일치하는지 검사
            if (password !== confirmPassword) {
                alert("비밀번호가 일치하지 않습니다.");
                return false;
            }

            // 비밀번호 유효성 검사: 특수문자와 숫자를 포함해야 함
            let regex = /^(?=.*[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?])(?=.*\d).{8,}$/;

            if (!regex.test(password)) {
                alert("비밀번호는 특수문자와 숫자를 포함하여 8자 이상이어야 합니다.");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
<form method="post" action="/user/signup" onsubmit="return validateForm()">
    <input type="email" name="email" required placeholder="email">
    <br/>
    <input type="password" name="password" id="password" required placeholder="password">
    <br/>
    <input type="password" name="confirmPassword" id="confirmPassword" required placeholder="confirm password">
    <br/>
    <input type="text" name="name" required placeholder="name">
    <br/>
    <input type="submit" value="signup">
</form>
</body>
</html>
