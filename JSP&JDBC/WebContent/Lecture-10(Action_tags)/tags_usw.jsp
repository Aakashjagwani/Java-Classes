<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a1" class="Action_tags.abc"></jsp:useBean>
<jsp:setProperty property="fn" name="a1" value="Aakash"/>
<jsp:getProperty property="fn" name="a1"/>

<jsp:useBean id="a2" class="Action_tags.abc"></jsp:useBean>
<jsp:setProperty property="ln" name="a2" value="jagwani"/>
<jsp:getProperty property="ln" name="a2"/>
</body>
</html>