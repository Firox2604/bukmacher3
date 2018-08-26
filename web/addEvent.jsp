<%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-08-26
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD EVENT</title>
    <link rel="stylesheet" href="/style/main.css"/>
</head>
<body>
<table>
<form method="POST" action="/doAdd">
    <tr>
        <td>ID: <input type="text" name="id"/></td>
    </tr>
    <tr>
        <td>EventName: <input type="text" name="eventName"/></td>
    </tr>
    <tr>
        <td>Date: <input type="text" name="date"/></td>
    </tr>
    <tr>
        <td>Location: <input type="text" name="location"/></td>
    </tr>
    <tr>
        <td><input type="submit" name="dodaj" class="submit"/></td>
    </tr>
</form>
</table>
</body>
</html>
