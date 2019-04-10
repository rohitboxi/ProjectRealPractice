<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/CSS">
	body {
	background-image: url("hotel1.jpg");
    background-repeat: no-repeat;
    background-size: 1500px 800px;
}
</style>
<style>
#menu {
    width: 95px;
    height: 35px;
    font-size: 16px;
    font-family: Tahoma, Geneva, sans-serif;
    font-weight: bold;
    text-align: center;
    
    background-color: #8AD9FF;
        border-radius: 8px;
}

#menu ul {
    height: auto;
    padding: 8px 0px;
    margin: 0px;
}
#menu li { 
display: inline; 
padding: 20px; 
}

#menu a {
    text-decoration: none;
    color: #00F;
    padding: 8px 8px 8px 8px;
}

#menu a:hover {
    color: #F90;
    background-color: #FFF;
}

</style>
</head>
<body>
<div id="menu">
<ul>
  <li><a href="Login.jsp">Home</a></li>
</ul>
</div>
   <div>
   <h4 align="left">Welcome ${user}</h4>
   </div>
	<h3 align="center">
		Welcome To PartyLand....!
	</h3>
	
<center>
	<form action="cont" method="get" >
		<select name="name" id="name">
			<option value="Luxury">Luxury</option>
			<option value="Delux">Delux</option>
			<option value="Standard">Standard</option>
		</select> <input type="submit" id="submit" name="submit" value="Ok">
	</form>
	</center>
	<div id="id1"></div>

</body>
</html>