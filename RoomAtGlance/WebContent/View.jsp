<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script>
 function getMovie() {
          var xhttp;
          var name=document.getElementById("name").value;
          var submit=document.getElementById("submit").value;
          
          
          var url="cont?submit="+submit+"&name="+name;
          
         
          if (window.XMLHttpRequest) {
            // code for modern browsers
            xhttp = new XMLHttpRequest();
            } else {
            // code for IE6, IE5
            xhttp = new ActiveXObject("Microsoft.XMLHTTP");
          }
          xhttp.onreadystatechange = function() {
                  
            if (xhttp.readyState == 4 && xhttp.status == 200) {
              document.getElementById("id1").innerHTML = xhttp.responseText;
            }
                          
                  else
                          {
                             document.getElementById("id1").innerHTML ="";
                          }
          };
          xhttp.open("GET",url,true);
          xhttp.send();
        }
 </script> -->
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
  <li><a href="home.jsp">Home</a></li>
</ul>
</div>
<div>
   <h4 align="left">Welcome ${user}</h4>
   </div>
	<h2 align="center">THE ROOM LIST</h2>
	<table class="tb1" border="2" align="center">
		<tr>
			<td>Room No</td>
			<td>BookStatus</td>
			<td>Price</td>

		</tr>


		<c:forEach items="${list}" var="iref">
			<form action="cont">
				<tr>
					<td><input type="text" name="roomno" value="${iref.getRoomNo()}"
						readonly></td>
					<td><input type="text" name="bookstatus" value="${iref.bookStatus}"
						readonly></td>
					<td><input type="text" name="price" value="${iref.price}"
						readonly></td>
					<td><input type="submit"submit" name="submit"
						value="BOOK"/></td> 
				</tr>
			</form>
		</c:forEach>
	</table>
	<div id="id1"></div>
</body>
</html>