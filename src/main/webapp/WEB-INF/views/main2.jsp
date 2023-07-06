<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Main Page</title>--%>

<%--    <script>--%>
<%--        var selectedNumbers = []; // 선택된 번호를 저장하는 배열--%>

<%--        function selectLottoNumber(number) { // 클릭한 값을 number 매개변수로 가져온다--%>
<%--            var lottoNumberInput = document.getElementById("lottoNumberInput"); // input id 지정--%>

<%--            if (selectedNumbers.length < 6) {--%>
<%--                if (selectedNumbers.includes(number)) { // 이미 선택된 번호인 경우 includes(boolean반환함)로 해당 넘버가 있는지 확인함--%>
<%--                    alert("이미 선택한 번호입니다.");--%>
<%--                } else {--%>
<%--                    selectedNumbers.push(number); // 배열에 숫자 추가--%>
<%--                    lottoNumberInput.value = selectedNumbers.join(','); // 선택된 번호를 쉼표로 구분하여 입력란에 표시--%>
<%--                    // .join()은 배열의 원소들을 ( )안에 있는거를 바탕으로 연결하여 하나의 값으로 만듬--%>
<%--                    //  selectedNumbers 에 받아오는 값을 push로 배열끝에 저장하고  lottoNumberInput.value에 + 가 아닌--%>
<%--                    //  selectedNumbers.join(',')으로 값을 추가가 아닌 새 value를 넣는 형식으로 value를 만듬--%>
<%--                }--%>
<%--            }else{--%>
<%--                alert("6개까지 선택가능합니다.");--%>
<%--            }--%>
<%--        }--%>
<%--        function lottoNumberClear(){ // 선택한 로또 번호 삭제--%>
<%--            var lottoNumberInput = document.getElementById("lottoNumberInput");--%>
<%--            selectedNumbers = []; // 선택된 번호 배열을 초기화--%>
<%--            lottoNumberInput.value = ""; // 입력란의 값을 비움--%>
<%--        }--%>

<%--        function lottoNumberAuto() { // 로또 넘버 자동삽입--%>
<%--            var lottoNumberInput = document.getElementById("lottoNumberInput");--%>
<%--            var numbers = [];--%>

<%--            for (var i = 1; i <= 45; i++) {--%>
<%--                numbers.push(i); // numbers 배열에 1~45까지 삽입--%>
<%--            }--%>

<%--            selectedNumbers = []; // 기존에 선택된 번호 초기화--%>

<%--            for (var j = 0; j < 6; j++) {  // 6자리--%>
<%--                var randomIndex = Math.floor(Math.random() * numbers.length);--%>
<%--                //  Math.random은 0~1까지의 소수를 반환하기 떄문에 * numbers.length만큼(인덱스)까지 나오도록 곱해주고--%>
<%--                // Math.floor로 소수점을 버린 정수로 반환한다--%>
<%--                var randomNumber = numbers[randomIndex]; // numbers의 인덱스로 랜덤 숫자를 가져온다--%>
<%--                selectedNumbers.push(randomNumber); // 배열에 해당값을 추가한다.--%>
<%--                numbers.splice(randomIndex, 1);  // 이미 사용된 번호를 지움으로서 중복방지를 한다--%>
<%--                // .splice(인덱스,해당 인덱스부터 몇개를 지울지)--%>
<%--            }--%>

<%--            lottoNumberInput.value = selectedNumbers.join(',');--%>
<%--        }--%>
<%--        function validateForm() {--%>
<%--            var lottoNumberInput = document.getElementById("lottoNumberInput");--%>
<%--            var selectedNumbers = lottoNumberInput.value.split(","); // input value를 split 함수를 사용해서 배열로 저장--%>
<%--            // split(구분자) 구분자를 통해 배열로 만듬.--%>
<%--            if (selectedNumbers.length !== 6) { // 배열 length로 숫자 6개 입력된건지 확인--%>
<%--                alert("로또 번호는 6개를 입력해야 합니다.");--%>
<%--                return false; // 폼 제출을 막음--%>
<%--            }--%>
<%--            return true; // 폼 제출을 허용--%>
<%--        }--%>
<%--    </script>--%>
<%--    <style>--%>
<%--        .lotto-number {--%>
<%--            position: relative;--%>
<%--        }--%>

<%--        .lotto-number .percentage {--%>
<%--            display: none;--%>
<%--            position: absolute;--%>
<%--            top: -25px;--%>
<%--            left: 50%;--%>
<%--            transform: translateX(-50%);--%>
<%--            background-color: lightblue;--%>
<%--            color: black;--%>
<%--            padding: 5px;--%>
<%--            border-radius: 3px;--%>
<%--        }--%>

<%--        .lotto-number:hover .percentage {--%>
<%--            display: block;--%>
<%--        }--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>

<%--<% double[] percentages = (double[]) request.getAttribute("percentages"); %>--%>
<%--<p>※ 마우스를 올렸을때 나오는 %는 이용자들의 해당 번호 구매비율입니다.</p>--%>
<%--&lt;%&ndash;로또번호는 1~45까지이고 6개의 번호를 고른다.&ndash;%&gt;--%>
<%--<table>--%>
<%--    <!-- 로또 번호들을 클릭 이벤트로 연결 -->--%>
<%--    <%--%>
<%--        for (int i = 0; i < 5; i++) { // 5줄을 만듬--%>
<%--    %>--%>
<%--    <tr>--%>
<%--        <%--%>
<%--            for (int j = 1; j <= 10; j++) { // 10개의 숫자--%>
<%--                int num;--%>
<%--                num = (i*10)+j;  // 숫자 점점 올라가도록--%>
<%--        %>--%>
<%--        &lt;%&ndash;            <td onclick="selectLottoNumber(<%=num%>)"><%=num%> <span><%= percentages[num]%>%</span></td>&ndash;%&gt;--%>
<%--        <td class="lotto-number" onclick="selectLottoNumber(<%=num%>)"><%=num%> <span class="percentage"><%= percentages[num]%>%</span></td>--%>
<%--        <%--%>
<%--                if(num==45){  // 45까지만 나오도록--%>
<%--                    break;--%>
<%--                }--%>
<%--            }--%>
<%--        %>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
<%--</table>--%>


<%--<form action="/main" method="post" onsubmit="return validateForm()">--%>
<%--    <input type="text" readonly name="drawDate" value="${drawDate}">회차--%>
<%--    <input type="text" readonly id="lottoNumberInput" name="lottoNumber" placeholder="로또 번호 입력">--%>
<%--    <input type="button" onclick="lottoNumberAuto()" value="자동">--%>
<%--    <input type="button" onclick="lottoNumberClear()" value="삭제">--%>
<%--    <input type="submit" value="장바구니" id="cartButton">--%>
<%--</form>--%>
<%--<br><br>--%>
<%--<table>--%>
<%--    장바구니--%>
<%--    <tr>--%>
<%--        <td>No.</td>--%>
<%--        <td>회차</td>--%>
<%--        <td>로또번호</td>--%>
<%--    </tr>--%>
<%--    <% int shoppingNum = 1;%>--%>
<%--    <c:forEach items="${shoppingList}" var="shopping">--%>
<%--        <tr>--%>
<%--            <td><%=shoppingNum%></td>--%>
<%--            <td>${shopping.drawDate}</td>--%>
<%--            <td>${shopping.lottoNumbers}</td>--%>
<%--        </tr>--%>
<%--        <% shoppingNum++;%>--%>
<%--    </c:forEach>--%>
<%--    <tr>--%>
<%--        <td>--%>
<%--            <form method="get" action="/lotto/showBuyPage">--%>
<%--                <input type="submit" value="구매">--%>
<%--            </form>--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--</table>--%>
<%--<br><br>--%>
<%--<table>--%>
<%--    구매내역--%>
<%--    <tr>--%>
<%--        <td>No.</td>--%>
<%--        <td>회차</td>--%>
<%--        <td>로또번호</td>--%>
<%--        <td>당첨조회</td>--%>
<%--    </tr>--%>
<%--    <% int buyNum = 1;%>--%>
<%--    <c:forEach items="${buyList}" var="buy">--%>
<%--        <form method="" action="당첨확인페이지">--%>
<%--            <tr>--%>
<%--                <td><%out.println(buyNum);%></td>--%>
<%--                <td>${buy.drawDate}</td>--%>
<%--                <td>${buy.lottoNumbers}</td>--%>
<%--                <td>--%>
<%--                    <input type="hidden" value="${buy.drawDate}">--%>
<%--                    <input type="hidden" value="${buy.lottoNumbers}">--%>
<%--                    <input type="submit" value="조회">--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </form>--%>
<%--        <% shoppingNum++;%>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
