<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-05
  Time: 오후 2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <td>email</td>
        <td>lotto_numbers</td>
        <td>draw_date</td>
    </tr>
    <c:forEach items="${lottoList}" var = "lotto">
        <tr>
            <td>${lotto.email}</td>
            <td>${lotto.lottoNumbers}</td>
            <td>${lotto.drawDate}</td>
            <c:if test="${lotto.status eq false}">
            <td>
                <form method="post" action="/lotto/showBuyPage">
                    <input type="hidden" name="lottoNumbers" value="${lotto.lottoNumbers}">
                    <input type="submit" >
                </form>
            </td>
            </c:if>
    </c:forEach>
</table>