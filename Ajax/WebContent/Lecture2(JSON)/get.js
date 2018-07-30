
function fnchange(){
		var x=document.getElementById("1");
		var y=document.getElementById("2");
		
		var htp = new XMLHttpRequest();
		htp.onreadystatechange = function ()
		{
				if( htp.readyState==4)
					{
						var json=JSON.parse(htp.responseText);
						for(var i=0;i<json.length;i++)
							{
								var opt=document.createElement("option");
								opt.value=json[i].sid;
								opt.text=json[i].sname;
								y.options.add(opt);
							}
					
					}		
		}
		htp.open("GET","json.jsp?cn="+x.value ,true);
		htp.send();
	}

