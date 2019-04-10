<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
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
}

strong {
	font-weight: bold;
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
</head>
<body>
<div id="menu">
<ul>
  <li><a href="Book.jsp">Back</a></li>
  <li><a href="home.jsp">Home</a></li>
</ul>
</div>
 <div>
   <h4 align="right" style="padding-right: 160px">Welcome ${user}</h4>
 </div>

<h4 align="left">......Your Details Are Successfully Saved ........</h4>
		<h3 align="left">
		  <strong style="padding-left: 80px">PARTYLAND...!</strong> 
		</h3>
	<form action="cont" method="get">
	 <table align="left" style="padding-left: 80px">	
		   <tr>
		   <td>RoomNo:</td>
           <td><p><%= request.getParameter("roomno")%></p></td>
           </tr>
           <tr>
		   <td>Price:</td>
           <td><p><%= request.getParameter("price")%></p></td>
           </tr> 	
           <tr>
		   <td>BookBy:</td>
           <td><p><%= request.getParameter("bookby")%></p></td>
           </tr>
           <tr>
		   <td>BookFrom:</td>
           <td><p><%= request.getParameter("bookfrom")%></p></td>
           </tr> 
           <tr>
		   <td>BookTo:</td>
           <td><p><%= request.getParameter("bookto")%></p></td>
            </tr> 
           <tr>
		   
		   <td><input type="submit" name="submit" value="Logout"></td>
		   </tr>
        </table>
     </form>
           <table align="left" style="padding-top: 240px;padding-left: 0px">
              <tr>
              <td></td>
              <td><button onclick="myFunction()">Print</button></td>
              </tr>
           </table>
   <script>
       function myFunction() 
         {
           window.print();
         }
   </script>

</body>
</html>