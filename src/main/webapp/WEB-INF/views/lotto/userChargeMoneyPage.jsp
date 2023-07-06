<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lotto Page</title>
    <style>
        body {
            background-color: #f5f5f5;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 4px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #333;
        }

        form {
            text-align: center;
            margin-top: 20px;
        }

        input[type="number"] {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #4caf50;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .user-money {
            text-align: center;
            margin-top: 20px;
            font-size: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Lotto Page</h1>
    <div class="user-money">현재 잔액: ${money}</div>
    <form method="post" action="/lotto/userChargeMoneyPage">
        <input type="number" name="userMoney" placeholder="금액을 입력하세요">
        <input type="submit" value="결제하기">
    </form>

</div>
</body>
</html>
