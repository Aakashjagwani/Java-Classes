<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Getvalue.jsp">
First Name<input type="text" name="Fn" id="1"/><br>
Last Name<input type="text" name="Ln" id="2"/><br>
CITY
<select name="CT">
	<option selected="selected" >Ahmedabad</option>
	<option>Mumbai</option>
	<option>Pune</option>
</select><br> <br>
Country
<select name="CO">
	<option selected="selected">Pakistan</option>
	<option>India</option>
	<option>Srilanka</option>
</select><br><br>
Address<textarea name="Adress" id="4"></textarea> <br><br>
Gender<br>
		<input type="radio" name="q" value="Male"  id="5"/>Male<br><br>
		<input type="radio" name="q" value="Female" id="5"/>FeMale<br><br>
Hobbies<br>
  <input type="checkbox" name="hb" value="Music"/>Music<br>
  <input type="checkbox" name="hb" value="Sports"/>Sports<br>
  <input type="checkbox" name="hb" value="Gaming"/>Gaming<br>
  <input type="checkbox" name="hb" value="Reading"/>Reading<br>
  <input type="checkbox" name="hb" value="Watching"/>Watching<br>
  <input type="submit"   name="s"  value="Submit" />
</form>
</body>
</html>