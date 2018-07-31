<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/31/2018
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calcultator Interest</title>
    <link rel="stylesheet" href="style.css" type="text/css">
  </head>
  <body>
  <h1 >Calculator Interest</h1>
    <fieldset>
      <legend><h1>Calculator Interest</h1></legend>
      <form method="post" action="/Interest">
      <label>Deposits: </label> <br>
      <input type="text" name="deposits"> <br>
      <label>Monthly Interest Rate: </label> <br>
      <input type="text" name="rate"> <br>
      <label>Months: </label> <br>
      <input type="number" name="months"> <br>
      <input type="submit" value="Calculator">
      </form>
    </fieldset>
  </body>
</html>
