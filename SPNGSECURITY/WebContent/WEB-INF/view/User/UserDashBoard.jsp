<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" data-textdirection="LTR" class="loading">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Robust admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, robust admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Dashboard eCommerce - Robust Bootstrap Admin Template</title>
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
    <link rel="stylesheet" type="text/css" href="resource/css/jquery-jvectormap-2.0.3.css">
    <link rel="stylesheet" type="text/css" href="resource/css/morris.css">
    <link rel="stylesheet" type="text/css" href="resource/css/unslider.css">
    <link rel="stylesheet" type="text/css" href="resource/css/climacons.min.css">
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
    <link rel="stylesheet" type="text/css" href="resource/css/palette-gradient.min.css">
    <link rel="stylesheet" type="text/css" href="resource/css/clndr.min.css">
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <link rel="stylesheet" type="text/css" href="resource/css/style.css">
    <!-- END Custom CSS-->
  </head>
  <body data-open="click" data-menu="vertical-menu" data-col="2-columns" class="vertical-layout vertical-menu 2-columns  fixed-navbar">

    <!-- navbar-fixed-top-->
    <nav class="header-navbar navbar navbar-with-menu navbar-fixed-top navbar-semi-dark navbar-shadow">
      <div class="navbar-wrapper">
        <div class="navbar-header">
          <ul class="nav navbar-nav">
            <li class="nav-item mobile-menu hidden-md-up float-xs-left"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5 font-large-1"></i></a></li>
            <li class="nav-item"><a href="index.html" class="navbar-brand nav-link"><img alt="branding logo" src="resource/image/robust-logo-light.png" data-expand="resource/image/robust-logo-light.png" data-collapse="resource/image/robust-logo-small.png" class="brand-logo"></a></li>
            <li class="nav-item hidden-md-up float-xs-right"><a data-toggle="collapse" data-target="#navbar-mobile" class="nav-link open-navbar-container"><i class="icon-ellipsis pe-2x icon-icon-rotate-right-right"></i></a></li>
          </ul>
        </div>
        <div class="navbar-container content container-fluid">
          <jsp:include page="userHeader.jsp"></jsp:include>
        </div>
      </div>
    </nav>
    <div id="fullscreen-search" class="fullscreen-search">
      <form class="fullscreen-search-form">
        <input type="search" placeholder="Search..." class="fullscreen-search-input">
        <button type="submit" class="fullscreen-search-submit">Search</button>
      </form>
      <div class="fullscreen-search-content">
        <div class="fullscreen-search-options">
          <div class="row">
            <div class="col-sm-12">
              <fieldset>
                <label class="custom-control custom-checkbox display-inline">
                  <input type="checkbox" class="custom-control-input"><span class="custom-control-indicator"></span><span class="custom-control-description m-0">All</span>
                </label>
                <label class="custom-control custom-checkbox display-inline">
                  <input type="checkbox" class="custom-control-input"><span class="custom-control-indicator"></span><span class="custom-control-description m-0">People</span>
                </label>
                <label class="custom-control custom-checkbox display-inline">
                  <input type="checkbox" class="custom-control-input"><span class="custom-control-indicator"></span><span class="custom-control-description m-0">Project</span>
                </label>
                <label class="custom-control custom-checkbox display-inline">
                  <input type="checkbox" class="custom-control-input"><span class="custom-control-indicator"></span><span class="custom-control-description m-0">Task</span>
                </label>
              </fieldset>
            </div>
          </div>
        </div>
        <div class="fullscreen-search-result mt-2">
          <div class="row">
            <div class="col-lg-4">
              <h3>People</h3>
              <div class="media"><a href="#" class="media-left"><img src="resource/image/avatar-s-2.png" alt="Generic placeholder image" class="media-object rounded-circle"></a>
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Karmen Dartez</a></h5>
                  <p class="mb-0"><span class="tag tag-pill mr-1 tag-danger">JavaScript</span><span class="tag tag-pill mr-1 tag-primary">HTML</span></p>
                  <p><span class="font-weight-bold">Sr. Developer - </span><a href="mailto:john@example.com">karmen@example.com</a></p>
                </div>
              </div>
              <div class="media"><a href="#" class="media-left"><img src="resource/image/avatar-s-3.png" alt="Generic placeholder image" class="media-object rounded-circle"></a>
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Scot Loh</a></h5>
                  <p class="mb-0"><span class="tag tag-pill mr-1 tag-danger">PhotoShop</span><span class="tag tag-pill mr-1 tag-warning">UX</span></p>
                  <p><span class="font-weight-bold">Sr. UI/UX Desugner - </span><a href="mailto:john@example.com">scot@example.com</a></p>
                </div>
              </div>
              <div class="media"><a href="#" class="media-left"><img src="resource/image/avatar-s-5.png" alt="Generic placeholder image" class="media-object rounded-circle"></a>
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Kim Willmore</a></h5>
                  <p class="mb-0"><span class="tag tag-pill mr-1 tag-warning">CSS</span><span class="tag tag-pill mr-1 tag-danger">HTML</span></p>
                  <p><span class="font-weight-bold">UI Developer - </span><a href="mailto:john@example.com">kim@example.com</a></p>
                </div>
              </div>
            </div>
            <div class="col-lg-4">
              <h3>Project</h3>
              <div class="media">
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">WordPress Template Support</a></h5>
                  <progress value="25" max="100" class="progress progress-xs progress-success mb-0">25%</progress>
                  <p class="mb-0">Collicitudin vel metus scelerisque ante  commodo.</p>
                  <p><span class="tag tag-pill tag-success">In Progress</span><span class="tag tag-default tag-default float-sm-right">25% Completed</span></p>
                </div>
              </div>
              <div class="media">
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Application UI/UX</a></h5>
                  <progress value="100" max="100" class="progress progress-xs progress-info mb-0">100%</progress>
                  <p class="mb-0">Cetus scelerisque ante sollicitudin commodo.</p>
                  <p><span class="tag tag-pill tag-info">Completed</span><span class="tag tag-default tag-default float-sm-right">100% Completed</span></p>
                </div>
              </div>
              <div class="media">
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">SEO Project</a></h5>
                  <progress value="65" max="100" class="progress progress-xs progress-warning mb-0">65%</progress>
                  <p class="mb-0">Notifications scelerisque ante sollicitudin commodo.</p>
                  <p><span class="tag tag-pill tag-warning">Delayed</span><span class="tag tag-default tag-default float-sm-right">65% Completed</span></p>
                </div>
              </div>
            </div>
            <div class="col-lg-4">
              <h3>Task</h3>
              <div class="media">
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Create the new layout for menu</a></h5>
                  <p class="mb-0">Pcelerisque ulla vel metus  ante sollicitudin commodo.</p>
                  <p><span class="tag tag-pill tag-danger">Open</span><span class="tag tag-default tag-default tag-default tag-icon float-sm-right"><i class="icon-calendar5"></i> 22 January, 16</span></p>
                </div>
              </div>
              <div class="media">
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Addition features on footer</a></h5>
                  <p class="mb-0">Tuaiulla vel metus scelerisque ante sollicitudin commodo.</p>
                  <p><span class="tag tag-pill tag-warning">On hold</span><span class="tag tag-default tag-default tag-default tag-icon float-sm-right"><i class="icon-calendar5"></i> 24 January, 16</span></p>
                </div>
              </div>
              <div class="media">
                <div class="media-body">
                  <h5 class="media-heading"><a href="#">Remove TODO comments</a></h5>
                  <p class="mb-0">Mulullametu vel  scelerisque ante sollicitudin commodo.</p>
                  <p><span class="tag tag-pill tag-info">Resolved</span><span class="tag tag-default tag-default tag-default tag-icon float-sm-right"><i class="icon-calendar5"></i> 25 January, 16</span></p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div><span class="fullscreen-search-close"></span>
    </div>
    <div class="fullscreen-search-overlay"></div>

    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <!-- main menu-->
   <jsp:include page="userMenu.jsp"></jsp:include> 
        <!-- / main menu-->

    <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><!-- Sales stats -->
<div class="row">
    <div class="col-xs-12">
        <div class="card">
            <div class="card-body">
                <div class="card-block">
                    <div class="row">
                        <div class="col-xl-3 col-lg-6 col-sm-12 border-right-blue-grey border-right-lighten-5">
                            <div class="media px-1">
                                <div class="media-left media-middle">
                                    <i class="icon-box font-large-1 blue-grey"></i>
                                </div>
                                <div class="media-body text-xs-right">
                                    <span class="font-large-2 text-bold-300 info">5,879</span>
                                </div>
                                <p class="text-muted">Total Products <span class="info float-xs-right"><i class="icon-arrow-up4 info"></i> 16.89%</span></p>
                                <progress class="progress progress-sm progress-info" value="80" max="100"></progress>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-6 col-sm-12 border-right-blue-grey border-right-lighten-5">
                            <div class="media px-1">
                                <div class="media-left media-middle">
                                    <i class="icon-tag3 font-large-1 blue-grey"></i>
                                </div>
                                <div class="media-body text-xs-right">
                                    <span class="font-large-2 text-bold-300 deep-orange">423</span>
                                </div>
                                <p class="text-muted">New Orders<span class="deep-orange float-xs-right"><i class="icon-arrow-up4 deep-orange"></i> 5.14%</span></p>
                                <progress class="progress progress-sm progress-deep-orange" value="45" max="100"></progress>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-6 col-sm-12 border-right-blue-grey border-right-lighten-5">
                            <div class="media px-1">
                                <div class="media-left media-middle">
                                    <i class="icon-shuffle3 font-large-1 blue-grey"></i>
                                </div>
                                <div class="media-body text-xs-right">
                                    <span class="font-large-2 text-bold-300 danger">61%</span>
                                </div>
                                <p class="text-muted">Conversion Rate<span class="danger float-xs-right"><i class="icon-arrow-down4 danger"></i> 2.24%</span></p>
                                <progress class="progress progress-sm progress-danger" value="75" max="100"></progress>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-6 col-sm-12">
                            <div class="media px-1">
                                <div class="media-left media-middle">
                                    <i class="icon-dollar font-large-1 blue-grey"></i>
                                </div>
                                <div class="media-body text-xs-right">
                                    <span class="font-large-2 text-bold-300 success">$6,87M</span>
                                </div>
                                <p class="text-muted">Total Profit<span class="success float-xs-right"><i class="icon-arrow-up4 success"></i> 43.84%</span></p>
                                <progress class="progress progress-sm progress-success" value="60" max="100"></progress>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ Sales stats -->
<!-- Sales by Campaigns & Year -->
<div class="row">
    <div class="col-xl-8 col-lg-12">
        <div class="card">
            <div class="card-header no-border-bottom">
                <h4 class="card-title pb-1">Sales by Campaigns</h4>
                <a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="reload"><i class="icon-reload"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-body collapse in">
                <div class="card-block">
                    <div id="sales-campaigns" class="height-300 echart-container"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-lg-12">
        <div class="card card-inverse bg-danger">
            <div class="card-header no-border-bottom">
                <h4 class="card-title">Yearly Sales</h4>
            </div>
            <div class="card-body">
                <div class="chartjs">
                    <canvas id="yearly-sales" class="height-350 px-2 pt-2"></canvas>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ Sales by Campaigns & Year -->
<!-- Top Selling Phones & Customer Browser's Stats -->
<div class="row">
    <div class="col-md-6 col-sm-12">
        <div class="card card-inverse bg-gradient-y-danger">
            <div class="card-header no-border-bottom">
                <h4 class="card-title">Customer Browser's Stats</h4>
            </div>
            <div class="card-body collapse in">
                <div class="card-block">
                    <div id="browser-stats" class="height-300 echart-container"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-lg-6 col-sm-12">
        <div class="card card-inverse bg-success">
            <div class="card-header no-border-bottom">
                <h4 class="card-title">Top Selling Phones</h4>
            </div>
            <div class="card-body collapse in">
                <div class="card-block">
                    <div id="top-selling-phones-doughnut" class="height-300 echart-container"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ Top Selling Phones & Customer Browser's Stats -->
<!-- Recent Orders -->
<div class="row">
    <div class="col-xl-4 col-lg-12">
        <div class="card card-inverse card-primary text-xs-center">
            <div class="card-body">
                <div class="card-block pt-3">
                    <img src="resource/image/01.png" alt="element 01" width="140" class="float-xs-left">
                    <h4 class="card-title mt-3">Brand Minute</h4>
                    <p class="card-text">Donut toffee candy brownie.</p>
                    <button class="btn btn-primary btn-darken-3">Buy Now</button>
                </div>
            </div>
        </div>
        <div class="card bg-primary">
            <div class="card-body">
                <div class="card-block">
                    <div class="media">
                        <div class="media-left media-middle">
                            <i class="icon-bar-graph white font-large-2 float-xs-left"></i>
                        </div>
                        <div class="media-body white text-xs-right">
                            <h3>1,278</h3>
                            <span>Most Loved</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-8 col-lg-12">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Recent Orders</h4>
                <a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="reload"><i class="icon-reload"></i></a></li>
                        <li><a data-action="expand"><i class="icon-expand2"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-body">
                <div class="card-block">
                    <p>Total paid invoices 240, unpaid 150. <span class="float-xs-right"><a href="project-summary.html" target="_blank">Invoice Summary <i class="icon-arrow-right2"></i></a></span></p>
                </div>
                <div class="table-responsive">
                    <table id="recent-orders" class="table table-hover mb-0">
                        <thead>
                            <tr>
                                <th>SKU</th>
                                <th>Invoice#</th>
                                <th>Customer Name</th>
                                <th>Status</th>
                                <th>Amount</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="text-truncate">PO-10521</td>
                                <td class="text-truncate"><a href="#">INV-001001</a></td>
                                <td class="text-truncate">Elizabeth W.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-success">Paid</span></td>
                                <td class="text-truncate">$ 1200.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate">PO-532521</td>
                                <td class="text-truncate"><a href="#">INV-01112</a></td>
                                <td class="text-truncate">Doris R.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-warning">Overdue</span></td>
                                <td class="text-truncate">$ 5685.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate">PO-05521</td>
                                <td class="text-truncate"><a href="#">INV-001012</a></td>
                                <td class="text-truncate">Andrew D.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-success">Paid</span></td>
                                <td class="text-truncate">$ 152.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate">PO-15521</td>
                                <td class="text-truncate"><a href="#">INV-001401</a></td>
                                <td class="text-truncate">Megan S.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-success">Paid</span></td>
                                <td class="text-truncate">$ 1450.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate">PO-32521</td>
                                <td class="text-truncate"><a href="#">INV-008101</a></td>
                                <td class="text-truncate">Walter R.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-warning">Overdue</span></td>
                                <td class="text-truncate">$ 685.00</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ Recent Orders -->
<!-- Map Based Selling -->
<div class="row">
    <div class="col-xs-12">
        <div class="card box-shadow-0">
            <div class="card-body collapse in">
                <div class="row">
                    <div class="col-xl-8 col-lg-12">
                        <div id="world-map-markers" class="height-450"></div>
                    </div>
                    <div class="col-xl-4 col-lg-12">
                        <div class="card-block">
                            <h4 class="card-title py-1 text-xs-center">Sales All Over The World</h4>
                            <div class="row">
                                <div class="col-xl-12 col-lg-4 col-sm-12">
                                    <div class="media">
                                        <div class="media-body">
                                            <span>Total Profit <i class="icon-arrow-up4 success"></i> <span class="teal accent-3">6.89%</span></span>
                                            <h2 class="mb-0">$47.8K</h2>
                                        </div>
                                        <div class="media-right media-top pr-2">
                                            <i class="icon-dollar font-large-1"></i>
                                        </div>
                                    </div>
                                    <div id="map-total-profit" class="height-75"></div>
                                </div>
                                <div class="col-xl-12 col-lg-4 col-sm-12">
                                    <div class="media">
                                        <div class="media-body">
                                            <span>Total Orders <i class="icon-arrow-down4 deep-orange accent-3"></i> <span class="deep-orange accent-3">4.27%</span></span>
                                            <h2 class="mb-0">789</h2>
                                        </div>
                                        <div class="media-right media-top pr-2">
                                            <i class="icon-cart font-large-1"></i>
                                        </div>
                                    </div>
                                    <div id="map-total-orders" class="height-75"></div>
                                </div>
                                <div class="col-xl-12 col-lg-4 col-sm-12">
                                    <div class="sales pr-2">
                                        <div class="sales-today mb-1">
                                            <p class="m-0">Today <span class="sucess float-xs-right"><i class="icon-arrow-up4 success"></i> 6.89%</span></p>
                                            <progress class="progress progress-sm progress-success progress-accent-3 mb-0" value="70" max="100"></progress>
                                        </div>
                                        <div class="sales-yesterday">
                                            <p class="m-0">Yesterday <span class="deep-orange accent-2 float-xs-right"><i class="icon-arrow-down4 deep-orange accent-3"></i> 4.18%</span></p>
                                            <progress class="progress progress-sm progress-deep-orange progress-accent-2 mb-0" value="60" max="100"></progress>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ Map Based Selling -->
<!-- social updates -->
<div class="row">
    <div class="col-xl-4 col-md-12 col-sm-12">
        <div class="card bg-twitter white">
            <div class="card-body p-2">
                <div class="card-block">
                    <div class="text-xs-center mb-1">
                        <i class="icon-twitter3 font-large-3"></i>
                    </div>
                    <div class="tweet-slider">
                        <ul class="text-xs-center">
                            <li>Congratulations to Rob Jones in accounting for winning our <span class="yellow">#NFL</span> football pool!</li>
                            <li>Contests are a great thing to partner on. Partnerships immediately <span class="yellow">#DOUBLE</span> the reach.</li>
                            <li>Puns, humor, and quotes are great content on <span class="yellow">#Twitter</span>. Find some related to your business.</li>
                            <li>Are there <span class="yellow">#common-sense</span> facts related to your business? Combine them with a great photo.</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-md-12 col-sm-12">
        <div class="card card-outline-info text-xs-center box-shadow-0">
            <div class="card-body">
                <img src="resource/image/07.png" alt="element 04" class="float-xs-left mt-3 img-fluid" width="140">
                <div class="card-block pt-3">
                    <h4 class="card-title mt-3">New Arriaval</h4>
                    <p class="card-text">Donut toffee candy brownie soufflé macaroon.</p>
                    <button class="btn btn-info">Buy Now</button>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-md-12 col-sm-12">
        <div class="card bg-facebook white">
            <div class="card-body p-2">
                <div class="card-block">
                    <div class="text-xs-center mb-1">
                        <i class="icon-facebook3 font-large-3"></i>
                    </div>
                    <div class="fb-post-slider">
                        <ul class="text-xs-center">
                            <li>Congratulations to Rob Jones in accounting for winning our #NFL football pool!</li>
                            <li>Contests are a great thing to partner on. Partnerships immediately #DOUBLE the reach.</li>
                            <li>Puns, humor, and quotes are great content on #Twitter. Find some related to your business.</li>
                            <li>Are there #common-sense facts related to your business? Combine them with a great photo.</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ social updates -->
<!-- most selling products -->
<div class="row">
    <div class="col-lg-4 col-md-12">
        <div class="card">
            <div class="card-body">
                <img class="card-img-top img-fluid" src="resource/image/25.jpg" alt="Card image cap">
                <div class="card-block">
                    <h4 class="card-title">Smart Wearable</h4>
                    <p class="card-text">Oat cake ice cream candy chocolate cake.</p>
                </div>
            </div>
            <div class="card-footer text-muted">
                <span class="float-xs-left">$349</span>
                <span class="float-xs-right">Add To Cart <i class="icon-cart31"></i></span>
            </div>
        </div>
    </div>
    <div class="col-lg-4 col-md-12">
        <div class="card text-xs-center">
            <div class="card-body">
                <img class="card-img-top img-fluid" src="resource/image/24.png" alt="Card image cap">
                <div class="card-block">
                    <h4 class="card-title">Formal Shoes</h4>
                    <p class="card-text">Some quick example text.</p>
                    <div class="btn-group" role="group" aria-label="Basic example">
                        <span class="btn btn-outline-grey">$159</span>
                        <button type="button" class="btn btn-outline-grey">Shop Now <i class="icon-cart3"></i></button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-lg-4 col-md-12">
        <div class="card">
            <div class="card-body">
                <img class="card-img-top img-fluid" src="resource/image/22.jpg" alt="Card image cap">
                <div class="card-block">
                    <h4 class="card-title">Sunglass</h4>
                    <p class="card-text">Some quick example text.</p>
                </div>
            </div>
            <div class="card-footer text-muted">
                <span class="float-xs-left">
                    <del class="grey">$99</del>
                    <span class="ml-1">$49</span>
                </span>
                <span class="float-xs-right"><i class="icon-heart6"></i> Like</span>
            </div>
        </div>
    </div>
</div>
<!--/ most selling products-->

        </div>
      </div>
    </div>
    <!-- /////////////////////////	///////////////////////////////////////////////////-->

	<jsp:include page="userFooter.jsp"></jsp:include>
   
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
    <script src="resource/js/raphael-min.js" type="text/javascript"></script>
    <script src="resource/js/morris.min.js" type="text/javascript"></script>
    <script src="resource/js/chart.min.js" type="text/javascript"></script>
    <script src="resource/js/jquery-jvectormap-2.0.3.min.js" type="text/javascript"></script>
    <script src="resource/js/jquery-jvectormap-world-mill.js" type="text/javascript"></script>
    <script src="resource/js/moment.min.js" type="text/javascript"></script>
    <script src="resource/js/underscore-min.js" type="text/javascript"></script>
    <script src="resource/js/clndr.min.js" type="text/javascript"></script>
    <script src="resource/js/echarts.js" type="text/javascript"></script>
    <script src="resource/js/unslider-min.js" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <!-- build:js app-assets/js/app.min.js-->
    <script src="resource/js/app-menu.min.js" type="text/javascript"></script>
    <script src="resource/js/app.min.js" type="text/javascript"></script>
    <script src="resource/js/fullscreenSearch.min.js" type="text/javascript"></script>
    <!-- /build-->
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="resource/js/dashboard-ecommerce.min.js" type="text/javascript"></script>
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
