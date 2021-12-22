<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/22/2021
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2> Đổi tiền tệ</h2>
    <form method="post", action="/convert">
        <label> RATE: </label><br/>
        <input type="text" name="rate" placeholder="RATE" value="23000"/><br/><br/>
        <label >USD: </label><br/>
        <input type="text" name="usd" placeholder="USD" value="0"/><br/>
        <input type="submit" id="submit" value="Converter"/>
    </form>
</body>
</html>
