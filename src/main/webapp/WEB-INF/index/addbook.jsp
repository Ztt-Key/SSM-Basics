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
                    <small>添加书籍</small>
                </h1>
            </div>
        </div>
    </div>

        <form action="http://localhost:8080/addbooks" method="post">
            <div class="form-group">
                <label for="exampleInputEmail1">书籍名称</label>
<%--                required==必须填才可以提交--%>
                <input class="form-control" id="exampleInputEmail1" placeholder="请输入书籍的名称" name="name" required>
            </div>
            <div class="form-group">
                <label>书籍数量</label>
                <input type="number" class="form-control" placeholder="请输入书籍的数量" name="counts" required>
            </div>
            <div class="form-group">
                <label>书籍描述</label>
                <input type="text" class="form-control" placeholder="请简单描述该书籍" name="detail" required>
            </div>
            <button type="submit" class="btn btn-default btn-info">添加</button>
        </form>

    </div>
</body>
</html>
