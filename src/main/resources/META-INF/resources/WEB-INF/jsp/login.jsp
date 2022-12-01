<html>
	<head>
		<title> Login page</title>
	</head>
	<body>
<%-- 	use of Expression language-> ${name } --%>
		welcome to the login page ! 
		
		<pre>${Errormssg }</pre>
		<form method="POST">
		Name:<input type"text" name="name"><br>
		Password:<input type"password" name="password"> 
		<input type="submit">
		
		</form>
	</body>
</html>