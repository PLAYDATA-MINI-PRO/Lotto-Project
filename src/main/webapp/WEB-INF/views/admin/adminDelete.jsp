<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.lotto.domain.dto.User" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete User List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        h1 {
            text-align: center;
            margin-top: 30px;
        }

        table {
            width: 80%;
            margin: 30px auto;
            border-collapse: collapse;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f8f8f8;
            font-weight: bold;
        }

        tr:hover {
            background-color: #f5f5f5;
            cursor: pointer;
        }
    </style>
    <script>
        function deleteUser(userId) {
            if (confirm("Are you sure you want to delete this user?")) {
                window.location.href = "/admin/delete/" + encodeURIComponent(userId);
            }
        }
    </script>
</head>
<body>
<h1>Delete User List</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Email</th>
        <th>Name</th>
        <th>Money</th>
        <th>Created At</th>
    </tr>
    <%-- Loop through the user list and display the information --%>
    <c:forEach items="${userList}" var="user">
        <tr onclick="deleteUser('${user.id}')">
            <td>${user.id}</td>
            <td>${user.email}</td>
            <td>${user.name}</td>
            <td>${user.money}</td>
            <td>
                <fmt:formatDate value="${user.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
