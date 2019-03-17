<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/3/14
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<body>
   <%-- <c:forEach var="customer" items="${list}">
        &lt;%&ndash;${list}
            从requestScope找
            实际上调用的是request.getAttribute()
            Attribute从三个地方找，先从request域中找，
            然后是ValueStack的栈(Root)找
            最后是ValueStack的Context部分找(ActionContext)
        &ndash;%&gt;
       <TD> ${customer.username}</TD>
    </c:forEach>--%>
    <%--<s:iterator value="#list" >
        &lt;%&ndash;
            作用和c：forEach一样
            这个value用的是ognl表达式，
            #list代表从ActionContext中找
            每次遍历value会把值压到值栈栈顶
        &ndash;%&gt;
        <TD>
            &lt;%&ndash;value值也是ognl表达式&ndash;%&gt;
            <s:property value="username"/>
        </TD>
    </s:iterator>--%>

    <s:iterator value="#list" var="cust">
        <s:property value="#cust.username"/>
    </s:iterator>


</body>
</html>
