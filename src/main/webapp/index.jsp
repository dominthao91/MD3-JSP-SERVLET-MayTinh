<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/9/2021
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>calculator</title>
  </head>
  <body>
<h1>Simple Calculator</h1>
<form action="/Calculator" method="post">

    <legend>Calculator</legend>
    <table>
      <tr>
        <td>First operand: </td>
        <td><input name="11" type="text"/></td>
      </tr>
      <tr>
        <td>Operator: </td>
        <td>
          <select name="operator">
            <option value="+">Cộng</option>
            <option value="-">Trừ</option>
            <option value="*">Nhân</option>
            <option value="/">Chia</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second operand: </td>
        <td><input name="22" type="text"/></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Calculate"/></td>
      </tr>
    </table>
  </fieldset>
</form>
  </body>
</html>
