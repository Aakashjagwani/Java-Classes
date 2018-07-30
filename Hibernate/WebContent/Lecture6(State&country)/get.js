/**
 * 
 */
function fnchange()
{
		var x=document.getElementById("1");
		var y=document.getElementById("2");
		
		var htp = new XMLHttpRequest();
		htp.onreadystatechange = function ()
		{
			y.options.length=null;
				if( htp.readyState==4)
					{
						var json=JSON.parse(htp.responseText);
						for(var i=0;i<json.length;i++)
							{
								var opt=document.createElement("option");
								opt.value=json[i].sid;
								opt.text=json[i].sname;
								y.options.add(opt);
								console.log(y);
							}
					}		
		}
		htp.open("GET","../Json?cn="+x.value ,true);
		htp.send();
	}

