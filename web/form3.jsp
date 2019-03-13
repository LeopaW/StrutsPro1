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
    <form action="${pageContext.request.contextPath}/Demo11Action">
        list:<input type="text" name="list" /><br>
        list:<input type="text" name="list" /><br><!--这里list可以写成list[里面写索引]，不写的话就一个一个接着-->
        map:<input type="text" name="map['name']" /><br><!--这里map必须写成map['键名']-->
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
