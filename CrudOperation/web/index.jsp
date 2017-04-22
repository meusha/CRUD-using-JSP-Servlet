<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/10/2017
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
</head>
<body>
  <div>
      <table border="1" align="center" style="width: 50%">
        <thead>
          <tr>
            <th>StudentId</th>
            <th>Name</th>
            <th>Address</th>
            <th>E-Mail</th>
            <th colspan="2">Action</th>
          </tr>
        </thead>

        <tbody>

       <c:forEach items="${students}" var="student">
              <tr>
                  <td>${student.studentId}</td>
                  <td>${student.name}</td>
                  <td>${student.address}</td>
                  <td>${student.email}</td>

                     <td><a href="Servlet?action=edit&studentId=${student.studentId}">Update</a></td>
                     <td><a href="Servlet?action=delete&studentId=${student.studentId}">Delete</a></td>
                      </tr>
       </c:forEach>

        </tbody>
      </table>
    <p> <a href="Servlet?action=insert" align="center" >Add Student</a> </p>
  </div>

</body>
</html>
