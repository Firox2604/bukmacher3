<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 26.08.2018
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD EVENT</title>
</head>
<body>
<form method="POST" action="/doAdd">
    <br>
    ID: <input type="text" name="id"/>
    EventName: <input type="text" name="eventName"/>
    Date: <input type="text" name="date"/>
    Location: <input type="text" name="location"/>
    <input type="submit" name="dodaj"/>
</form>
</body>
</html>





