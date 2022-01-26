<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log In Page</title>
</head>
<body>
	
		<h1>Welcome to Spring Boot Security</h1>
		<h2>Login Page</h2>
         ${SPRING_SECURITY_LAST_EXCEPTION.message}
		<form method="POST" action="/login">
			User Name : <input type="text" name="username" value="user" /><br>
			<br> Password : <input type="password" name="password"
				value="password" /><br>
			<br> <input type="submit" name="submit" />
		</form>

</body>
</html>