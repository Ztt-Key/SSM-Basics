<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ztz
  Date: 2023/11/12
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<%--<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>--%>
<%--<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->--%>
<%--<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<style>
    #roots:hover{
        background-color: #dff0d8;
    }
</style>
<html>
<head>
    <title>全部书籍</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 columu">
            <div class="page-hander">
                <h1>
                    <small>查看全部书籍</small>
                </h1>
            </div>
        </div>
    </div>


    <a type="button" class="btn btn-success" href="http://localhost:8080/addbook">添加书籍</a>

    <form action="http://localhost:8080/querybookname" method="post" style="float: right">
        <input type="text" placeholder="请输入要查询的书籍名称" class="form-control" name="querybookname">
        <input type="submit" value="查询" class="btn btn-primary">
    </form>
    <form action="http://localhost:8080/allbook" method="post" style="float: right">
        <input type="submit" value="查看全部书籍" class="btn btn-primary">
    </form>
    <div class="container">
        <div class="row clearfix">
            <table class="table table-hover table-striped success">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍描述</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr id="roots">
                        <td>${book.id}</td>
                        <td>${book.name}</td>
                        <td>${book.counts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="http://localhost:8080/update/?id=${book.id}">修改</a>
                            <a href="http://localhost:8080/delete/${book.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
