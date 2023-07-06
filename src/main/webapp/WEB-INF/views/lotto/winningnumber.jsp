<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>로또 번호 조회</title>
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

    form {
      text-align: center;
    }

    label {
      font-weight: bold;
    }

    input[type="text"] {
      padding: 10px;
      width: 100%;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    input[type="submit"] {
      padding: 10px 20px;
      background-color: #007bff;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    a {
      display: block;
      text-align: center;
      margin-top: 20px;
      color: #007bff;
      text-decoration: none;
    }

    /* 결과를 표시할 부분 스타일링 */
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
  </style>
</head>
<body>
<div class="container">
  <h1>로또 번호 조회</h1>
  <form method="post" action="/lotto/winningnumber">
    <label for="drawDate">추첨회차:</label>
    <input type="text" id="drawDate" name="drawDate" placeholder="회차수">
    <input type="submit" value="조회">
  </form>
</div>
</body>
</html>
