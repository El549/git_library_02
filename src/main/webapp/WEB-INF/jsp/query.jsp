<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>query</title>
</head>
<body>
<%--展示数据使用表格--%>
<table border="1" align="center">
    <tr>
        <td>
            <a href="${pageContext.request.contextPath}/book/add">添加</a>
        </td>
    </tr>
    <tr class="info">
        <td>编号</td>
        <td>书名</td>
        <td>作者</td>
        <td>价格</td>
        <td>出版社</td>
        <td>发售时间</td>
        <td>操作</td>
    </tr>
    <%--var是循环体内的变量 items是谁被循环 varStatus是专门做编号的--%>
    <c:forEach var="b" items="${blist}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${b.bname}</td>
            <td>${b.author}</td>
            <td>${b.price}</td>
            <td>${b.press}</td>
            <td><fmt:formatDate value="${b.saletime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td>
                <a href="showBook?id=${b.id}">修改</a>
                <a href="deleteBook?id=${b.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>