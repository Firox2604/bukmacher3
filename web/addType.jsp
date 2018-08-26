<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 26.08.2018
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD TYPE</title>
</head>
<body>
<form method="POST" action="/doAdd">
    <br>
    <center>
        <b>
            ID: <input type="text" name="id"/>
            EventId: <input type="text" name="eventId"/>
            <br>
            <br>
            Course on 1: <input type="text" name="value1"/>
            Course on 2: <input type="text" name="value2"/>
            Course on 3: <input type="text" name="value2"/>
            Course on 4: <input type="text" name="value2"/>
            <input type="submit" name="dodaj"/>
        </b>
    </center>
</form>
</body>
</html>
