<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DATA.jsp">
	First name <input type="text" id="1" name="first name" value="First name"/><br><br>
	Last name  <input type="text" id="2" name="last name"value="last name"/> <br><br>
	User name  <input type="text" id="3" name="user name" value="User name"/><br><br>
	password   <input type="password" id="4" name="password" value="password"/><br><br>
	email 	   <input type="text" id="5" name="email" value="Email"/><br><br>
	Address    <input type="text" id="6" name="Address" value="Address"/><br><br>
	City	   	<select name="city">
				<option>Ahmedabad</option>
				<option>Mumbai</option>
				<option>Bangalore</option>
				</select><br><br>
	Gender     <input type="radio"	name="male" value="male"/> MALE<br><br>
			 	<input type="radio"	name="male" value="female">FEMALE<br><br>
	Hobbies		<br><br>
				<input type="checkbox" name="Music" value="music">MUSIC<br><br>
				<input type="checkbox" name="Music" value="Cricket">CRICKET<br><br>
				<input type="checkbox" name="Music" value="Surfing">SURFING<br><br>
				<input type="checkbox" name="Music" value="travelling">TRAVELLING<br><br> 	
	<input type="submit" name="submit" value="submit"/>
</form>
</body>
</html>