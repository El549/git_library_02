<%--
  Created by IntelliJ IDEA.
  User: 24868
  Date: 2022/10/4
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>添加</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/book/addBook" method="post">
  书名：<input name="bname">
  作者：<input name="author">
  价格：<input name="price">
  出版社：<input name="press">
  发售时间：<input name="saletime">
  <input type="submit" value="提交">
</form>
</body>
</html>
