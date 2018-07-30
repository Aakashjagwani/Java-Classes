<%
	
	String s=request.getParameter("un");
	String s1=request.getParameter("pass");
	if(s.equals("Admin") && s1.equals("Admin"))
	{
				out.println("Welcome");
	}
	else
	{
		out.println("wrong");
	}

%>