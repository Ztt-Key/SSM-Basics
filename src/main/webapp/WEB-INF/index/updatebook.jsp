<%--
  Created by IntelliJ IDEA.
  User: ztz
  Date: 2023/11/13
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 columu">
            <div class="page-hander">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="http://localhost:8080/updatebook" method="post">

<%--        修改失败是因为没有传给后端id   使用隐藏域传--%>
        <input type="hidden" name="id" value="${books.id}">

        <div class="form-group">
            <label for="exampleInputEmail1">书籍名称</label>
            <%--                required==必须填才可以提交--%>
            <input class="form-control" id="exampleInputEmail1" placeholder="请输入书籍的名称" name="name" required value="${books.name}">
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="number" class="form-control" placeholder="请输入书籍的数量" name="counts" required value="${books.counts}">
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" class="form-control" placeholder="请简单描述该书籍" name="detail" required value="${books.detail}">
        </div>
        <button type="submit" class="btn btn-default btn-info">修改</button>
    </form>

</div>
</body>
</html>
