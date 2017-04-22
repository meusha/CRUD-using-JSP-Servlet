<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/18/2017
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Add new Student</title>
</head>
<body>
    <div class="centered">
        <form method="post" action="Servlet" name="frmAddStudent">
            Student Id : <input type="text" name="studentId" /><br><br>
            Name : <input type="text" name="name" /><br><br>
            Address : <input type="text" name="address" /><br><br>
            E-Mail : <input type="text" name="email" /><br><br>

            <input type="submit" value="Submit" name="button"/>
        </form>

    </div>

</body>
</html>
