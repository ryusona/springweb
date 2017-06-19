<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">회원가입 화면입니다</h3>
    </div>

    <div class="jumbotron">
        <form class="form-writen"  action="/member/sign-up" method="post">
        <%--<form class="form-writen"  action="/member" method="post">--%>
            <div class="input-group input-group-lg"  >
                <span class="glyphicon glyphicon-send input-group-addon">  아이디 </span>
                <input type="text" name="userId" class="form-control" placeholder="아이디">
            </div>
            <div class="input-group input-group-lg">
                <span class="glyphicon glyphicon-send input-group-addon">  비밀번호 </span>
                <input type="text" name="password" class="form-control" placeholder="비밀번호">
            </div>
            <div class="input-group input-group-lg">
                <span class="glyphicon glyphicon-send input-group-addon">  이메일 </span>
                <input type="text" name="email" class="form-control" placeholder="이메일">
            </div>

            <p><input type="submit" value="가입하기" class="btn btn-sm btn-success"></p>
            <%--<button class="btn btn-lg btn-primary btn-block" type="회원가입"--%>
                    <%--onclick="location.href='/member/write'"> 회원가입 </button>--%>
        </form>
    </div>

</div> <!-- /container -->

</body>
</html>
