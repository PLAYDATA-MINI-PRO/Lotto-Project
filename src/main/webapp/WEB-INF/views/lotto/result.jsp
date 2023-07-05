<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로또 당첨 결과</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #007bff;
        }

        .result {
            margin-top: 40px;
            text-align: center;
        }

        .result h2 {
            margin-bottom: 20px;
            color: #007bff;
        }

        .result ul {
            list-style: none;
            padding: 0;
            margin: 0;
        }

        .result li {
            display: inline-block;
            margin-right: 10px;
            font-size: 18px;
            font-weight: bold;
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #007bff;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>로또 당첨 결과</h1>
    <div class="result">
        <h2>추첨 회차: ${drawDate}</h2>
        <ul>
            <c:forEach items="${winningNumbers}" var="number">
                <li>${number}</li>
            </c:forEach>
        </ul>
        <a href="${pageContext.request.contextPath}/lotto/result">다시 조회하기</a>
    </div>
</div>
</body>
</html>
