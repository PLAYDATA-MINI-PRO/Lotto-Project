<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Admin Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h1 class="text-center">Admin Page</h1>
    <div class="row justify-content-center mt-5">
        <div class="col-sm-4">
            <form action="/admin/userMoneyList">
                <button type="submit" class="btn btn-primary btn-block">유저 금액 리스트</button>
            </form>
        </div>
        <div class="col-sm-4">
            <form action="/admin/delete">
                <button type="submit" class="btn btn-danger btn-block">유저 삭제</button>
            </form>
        </div>
        <div class="col-sm-4">
            <form action="/admin/outUser">
                <button type="submit" class="btn btn-warning btn-block">탈퇴 유저</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>