<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- loginForm.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Bootstrap JS -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h2>Login Form</h2>
<form class="form-horizontal" method="post" action="login.do">
    <div class="form-group">
        <label class="control-label col-sm-2" for="usrName">Username:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="usrName" name="username" placeholder="Enter username">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="usrPass">Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="usrPass" name="password" placeholder="Enter password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" value="가입" id="login"></button>
        </div>
    </div>
</form>
</body>
</html>
