<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>로또 번호 조회</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/lotto/result">
  <label for="drawDate">추첨일:</label>
  <input type="text" id="drawDate" name="drawDate" placeholder="YYYY-MM-DD">
  <input type="submit" value="조회">
</form>
<a href="/user/winningnumber">로또당첨조회</a>
<%-- 로또 번호와 사용자 번호를 표시할 부분 --%>
<%-- 여기에 결과를 표시하는 코드를 추가하세요. --%>
</body>
</html>