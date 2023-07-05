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
        var isRobotChecked = false;

        var onloadCallback = function() {
            grecaptcha.render('html_element', {
                'sitekey' : '6Ld-u_YmAAAAAAvOhRBwJQbZ-y7LdHQslbmWWA6k',
                'callback' : function() {
                    isRobotChecked = true;
                }
            });
        };

        function submitForm() {
            if (isRobotChecked) {
                // 로봇이 아닙니다 체크가 되었을 때 폼 제출
                document.getElementById('loginForm').submit();
            } else {
                // 로봇이 아닙니다 체크가 안 되었을 때 처리할 내용 (예: 경고 메시지)
                alert("로봇이 아닙니다 확인을 해주세요!");
            }
        }
    </script>
</head>
<body>
<form id="loginForm" method="post" action="/user/login">
    <input type="text" name="email" />
    <input type="password" name="password" />
    <input type="button" value="로그인" onclick="submitForm()" /> <!-- submit 버튼을 일반 버튼으로 변경 -->
    <div id="html_element"></div>
    <br>
    <input type="submit" value="Submit" style="display: none;"> <!-- 숨겨진 submit 버튼 -->
</form>
<a href="/user/signup">회원가입</a>
</body>
<script src="https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit"
        async defer>
</script>
</html>
