<%@ page import="java.awt.*" %><%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-08-26
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ListEvents</title>
    <link rel="stylesheet" href="/style/main.css"/>
</head>
<body>

<table>

        <%--<%
            List<Event> events = (List<Event>) application.getAttribute("events");
            for (Event event : events){
        %>--%>
    <tr>
        <th>LP</th>
        <th>Name</th>
        <th>ID</th>
        <th>Date</th>
        <th>Place</th>
        <th>Type</th>
        <th>Bid</th>
        <th>Accept</th>
    </tr>
    <tr>
        <td>Event1</td>
        <td>Name</td>
        <td>ID</td>
        <td>Date</td>
        <td>Place</td>
        <td>
            <select name="typ">
                <option>wybierz</option>
                <option>typ1</option>
                <option>typ2</option>
                <option>typ3</option>
                <option>typ4</option>
            </select>
        </td>
        <td><input type="text" name="bid"/></td>
        <td><input type="submit" value="OK"/></td>

    </tr>
   <%-- <tr>
        <td>Event2</td>
        <td>Name</td>
        <td>ID</td>
        <td>Date</td>
        <td>Place</td>
        <td>
            <select name="typ">
                <option>wybierz</option>
                <option>typ1</option>
                <option>typ2</option>
                <option>typ3</option>
                <option>typ4</option>
            </select>
        </td>
        <td><input type="text" name="bid"/></td>
        <td><input type="submit" value="Accept"/></td>
    </tr>
    <tr>
        <td>Event4</td>
        <td>Name</td>
        <td>ID</td>
        <td>Date</td>
        <td>Place</td>
        <td>
            <select name="typ">
                <option>wybierz</option>
                <option>typ1</option>
                <option>typ2</option>
                <option>typ3</option>
                <option>typ4</option>
            </select>
        </td>
        <td><input type="text" name="bid"/></td>
        <td><input type="submit" value="Accept"/></td>
    </tr>
    <tr>
        <td>Event4</td>
        <td>Name</td>
        <td>ID</td>
        <td>Date</td>
        <td>Place</td>
        <td>
            <select name="typ">
                <option>wybierz</option>
                <option>typ1</option>
                <option>typ2</option>
                <option>typ3</option>
                <option>typ4</option>
            </select>
        </td>
        <td><input type="text" name="bid"/></td>
        <td><input type="submit" value="Accept"/></td>

    </tr>
    <tr>
        <td>Event5</td>
        <td>Name</td>
        <td>ID</td>
        <td>Date</td>
        <td>Place</td>
        <td>
            <select name="typ">
                <option>wybierz</option>
                <option>typ1</option>
                <option>typ2</option>
                <option>typ3</option>
                <option>typ4</option>
            </select>
        </td>
        <td><input type="text" name="bid"/></td>
        <td><input type="submit" value="Accept"/></td>
    </tr>--%>

    <%--<% } %>--%>

</table>
</body>
</html>
