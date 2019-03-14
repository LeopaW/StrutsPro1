<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/3/14
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <style>
        table{
            
        }
        .in{
            text-align: left;
        }
    </style>
</head>
<body>
    <form action="CustomerAction_add" method="post">
        <table border="1" align="center" cellpadding="0" cellspacing="0">
         <tr>
             <td>用户：</td><td class="in"><input type="text" name="username" placeholder="请输入用户名"></td>
         </tr>
            <tr>
                <td>密码：</td><td class="in"><input type="password" name="password" placeholder="请输入密码"></td>
            </tr>
            <tr>
                <td>爱好：</td><td class="in"><input type="checkbox" name="hobby" value="敲代码">敲代码<input type="checkbox" name="hobby"value="打篮球">打篮球
                    <input type="checkbox" name="hobby" value="玩游戏">玩游戏</td>
            </tr>
            <tr>
                <td>性别：</td><td class="in"><input type="radio" name="sex" value="男" id="man" checked="checked"><label for="man">男</label><input type="radio" name="sex" value="女" id="woman"><label for="woman">女</label></td>
            </tr>
            <tr>
                <td> 省份：</td><td class="in"><select name="province">
                    <OPTION >请选择</OPTION>
                    <OPTION  value="北京">北京</OPTION>
                    <OPTION value="西安">西安</OPTION>
                    </select></td>
            </tr>
            <tr>
                <td> 备注：</td><td class="in"><textarea name="remark" rows="3" cols="20"></textarea></td>
            </tr>
            <tr align="center">
                <td align="center" colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
