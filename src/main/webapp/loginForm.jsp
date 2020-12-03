<%--
  Created by IntelliJ IDEA.
  User: Kuczma
  Date: 02.12.2020
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="CSS/loginForm.css">
</head>
<body>
<div class="container">
    <div id="login" class="signin-card">
        <div class="logo-image">
            <img src="/images/logo.png" alt="Logo" title="Logo" width="138">
        </div>
        <h1 class="display1">Title</h1>
        <p class="subhead">Description</p>
        <form action="" method="" class="" role="form">
            <div id="form-login-username" class="form-group">
                <input id="username" class="form-control" name="username" type="text" size="18" alt="login" required />
                <span class="form-highlight"></span>
                <span class="form-bar"></span>
                <label for="username" class="float-label">login</label>
            </div>
            <div id="form-login-password" class="form-group">
                <input id="passwd" class="form-control" name="password" type="password" size="18" alt="password" required>
                <span class="form-highlight"></span>
                <span class="form-bar"></span>
                <label for="password" class="float-label">password</label>
            </div>
            <div id="form-login-remember" class="form-group">
                <div class="checkbox checkbox-default">
                    <input id="remember" type="checkbox" value="yes" alt="Remember me" class="">
                    <label for="remember">Remember me</label>
                </div>
            </div>
            <div>
                <button class="btn btn-block btn-info ripple-effect" type="submit" name="Submit" alt="sign in">Sign in</button>
            </div>
    </div>
    </form>
</div>
</div>
</body>
</html>