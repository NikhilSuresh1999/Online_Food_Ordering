<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
</head>
<body>

<div class="login">
<form action="log" method="post">
<label> <b>Username</b> </label>
<input type="text" name="uname" id="textbox" placeholder="enter the username"/>
<br>
<br>

<label><b>Password</b></label>
<input type="text" name="password" id="textbox" placeholder="enter the password"/>
<br>
<br>
<input type="submit" value="login" id="sub"/>
<br>
<br>
<a href="register.jsp">new user register here..</a>


</form>


</div>

</body>
</html>