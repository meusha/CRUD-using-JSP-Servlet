<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 4/21/2017
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Register Form</title>

</head>
<body>
    <h1>Student Registration</h1>
        <form method="post" action="RegisterServlet">
            Name:<input type="text" name="Name"><br/>
            Email:<input type="email" name="Email"><br/>
            Password:<input type="password" name="Password"><br/>
            <input type="submit" name="button" value="signUp!">
        </form>
</body>
</html>
