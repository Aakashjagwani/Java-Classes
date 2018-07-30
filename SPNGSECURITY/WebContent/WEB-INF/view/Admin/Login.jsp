<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>

<html lang="en" data-textdirection="LTR" class="loading">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Robust admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, robust admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Login Page - Robust Bootstrap Admin Template</title>
    <link rel="apple-touch-icon" sizes="60x60" href="resource/image/apple-icon-60.png">
    <link rel="apple-touch-icon" sizes="76x76" href="resource/image/apple-icon-76.png">
    <link rel="apple-touch-icon" sizes="120x120" href="resource/image/apple-icon-120.png">
    <link rel="apple-touch-icon" sizes="152x152" href="resource/image/apple-icon-152.png">
    <link rel="shortcut icon" type="image/x-icon" href="resource/image/favicon.ico">
    <link rel="shortcut icon" type="image/png" href="resource/image/favicon-32.png">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href="resource/css/bootstrap.min.css">
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href="resource/css/icomoon.css">
    <link rel="stylesheet" type="text/css" href="resource/css/flag-icon.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/slick.css">
    <link rel="stylesheet" type="text/css" href="resource/css/pace.css">
    <link rel="stylesheet" type="text/css" href="resource/css/icheck.css">
    <link rel="stylesheet" type="text/css" href="resource/css/custom.css">
    <!-- END VENDOR CSS-->
    <!-- BEGIN ROBUST CSS-->
    <link rel="stylesheet" type="text/css" href="resource/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/app.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/style.css">
    <!-- END ROBUST CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href="resource/css/vertical-menu.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/vertical-overlay-menu.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/login-register.min.css">
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <link rel="stylesheet" type="text/css" href="resource/css/style.css">
    <!-- END Custom CSS-->
  </head>
  <body data-open="click" data-menu="vertical-menu" data-col="1-column" class="vertical-layout vertical-menu 1-column  blank-page blank-page">
    <!-- ////////////////////////////////////////////////////////////////////////////-->
    <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><section class="flexbox-container">
    <div class="col-md-4 offset-md-4 col-xs-10 offset-xs-1  box-shadow-2 p-0">
        <div class="card border-grey border-lighten-3 m-0">
            <div class="card-header no-border">
                <div class="card-title text-xs-center">
                    <div class="p-1"><img src="resource/image/robust-logo-dark.png" alt="branding logo"></div>
                </div>
                <h6 class="card-subtitle line-on-side text-muted text-xs-center font-small-3 pt-2"><span>Login with CBESU</span></h6>
            </div>
            <div class="card-body collapse in">
                <div class="card-block">
                    <form class="form-horizontal form-simple" action="spring_verify" method="post">
                    
                       		<fieldset class="form-group position-relative has-icon-left mb-1">
							<input type="text" name="username" class="form-control form-control-lg input-lg" placeholder="E-MAIL"/>
							<div class="form-control-position">
							    <i class="icon-mail6"></i>
							</div>
						</fieldset>
						
				 <fieldset class="form-group position-relative has-icon-left">
                            <input type="password" name="password" class="form-control form-control-lg input-lg" placeholder="Password"/>
                            <div class="form-control-position">
                                <i class="icon-key3"></i>
                            </div>
                        </fieldset>
                        
                        <fieldset class="form-group row">
                            <div class="col-md-6 col-xs-12 text-xs-center text-md-left">
                                <fieldset>
                                <div class="icheckbox_square-blue" style="position: relative;">
								<input id="remember-me" class="chk-remember" type="checkbox" style="position: absolute; opacity: 0;">
								<ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: none repeat scroll 0% 0% rgb(255, 255, 255); border: 0px none; opacity: 0;"></ins>
								</div>
                                </fieldset>
                           
                            </div>
                        </fieldset>
                   <i class="icon-unlock2"></i><input type="submit" name="login" value="login" class="btn btn-primary btn-lg btn-block">
                    </form>
                </div>
            </div>
            <div class="card-footer">
                <div class="">
                    <a href="loadReg.htm" class="card-link">Sign Up</a>
                </div>
            </div>
        </div>
    </div>
</section>

        </div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->

    <!-- BEGIN VENDOR JS-->
    <!-- build:js app-assets/js/vendors.min.js-->
    <script src="resource/js/jquery.min.js" type="text/javascript"></script>
    <script src="resource/js/tether.min.js" type="text/javascript"></script>
    <script src="resource/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="resource/js/perfect-scrollbar.jquery.min.js" type="text/javascript"></script>
    <script src="resource/js/unison.min.js" type="text/javascript"></script>
    <script src="resource/js/blockUI.min.js" type="text/javascript"></script>
    <script src="resource/js/jquery.matchHeight-min.js" type="text/javascript"></script>
    <script src="resource/js/jquery-sliding-menu.js" type="text/javascript"></script>
    <script src="resource/js/slick.min.js" type="text/javascript"></script>
    <script src="resource/js/screenfull.min.js" type="text/javascript"></script>
    <script src="resource/js/pace.min.js" type="text/javascript"></script>
    <!-- /build-->
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src="resource/js/icheck.min.js" type="text/javascript"></script>
    <script src="resource/js/jqBootstrapValidation.js" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <!-- build:js app-assets/js/app.min.js-->
    <script src="resource/js/app-menu.min.js" type="text/javascript"></script>
    <script src="resource/js/app.min.js" type="text/javascript"></script>
    <script src="resource/js/fullscreenSearch.min.js" type="text/javascript"></script>
    <!-- /build-->
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="resource/js/form-login-register.min.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
  	<script>
	  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
	  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
	  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

	  ga('create', 'UA-96096445-1', 'auto');
	  ga('send', 'pageview');

	</script>
</body>
</html>
