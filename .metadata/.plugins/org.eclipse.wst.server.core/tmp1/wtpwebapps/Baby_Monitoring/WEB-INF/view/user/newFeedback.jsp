<!DOCTYPE html>
<html lang="en">
    <head>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!--[if IE]>
        <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'>
        <![endif]-->
        <meta name="keywords" content="HTML5 Template" />
        <meta name="description" content="Baby House - Kids School, Kinder Garden & Play School Multipurpose HTML5 Template" />
        <meta name="author" content="itgeeksin.com" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Baby House - Kids School, Kinder Garden & Play School </title>
        <!-- Bootstrap -->
        <!-- Favicon -->
        <link rel="shortcut icon" href="userResources/images/favicon.ico" type="image/x-icon">
        <link rel="icon" href="userResources/images/favicon.ico" type="image/x-icon">
        <!-- Master Css -->
        <link href="userResources/css/main.css" rel="stylesheet">
    </head>
    <body>
        <!--//================Header start==============//-->  
		   <jsp:include page="header.jsp"></jsp:include>
           <div class="clear"></div>
        <!--//================Breadcrumb starts==============//-->
        <section>
            <div class="bredcrumb-section padTB100 positionR">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="theme-heading text-center">
                                <h3 class="text-center theme-color">Feedback</h3>
                                <span class="colorW marB10"> <i class="fa fa-child" aria-hidden="true"></i> </span>
                            </div>
                            <div class="breadcrumb-box">
                                <ul class="breadcrumb text-center colorW marB0">
                                    <li>
                                        <a href="index.html">Home</a>
                                    </li>
                                    <li class="active">Give Feedback</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--//================Breadcrumb end==============//-->
        <div class="clear"></div>
        <!--//================Register starts==============//-->
        <section class="padT80 padB50">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-8 col-xs-12 col-md-offset-3 col-sm-offset-2 col-xs-offset-0">
                        <form action="newFeedback.html" method="get">
			                        <div class="col-md-12 col-sm-12 col-xs-12">
			                            <h4 class="marB30 title">Give Feedback</h4>
			                        </div>
			                        
                        			<div class="col-md-12 col-sm-12 col-xs-12">
										<div class="btn btn-raised " >
											<%
												Integer s=(Integer) session.getAttribute("loginId");
												//out.println(s);
											%>	 
											<input type="text" id="loginId" name="loginId"value= "<%=s%>" style="display : none"/>
										</div>
									</div>
									
									<div class="col-md-12 col-sm-12 col-xs-12">
										<label class="col-sm-3 control-label">Feedback Description</label>
										<div class="btn btn-raised">
											<textarea class="form-control" id="feedbackDescription" name="feedbackDescription"  data-parsley-trigger="change" required="required">
											</textarea>
										</div>
									</div>
									<hr class="line-dashed full-witdh-line" />
									<div class="col-md-12 col-sm-12 col-xs-12">
										<label class="col-sm-3 control-label">Feedback Rating</label>
										<div class="btn btn-raised">
											<input type="number" class="form-control" min="0" max="5" id="feedbackRating" name="feedbackRating"  required="required"/>
										</div>
									</div>
									<hr class="line-dashed full-witdh-line" />
									<div class="boxs-footer text-right bg-tr-black lter dvd dvd-top">
										<button type="submit" class="btn btn-raised btn-default" id="form4Submit">Submit</button>
									</div>
						</form>
                    </div>
                </div>
            </div>
        </section>
        <!--//================Register end==============//-->
        <div class="clear"></div>
        <!--//================contact us starts==============//-->
		<jsp:include page="chotaContact.jsp"></jsp:include>
        <!--//================contact us end==============//-->
        <div class="clear"></div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="userResources/js/jquery.min.js"></script>
        <script src="userResources/js/bootstrap.min.js"></script>
        <script src="userResources/js/hover-dropdown-menu.js"></script>
        <script src="userResources/js/jquery.hover-dropdown-menu-addon.js"></script>
        <script src="userResources/js/owl.carousel.min.js"></script>
        <script src="userResources/js/main.js"></script>
    	<script type="text/javascript">
        function fn(){
        		var image=document.getElementById("anim");
        		image.style.display = ""
        	}
        </script>
    </body>
</html>