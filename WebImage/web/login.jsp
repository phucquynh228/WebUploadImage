<%-- 
    Document   : login
    Created on : Mar 7, 2026, 12:59:10 PM
    Author     : PhucQuynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="login" method="post">
            <h2>Login</h2>

            Username: <input type="text" name="username" required><br>
            Password: <input type="password" name="password" required><br>

            <button type="submit">Login</button>
        </form>

        <p style="color:red">${error}</p>
    </body>
</html>
