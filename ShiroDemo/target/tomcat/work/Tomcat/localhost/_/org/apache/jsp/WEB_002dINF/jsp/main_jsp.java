/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-18 14:58:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jsp/common/footer.jsp", Long.valueOf(1531047444357L));
    _jspx_dependants.put("/WEB-INF/jsp/common/header.jsp", Long.valueOf(1531047444373L));
    _jspx_dependants.put("/WEB-INF/jsp/common/js.jsp", Long.valueOf(1531047444384L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fguest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fguest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
    _005fjspx_005ftagPool_005fshiro_005fguest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!-- Meta, title, CSS, favicons, etc. -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<title>APP开发者平台</title>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- Font Awesome -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- NProgress -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/nprogress.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- iCheck -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/green.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- bootstrap-progressbar -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- JQVMap -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/jqvmap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/dropzone.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- Custom Theme Style -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/custom.min.css\"\trel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- add localcss 2016-8-18 -->\r\n");
      out.write("\t<link href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/localcss/appinfoadd.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/localcss/appinfolist.css' rel='stylesheet'>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"nav-md footer_fixed\">\r\n");
      out.write("\t<div class=\"container body\">\r\n");
      out.write("\t\t<div class=\"main_container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 left_col menu_fixed\">\r\n");
      out.write("\t\t\t\t<div class=\"left_col scroll-view\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar nav_title\" style=\"border: 0;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dev/flatform/main\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>WARE\r\n");
      out.write("\t\t\t\t\t\t\t\tBMS</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- menu profile quick info -->\r\n");
      out.write("\t\t\t\t\t<div class=\"profile\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_pic\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/images/img.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"...\" class=\"img-circle profile_img\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_info\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Welcome,</span>\r\n");
      out.write("\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /menu profile quick info -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- sidebar menu -->\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar-menu\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_section\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userSession.usercode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav side-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-home\"></i> 商品管理 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/warelist\">商品查看</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /sidebar menu -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- /menu footer buttons -->\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-footer hidden-small\">\r\n");
      out.write("\t\t\t\t\t\t<a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /menu footer buttons -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- top navigation -->\r\n");
      out.write("\t\t\t<div class=\"top_nav\">\r\n");
      out.write("\t\t\t\t<div class=\"nav_menu\">\r\n");
      out.write("\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nav toggle\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-expanded=\"false\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/images/img.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${devUserSession.devCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\" fa fa-angle-down\"></span> </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-usermenu pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-sign-out pull-right\"></i> Log Out</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a> <span class=\"image\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/images/img.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"Profile Image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <span> <span>John Smith</span> <span class=\"time\">3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmins ago</span> </span> <span class=\"message\"> Film festivals used\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tto be do-or-die moments for movie makers. They were where...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a> <span class=\"image\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/images/img.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"Profile Image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <span> <span>John Smith</span> <span class=\"time\">3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmins ago</span> </span> <span class=\"message\"> Film festivals used\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tto be do-or-die moments for movie makers. They were where...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a> <span class=\"image\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/images/img.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"Profile Image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <span> <span>John Smith</span> <span class=\"time\">3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmins ago</span> </span> <span class=\"message\"> Film festivals used\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tto be do-or-die moments for movie makers. They were where...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a> <span class=\"image\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/images/img.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"Profile Image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <span> <span>John Smith</span> <span class=\"time\">3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmins ago</span> </span> <span class=\"message\"> Film festivals used\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tto be do-or-die moments for movie makers. They were where...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a> <strong>See All Alerts</strong> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-angle-right\"></i> </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /top navigation -->\r\n");
      out.write("\t\t\t<div class=\"right_col\" role=\"main\">\r\n");
      out.write("\t\t\t\t<div class=\"\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"page-title\">\r\n");
      out.write("\t<div class=\"title_left\">\r\n");
      out.write("\t\t<h3>\r\n");
      out.write("\t\t\t欢迎你：");
      if (_jspx_meth_shiro_005fprincipal_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_shiro_005fguest_005f0(_jspx_page_context))
        return;
      out.write("<strong></strong>\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<!-- /page content -->\r\n");
      out.write("<!-- footer content -->\r\n");
      out.write("<footer>\r\n");
      out.write("\t<div class=\"pull-right\">©2016 All Rights Reserved.</div>\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- /footer content -->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("   <!-- jQuery -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- FastClick -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/fastclick.js\"></script>\r\n");
      out.write("    <!-- NProgress -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/nprogress.js\"></script>\r\n");
      out.write("    <!-- jQuery custom content scroller -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("    <!-- Custom Theme Scripts -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/custom.min.js\"></script>\r\n");
      out.write("    <!-- validator -->\r\n");
      out.write("\r\n");
      out.write("    <!-- dropzone -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/js/dropzone.js\"></script>  ");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent(null);
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/jsp/common/header.jsp(80,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("ware:create");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/addware\">商品添加</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f1 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f1.setParent(null);
    int _jspx_eval_shiro_005fprincipal_005f1 = _jspx_th_shiro_005fprincipal_005f1.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f1);
    return false;
  }

  private boolean _jspx_meth_shiro_005fguest_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:guest
    org.apache.shiro.web.tags.GuestTag _jspx_th_shiro_005fguest_005f0 = (org.apache.shiro.web.tags.GuestTag) _005fjspx_005ftagPool_005fshiro_005fguest.get(org.apache.shiro.web.tags.GuestTag.class);
    _jspx_th_shiro_005fguest_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fguest_005f0.setParent(null);
    int _jspx_eval_shiro_005fguest_005f0 = _jspx_th_shiro_005fguest_005f0.doStartTag();
    if (_jspx_eval_shiro_005fguest_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("游客，<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/tologin\">去登陆</a>");
        int evalDoAfterBody = _jspx_th_shiro_005fguest_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fguest_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fguest.reuse(_jspx_th_shiro_005fguest_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fguest.reuse(_jspx_th_shiro_005fguest_005f0);
    return false;
  }
}
