<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2022/10/4
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>update</title>
</head>
<body>
修改页面
    <form action="updateBook?id=${book.id}" method="post">
        书名：<input name="bname" value="${book.bname}">
        作者：<input name="author"  value="${book.author}">
        价格：<input name="price" value="${book.price}">
        出版社：<input name="press" value="${book.press}">
        发售时间：<input name="saletime" value='<fmt:formatDate value="${book.saletime}" pattern="yyyy-MM-dd HH:mm:ss"/>'>

        <input type="submit" value="修改">
    </form>
</body>
</html>
