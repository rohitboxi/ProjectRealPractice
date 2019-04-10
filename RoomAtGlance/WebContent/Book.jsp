<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

	body {
	background-image: url("hotel1.jpg");
    background-repeat: no-repeat;
    background-size: 1500px 800px;
}


a {
	text-decoration: none;
}

h1 {
	font-size: 1em;
}

h1,p {
	margin-bottom: 10px;
	padding-left: 70px;
}

strong {
	font-weight: bold;
}

.uppercase {
	text-transform: uppercase;
}

/* ---------- LOGIN ---------- */
#login {
	margin: 50px auto;
	width: 300px;
}

fieldset {
border: none;
}  

form fieldset input[type="text"],input[type="password"],input[type="date"] {
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
	width: 300px;
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
</style>
<style>
#menu {
    width: 210px;
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
<script type="text/javascript">
function popup() {
	alert("Registered Sucessfully");
}

</script>
</head>
<body>
<div id="menu">
<ul>
  <li><a href="View.jsp">Back</a></li>
  <li><a href="home.jsp">Home</a></li>
</ul>
</div>
<center>
<h1>......Please Book Your Room........</h1>
<div>
   <h4 align="left">Welcome ${user}</h4>
   </div>
     <form action="cont" method="get">
     <fieldset>
       <table>
			<h1 align="center">
			<strong>PARTYLAND...!</strong> 
		</h1>
				
        
     <tr>
     <td>Room No:</td>
     <td><input type="text" name="roomno" value="<%= request.getParameter("roomno")%>"></td>
     </tr>
     <tr>
     <td>Room Price:</td>
     <td><input type="text" name="price" value="<%= request.getParameter("price")%>"></td>
     </tr>
     <tr>
     <td>BookBy:</td>
     <td><input type="text" required value="bookby" name="bookby" onBlur="if(this.value=='')this.value='bookby'"
						onFocus="if(this.value=='bookby')this.value='' "></td>
   </tr>
     <tr>
     <td>BookFrom:</td>
     <td><input type="date" name="bookfrom" required value="bookfrom" onBlur="if(this.value=='')this.value='bookfrom'"
						onFocus="if(this.value=='bookfrom')this.value='' "></td>
	</tr>
    <tr>
     <td>BookTo:</td>
     <td><input type="date" name="bookto" required value="bookto" onBlur="if(this.value=='')this.value='bookto'"
						onFocus="if(this.value=='bookto')this.value='' "></td>
	</tr>
      <tr>
      <td></td>
      <td>
      <input type="submit" name="submit" value="BookRoom"></td>
      </tr>
      </table>
      <%-- <li><p><b>RoomNo:</b>
           <%= request.getParameter("roomNo")%>
           </p></li>
             <li><p><b>Price:</b>
             <%= request.getParameter("price")%>
         </p></li> --%>
      </fieldset>
    </form>
 </center>
</body>
</html>