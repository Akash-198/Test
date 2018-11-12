<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./demo" method="post">
<table>
<tr>
<th>
User name:</th><td><input type="text" name="userid" placeholder="user name" requried pattern="[A-Za-z]{3,}"></td>
</tr>
<tr>
<th>
Password:</th><td><input type="password" name="password" placeholder="password" requried pattern="^(?=.*[a-z])(?=.*[!@#$%^&*()_+])[a-z!@#$%^&*()_+]{5,20}"></td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="submit"></td>
<td><input type="reset" value="clear"></td>
<td><a href="">forgotten password?</a>
</table>
</form>

</body>
</html>