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
    <h1 class="title">Add Event</h1>
<form method="POST" action="/doAddEvent">
    <tr>
        <td>EventName: <input type="text" name="eventName" class="textRight"/></td>
    </tr>
    <tr>
        <td>Date: <input type="text" name="date" class="textRight"/></td>
    </tr>
    <tr>
        <td>Location: <input type="text" name="location" class="textRight"/></td>
    </tr>
    <tr>
        <td><input type="submit" name="addEvent" value="Add Event" class="button add"/></td>
    </tr>
</form>
</table>
</body>
</html>
