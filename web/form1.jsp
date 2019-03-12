<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/3/12
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Demo8Action">
        用户名：<input type="text" name="name" /><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
