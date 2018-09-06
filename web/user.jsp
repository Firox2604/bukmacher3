<%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-08-25
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
    <link rel="stylesheet" href="/style/main.css"/>
</head>
<body>
<table id="user">
    <h1 class="title">User</h1>
    <tr>
        <th>ID</th>
        <td>id</td>
    </tr>
    <tr>
        <th>Name</th>
        <td>name</td>
    </tr>
    <tr>
        <th>Surname</th>
        <td>surname</td>
    </tr>
    <tr>
        <th>Balance</th>
        <td>balance</td>
    </tr>
    <tr>
        <th>Role</th>
        <td>role</td>
    </tr>

    <%--<tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.surname}</td>
        <td>${user.balance}</td>
        <td>${user.role}</td>
    </tr>--%>
    <tr>
        <td colspan="2">
            <button class="button buttonUser">
            <a class="bet user" href="history.jsp">History</a>
            </button>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <button class="button buttonUser">
                <a class="bet user" href="list.jsp">Events list</a>
            </button>
        </td>
    </tr>


</table>
</body>
</html>
