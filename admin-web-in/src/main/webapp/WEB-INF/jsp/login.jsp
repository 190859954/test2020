<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>登录页面</h2>
<form name="loginForm" action="${pageContext.request.contextPath}/admin/main" method="post">
    <table Border="0" >
        <tr >
            <td>账号</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password">
            </td>
        </tr>
    </table>
    <br>
    <input type="submit" value="登录" style="color:#BC8F8F">
</form>

</body>
</html>
