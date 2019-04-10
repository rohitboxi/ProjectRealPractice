<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Best Login Page design in HTML and CSS</title>
<style type="text/css">

	body {
	background-image: url("hotel1.jpg");
    background-repeat: no-repeat;
    background-size: 1500px 800px;
}


a {
	text-decoration: none;
	color: blue;
	padding-left:40px;
	
}

h1{
	font-size: 1em;
	margin-left:0px;
}

h4 {
	font-size: 1em;
	margin-left:120px;
}

h2 {
	font-style: italic;
	color:red;
	margin-top: 0px;
	font-size: medium;
	margin-left:50px
	
}
h1,p {
	margin-bottom: 10px;
	

}

strong {
	font-weight: bold;
}

.uppercase {
	text-transform: uppercase;
}

/* ---------- LOGIN ---------- */
#login {
	margin: 0px auto;
	margin-left:40px;
	width: 300px;
}

fieldset {
border: none;
}  

form fieldset input[type="text"],input[type="password"] {
	background-color: #e5e5e5;
	border: none;
	border-radius: 3px;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	color: #5a5656;
	font-family: 'Open Sans', Arial, Helvetica, sans-serif;
	font-size: 14px;
	height: 50px;
	outline: none;
	padding: 0px 10px;
	width: 280px;
	-webkit-appearance: none;
}

form fieldset input[type="submit"] {
	background-color: #008dde;
	border: none;
	border-radius: 3px;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	color: #f4f4f4;
	cursor: pointer;
	font-family: 'Open Sans', Arial, Helvetica, sans-serif;
	height: 50px;
	text-transform: uppercase;
	width: 150px;
	margin-left:75px;
	-webkit-appearance: none;
}

form fieldset a {
	color: #5a5656;
	font-size: 10px;
}

form fieldset a:hover {
	text-decoration: underline;
}

.btn-round {
	background-color: #5a5656;
	border-radius: 50%;
	-moz-border-radius: 50%;
	-webkit-border-radius: 50%;
	color: #f4f4f4;
	display: block;
	font-size: 12px;
	height: 50px;
	line-height: 50px;
	margin: 30px 125px;
	text-align: center;
	text-transform: uppercase;
	width: 50px;
}

/* .facebook-before {
	background-color: #0064ab;
	border-radius: 3px 0px 0px 3px;
	-moz-border-radius: 3px 0px 0px 3px;
	-webkit-border-radius: 3px 0px 0px 3px;
	color: #f4f4f4;
	display: block;
	float: left;
	height: 50px;
	line-height: 50px;
	text-align: center;
	width: 50px;
}

.facebook {
	background-color: #0079ce;
	border: none;
	border-radius: 0px 3px 3px 0px;
	-moz-border-radius: 0px 3px 3px 0px;
	-webkit-border-radius: 0px 3px 3px 0px;
	color: #f4f4f4;
	cursor: pointer;
	height: 50px;
	text-transform: uppercase;
	width: 250px;
}

.Google-before {
	background-color: #189bcb;
	border-radius: 3px 0px 0px 3px;
	-moz-border-radius: 3px 0px 0px 3px;
	-webkit-border-radius: 3px 0px 0px 3px;
	color: #f4f4f4;
	display: block;
	float: left;
	height: 50px;
	line-height: 50px;
	text-align: center;
	width: 50px;
}

.Google {
	background-color: #1bb2e9;
	border: none;
	border-radius: 0px 3px 3px 0px;
	-moz-border-radius: 0px 3px 3px 0px;
	-webkit-border-radius: 0px 3px 3px 0px;
	color: #f4f4f4;
	cursor: pointer;
	height: 50px;
	text-transform: uppercase;
	width: 250px;
} */
</style>

</head>
<body>

     <h4>.....Atithi Devo Bhava......</h4>
     <h2><%
    if(null!=request.getAttribute("errorMessage"))
    {
        out.println(request.getAttribute("errorMessage"));
    }
%></h2>
	<div id="login">
		
		<form action="cont" method="get">
			<fieldset>
			<h1 align="center">
			<strong>PARTYLAND...!</strong> 
		</h1>
				<p>
					<input type="text" required value="Username" name="user"
						onBlur="if(this.value=='')this.value='Username'"
						onFocus="if(this.value=='Username')this.value='' ">
				</p>
				<p>
					<input type="password" required value="Password" name="pwd"
						onBlur="if(this.value=='')this.value='Password'"
						onFocus="if(this.value=='Password')this.value='' ">
				</p>
				
				<p></p>
				<p>
					<input type="submit" name="submit" value="Login-User">
				</p>
			</fieldset>
		</form>
		    <p>
					<a href="fpwd.html">Forgot Password? </a><a href="register.html">New
						User</a>
				</p>
		<!-- <p>
			<a class="facebook-before"></a>
			<button class="facebook">Login Using Facebook</button>
		</p>
		<p>
			<a class="Google-before"></a>
			<button class="Google">Login Using Google+</button>
		</p> -->
	</div>
	
	<!-- end login -->
</body>
</html>