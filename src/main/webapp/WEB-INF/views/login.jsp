<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <form action="/login" method="post">
        <div>
            <input type="text" name="username" placeholder="아이디">
        </div>
        <div>
            <input type="password" name="password" placeholder="비밀번호">
        </div>
        <button>로그인</button>
    </form>
</body>
</html>
