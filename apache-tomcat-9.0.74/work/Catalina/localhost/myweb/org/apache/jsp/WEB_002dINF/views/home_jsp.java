/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-16 07:00:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/include/footer.jsp", Long.valueOf(1684219586830L));
    _jspx_dependants.put("/WEB-INF/views/include/header.jsp", Long.valueOf(1684219586831L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>인덱스를 만들어 보자</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("    <!--개인 디자인 추가-->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"navbar\">\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <!--data-toggle 같은 것들은 내부적으로 지원하는 반응형 API기능이므로 지우면 안됩니다-->\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\"><img width=\"30\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/logo.svg\" alt=\"Brand\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">Main</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/freeboard/freeList\">자유게시판</a></li>\r\n");
      out.write("                                <!-- \r\n");
      out.write("				<li><a href=\"#\">강의</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Form</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Board</a></li>\r\n");
      out.write(" 				-->\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li class=\"dropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">로그인\r\n");
      out.write("                                        <span class=\"caret\"></span></a>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>Join</a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>Login</a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>MyPage</a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-out\"></span>Logout</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                            <form class=\"navbar-form navbar-right\" action=\"\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("\r\n");
      out.write("                                        <button class=\"btn btn-primary\" type=\"submit\">\r\n");
      out.write("                                           	 검색\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <section>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-12 slide-list\">\r\n");
      out.write("                    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                        <!-- Indicators -->\r\n");
      out.write("                        <ol class=\"carousel-indicators\">\r\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Wrapper for slides -->\r\n");
      out.write("                        <div class=\"carousel-inner\">\r\n");
      out.write("                            <div class=\"item active\">\r\n");
      out.write("                                <a href=\"###\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/slide1.jpg\" alt=\"슬라이드1\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <a href=\"##\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/slide2.jpg\" alt=\"슬라이드2\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <a href=\"##\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/slide3.jpg\" alt=\"슬라이드3\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Next</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--슬라이드 끝-->\r\n");
      out.write("        \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!--본문 -->\r\n");
      out.write("    <section>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-12\">\r\n");
      out.write("                    <h2>상품 그리드 레이아웃 <small>(쿠팡참조)</small></h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!--xs사이즈에서는 12칸을 다잡는다. (1개씩보임)-->\r\n");
      out.write("                <ul class=\"col-xs-12 prod-list\">\r\n");
      out.write("                    <!--sm사이즈에서는 6칸을 잡는다 (2개씩보임)-->\r\n");
      out.write("                    <li class=\"col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box1.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box2.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box3.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box4.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box5.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box6.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"col-md-6 col-sm-12\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box7.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!--md사이즈에서 (4개씩), sm사이즈에서 (2개씩) -->\r\n");
      out.write("                    <li class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box8.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                        <a href=\"##\" class=\"prod-link\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/box9.jpg\">\r\n");
      out.write("                            <span class=\"arrow\"><i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                            <span class=\"arrow hover\">상세보기<i class=\"glyphicon glyphicon-menu-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-7 col-sm-12\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        <a href=\"\">\r\n");
      out.write("                            <img width=\"20\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/logo.svg\" alt=\"Brand\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        Bootstrap | 대표자 : 홍길동 | E-MAIL : info&#64;info.com<br>\r\n");
      out.write("                        사업자번호 : 123-56-78910 | 개인정보보호책임자 : 홍길동 | 통신판매업 : 2019-서울강남-0001<br>\r\n");
      out.write("                        주소 : 서울시 강남구\r\n");
      out.write("                        <address>&copy;Bootstrap. ALL RIGHTS RESERVED</address>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-5 col-sm-12 text-right\">\r\n");
      out.write("                    <ul class=\"footer-menu\">\r\n");
      out.write("                        <li><a href=\"#\">고객센터</a></li>\r\n");
      out.write("                        <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("                        <li><a href=\"#\">개인정보취급방침</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- //footer -->");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
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
