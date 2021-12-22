<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/22/2021
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h2>Từ điển tiếng Anh</h2>
<form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Hãy nhập chữ  bạn muốn tìm: "/>
    <input type="submit" id="submit" value="Search"/>

</form>
</body>
</html>
