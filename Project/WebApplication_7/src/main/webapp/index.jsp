<html>
<head>	
<title></title>
</head>
<body>
<form action = "/addUser">
Door No<input type = "text" name = "doorNo"> <br>
Address <input type = "text" name = "address"> <br>
Name <input type = "text" name = "name"> <br>
<input type = "submit"> <br> 
</form>
<h2> Search </h2>
<form action = "getUser">
Enter Door No<input type = "text" name = "doorNo"> <br>
<input type = "submit"> <br> 
</form> 
${userDetails.name}
${userDetails.doorNo}
${userDetails.address}
</body>
</html> 
