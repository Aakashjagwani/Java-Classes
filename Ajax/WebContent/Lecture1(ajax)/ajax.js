/**
 * 
 */

function fnlogic(){
		var x=document.getElementById("un");
		var y=document.getElementById("pass");
		
		var htp = new XMLHttpRequest();
		htp.onreadystatechange = function ()
		{
				if(htp.readyState==4)
					{
						alert(htp.responseText);	
					}		
		}
		htp.open("POST","2.jsp?un="+x.value +"&pass="+y.value,true);
		htp.send();
	}