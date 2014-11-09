<%--
  Created by IntelliJ IDEA.
  User: matvey
  Date: 21.10.14
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title> Login Page</title>
</head>
<body>
    <h3> Hello! </h3>

    <form name="submitBtn" method="get" action="/Controller">

        <input type="hidden" name="command" value="index">
        Login:<br>
        <input type="text" name="userLogin" placeholder="login"> <br>
        Password:<br>
        <input type="text" name="userPassword" placeholder="password"> <br>
        <input type="submit" value="Sign In">
    </form>

</body>
</html>
