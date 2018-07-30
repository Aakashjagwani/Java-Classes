<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<c:set var="i" value="Aakash"></c:set>	

<c:set var="i1" value="a,b,c,d"></c:set>
<c:set var="i2" value="${f:split(i1,',')}"></c:set>
<c:set var="i3" value="${f:join(i2,'-') }"></c:set>
<c:forEach items="${i3 }" var="q">
	${q}
</c:forEach><br><br>

	${f:toUpperCase(i) }	<br><br>
	${f:contains(i,"kas") }<br><br>
	${f:endsWith(i,"h") }<br><br>
	${f:indexOf(i,"s") }<br><br>
	${f:split(i,"k")[0] }<br><br>
	${f:replace(i,"Aakash","Harshal") }<br><br>
	${f:substring(i,2,4) }<br><br>
	${f:startsWith("Harshal","Har") }<br><br>

</body>
</html>