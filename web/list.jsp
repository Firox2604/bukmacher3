<%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-08-26
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ListEvents</title>
    <link rel="stylesheet" href="/style/main.css"/>
</head>
<body>

<table>
    <h1 class="title">Zakłady bukmacherskie</h1>
    <tr>
        <th>ID</th>
        <th>Nazwa eventu</th>
        <th>Data</th>
        <th>Miejsce</th>
        <th>Graj</th>
    </tr>

    <tr>
        <td>id</td>
        <td>name</td>
        <td>date</td>
        <td>location</td>
        <td><button class="button"><a class="bet" href="bet.jsp">Obstaw</a></button></td>
    </tr>

    <c:forEach items="${myEvents}" var="myEvent">
        <tr>
            <td>${myEvent.id}</td>
            <td>${myEvent.name}</td>
            <td>${myEvent.date}</td>
            <td>${myEvent.location}</td>
            <td>
                <button class="button">
                    <a class="bet" href="bet.jsp">Obstaw</a>
                </button>
            </td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="5">
            <button class="button">
                <a class="addEvent" href="addEvent.jsp">Add Event</a>
            </button>
        </td>
    </tr>
    <%--<%
        List<MyEvent> myEvents = (List<MyEvent>) application.getAttribute("myEvents");
        for (MyEvent myEvent : myEvents){
    %>
    <tr>
        <td><%=myEvent.getName()%></td>
        <td><%=myEvent.getId()%></td>
        <td><%=myEvent.getDate()%></td>
        <td><%=myEvent.getLocation()%></td>
        <td><input type="submit" value="Obstaw"/></td>
    </tr>

    <% } %>--%>

</table>
</body>
</html>
