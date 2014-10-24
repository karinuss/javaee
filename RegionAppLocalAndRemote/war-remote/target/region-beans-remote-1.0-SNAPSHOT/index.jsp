<%--
  Created by IntelliJ IDEA.
  User: karina
  Date: 21.10.14
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Regions Servlet</title>
</head>
<body>
<div id="add">
    <form method="get" action="RegionsRemote">
        Add region: <input type="text" placeholder="Region name" maxlength="150" name="region">
        <input type="submit" value="Add">
    </form>
</div>
<div id="regions">
    <h3>Regions List</h3>
    <ul>
        <c:forEach items="${regions}" var="reg">
            <li>
                ${reg.id} - ${reg.name}
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
