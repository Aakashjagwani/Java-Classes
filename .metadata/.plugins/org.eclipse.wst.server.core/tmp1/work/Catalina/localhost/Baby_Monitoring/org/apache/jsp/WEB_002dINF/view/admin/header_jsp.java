/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M13
 * Generated at: 2018-03-01 10:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("        <div id=\"header\">\r\n");
      out.write("            <header class=\"clearfix\">\r\n");
      out.write("                <!-- Branding -->\r\n");
      out.write("                <div class=\"branding\">\r\n");
      out.write("                    <a class=\"brand\" href=\"index.html\">\r\n");
      out.write("                        <span>Baby Monitoring </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a role=\"button\" tabindex=\"0\" class=\"offcanvas-toggle visible-xs-inline\">\r\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Branding end -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Left-side navigation -->\r\n");
      out.write("                <ul class=\"nav-left pull-left list-unstyled list-inline\">\r\n");
      out.write("                    <li class=\"leftmenu-collapse\">\r\n");
      out.write("                        <a role=\"button\" tabindex=\"0\" class=\"collapse-leftmenu\">\r\n");
      out.write("                            <i class=\"fa fa-outdent\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown leftmenu-collapse\">\r\n");
      out.write("                        <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"fa fa-plus mr-5\"></i>New \r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu pull-left panel panel-default\" role=\"menu\">\r\n");
      out.write("                            <ul class=\"list-group\">\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" class=\"media\" href=\"addPackage.html\">\r\n");
      out.write("                                        <span class=\"pull-left media-object\">\r\n");
      out.write("                                            <i class=\"fa fa-briefcase\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">Add Package</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" class=\"media\" href=\"viewFeedback.html\">\r\n");
      out.write("                                        <span class=\"pull-left media-object\">\r\n");
      out.write("                                            <i class=\"fa fa-area-chart\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">View Feedback</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" class=\"media\" href=\"viewComplain.html\">\r\n");
      out.write("                                        <span class=\"pull-left media-object\">\r\n");
      out.write("                                            <i class=\"fa fa-user\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">View Complain</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" class=\"media\" href=\"addCase.html\">\r\n");
      out.write("                                        <span class=\"pull-left media-object\">\r\n");
      out.write("                                            <i class=\"fa fa-file-text\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">Add Case</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- Left-side navigation end -->\r\n");
      out.write("                <div class=\"search\" id=\"main-search\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control underline-input\" placeholder=\"Explore Portal...\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Search end -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Right-side navigation -->\r\n");
      out.write("                <ul class=\"nav-right pull-right list-inline\">\r\n");
      out.write("                    <li class=\"dropdown messages\">\r\n");
      out.write("                        <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                            <div class=\"notify\">\r\n");
      out.write("                                <span class=\"heartbit\"></span>\r\n");
      out.write("                                <span class=\"point\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu pull-right panel panel-default\" role=\"menu\">\r\n");
      out.write("                            <ul class=\"list-group\">\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object thumb thumb-sm\">\r\n");
      out.write("                                            <img src=\"assets/images/pi-avatar.jpg\" alt=\"\" > </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">Lucas sent you a message</span>\r\n");
      out.write("                                            <small class=\"text-muted\">9 minutes ago</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object  thumb thumb-sm\">\r\n");
      out.write("                                            <img src=\"assets/images/Jane-avatar.jpg\" alt=\"\" > </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">Jane sent you a message</span>\r\n");
      out.write("                                            <small class=\"text-muted\">27 minutes ago</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object  thumb thumb-sm\">\r\n");
      out.write("                                            <img src=\"assets/images/random-avatar1.jpg\" alt=\"\" > </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">Lee sent you a message</span>\r\n");
      out.write("                                            <small class=\"text-muted\">2 hour ago</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object  thumb thumb-sm\">\r\n");
      out.write("                                            <img src=\"adminResources/images/random-avatar3.jpg\" alt=\"\" > </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">Rihtik sent you a message</span>\r\n");
      out.write("                                            <small class=\"text-muted\">8 hours ago</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <div class=\"panel-footer\">\r\n");
      out.write("                                <a role=\"button\" tabindex=\"0\">Show all messages\r\n");
      out.write("                                    <i class=\"pull-right fa fa-angle-right\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown notifications\">\r\n");
      out.write("                        <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"fa fa-bell\"></i>\r\n");
      out.write("                            <div class=\"notify\">\r\n");
      out.write("                                <span class=\"heartbit\"></span>\r\n");
      out.write("                                <span class=\"point\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu pull-right panel panel-default\">\r\n");
      out.write("                            <ul class=\"list-group\">\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object media-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-ban\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">User Lucas cancelled account</span>\r\n");
      out.write("                                            <small class=\"text-muted\">12 minutes ago</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object media-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-spotify\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">2 voice mails</span>\r\n");
      out.write("                                            <small class=\"text-muted\">Neque porro quisquam est</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-group-item\">\r\n");
      out.write("                                    <a role=\"button\" tabindex=\"0\" class=\"media\">\r\n");
      out.write("                                        <span class=\"pull-left media-object media-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-whatsapp\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <span class=\"block\">8 voice messanger</span>\r\n");
      out.write("                                            <small class=\"text-muted\">8 texts</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <div class=\"panel-footer\">\r\n");
      out.write("                                <a role=\"button\" tabindex=\"0\">Show all notifications\r\n");
      out.write("                                    <i class=\"fa fa-angle-right pull-right\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown nav-profile\">\r\n");
      out.write("                        <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <img src=\"adminResources/images/profile-photo.jpg\" alt=\"\" class=\"0 size-30x30\"> </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu pull-right\" role=\"menu\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"user-info\">\r\n");
      out.write("                                    <div class=\"user-name\">Alexander</div>\r\n");
      out.write("                                    <div class=\"user-position online\">Available</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"profile.html\" role=\"button\" tabindex=\"0\">\r\n");
      out.write("                                    <span class=\"label label-success pull-right\">80%</span>\r\n");
      out.write("                                    <i class=\"fa fa-user\"></i>Profile</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a role=\"button\" tabindex=\"0\">\r\n");
      out.write("                                    <span class=\"label label-info pull-right\">new</span>\r\n");
      out.write("                                    <i class=\"fa fa-check\"></i>Tasks</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a role=\"button\" tabindex=\"0\">\r\n");
      out.write("                                    <i class=\"fa fa-cog\"></i>Settings</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"locked.html\" role=\"button\" tabindex=\"0\">\r\n");
      out.write("                                    <i class=\"fa fa-lock\"></i>Lock</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"spring_logout\" role=\"button\" tabindex=\"0\">\r\n");
      out.write("                                    <i class=\"fa fa-sign-out\"></i>Logout</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- Right-side navigation end -->\r\n");
      out.write("            </header>\r\n");
      out.write("        </div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}