<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-05
  Time: 오후 2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lotto List</title>
    <style>
        body {
            background-color: #f5f5f5;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ccc;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }

        td button {
            padding: 5px 10px;
            font-size: 14px;
            background-color: #4caf50;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .buy-button {
            display: flex;
            justify-content: center;
        }

        .buy-button button {
            margin: 0 auto;
        }
    </style>

    <script type="text/javascript">
        function validateForm() {
            var userMoney = parseInt(document.querySelector('.userMoney').value);

            if (userMoney === 0) {
                alert("잔액이 부족합니다.");
                return false;
            }
        }
    </script>
</head>
<body>
<h1>Lotto List</h1>
<table>
    <tr>
        <th>로또 번호</th>
        <th>회차</th>
        <th>구매하기</th>
        <th>현재 잔액 : ${userMoney}</th>
        <input type="hidden" class="userMoney" value="${userMoney}">
    </tr>
    <c:forEach items="${lottoList}" var="lotto">
        <c:if test="${lotto.status eq false}">
            <tr>
            <td>${lotto.lottoNumbers}</td>
            <td>${lotto.drawDate}</td>
            <td class="buy-button">
                <form method="post" action="/lotto/showBuyPage" onsubmit="validateForm();">
                    <input type="hidden" name="lottoNumbers" value="${lotto.lottoNumbers}">
                    <button type="submit">구매</button>
                </form>
            </td>
        </c:if>
        </tr>
    </c:forEach>
</table>
</body>
</html>
