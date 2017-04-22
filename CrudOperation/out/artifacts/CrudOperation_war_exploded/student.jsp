<%--
  Created by IntelliJ IDEA.
  User: shrijana
  Date: 4/18/2017
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Update Student</title>
</head>
<body>

        <p>You are updateing id :${id}</p>
        <div>
            <form method="post" action="Servlet" name="frmAddStudent">
                <input type="hidden" name="studentId" value="${id}" /><br><br>
                Name : <input type="text" name="name"/><br><br>
                Address : <input type="text" name="address"/><br><br>
                E-Mail : <input type="text" name="email"/><br><br>

                <input type="submit" value="Update" name="button"/>
            </form>
        </div>
</body>
</html>
