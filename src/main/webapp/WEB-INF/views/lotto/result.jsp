<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            max-width: 800px;
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
            font-size: 24px;
        }

        .result ul {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .result li {
            display: inline-block;
            margin-right: 10px;
            font-size: 20px;
            font-weight: bold;
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
        }

        .your-number {
            font-size: 20px;
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
        <h2>이번 회차: ${drawDate} 회차</h2>
        <ul>
            <li>당첨 번호: ${winningNumbers}</li>
        </ul>
        <br>
        <p>고객 번호: <span class="your-number">${takeLottoNumber}</span></p>
        <br>
        <p>일치 번호: <span class="your-number">${commonNumbers}</span></p>
        <br>
        <p>등수: <span class="your-number">${rank}</span></p>
    </div>
</div>
</body>
</html>
