<%--
  Created by IntelliJ IDEA.
  User: Kasia
  Date: 2018-08-29
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bet</title>
    <link rel="stylesheet" href="/style/main.css"/>
</head>
<body>

<table>
    <h1 class="title">Zakład</h1>
    <tr>
        <th>Nazwa eventu</th>
        <th>Type</th>
        <th>Amount</th>
        <th>Accept</th>
    </tr>

    <tr>
        <td>name</td>
        <td>
            <select name="id_type">
                <option>wybierz</option>
                <option>typ1</option>
                <option>typ2</option>
                <option>typ3</option>
                <option>typ4</option>
            </select>
        </td>
        <td><input type="text" name="amount"/></td>
        <td><input type="submit" value="OK" class="bet"/></td>
    </tr>

  <tr>
      <td>${myEvent.name}</td>
      <td>
          <select name="typ">${myEvent.id_type}
              <option>wybierz</option>
              <option>${myEvent.id_type}</option>
              <option>${myEvent.id_type}</option>
              <option>${myEvent.id_type}</option>
              <option>${myEvent.id_type}</option>
          </select>
      </td>
      <td>${myEvent.amount}</td>
      <td><input type="submit" value="OK" class="bet"/></td>
  </tr>

</table>

</body>
</html>
