/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-08 08:54:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Work/apache-tomcat-9.0.74/wtpwebapps/MyWeb/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/user/../include/footer.jsp", Long.valueOf(1683082004756L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1682995685892L));
    _jspx_dependants.put("/user/../include/header.jsp", Long.valueOf(1683535970611L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-idth, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>Welcome to MyWorld</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"/MyWeb/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"/MyWeb/css/business-casual.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Fonts -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nanum+Pen+Script&display=swap\" \r\n");
      out.write("      rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"/MyWeb/js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"/MyWeb/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- header -->\r\n");
      out.write("    <div class=\"brand\">\r\n");
      out.write("    	<a href=\"/MyWeb\">My Web</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"address-bar\">Welcome to MyWorld</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"/Test\">My First Web</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/MyWeb\">HOME</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\">Member</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/MyWeb/list.board\">BOARD</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- end header -->\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"virtual-box\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-offset-2 col-md-4\">\r\n");
      out.write("         <div class=\"panel\" style=\"width:200%;\">\r\n");
      out.write("            <div class=\"panel-heading text-white\" align=\"center\" style=\"background: #F8F8FF;\">\r\n");
      out.write("               <h2><span style=\"color: gray;\">MyWeb</span> 회원 정보 수정</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("               <form action=\"/MyWeb/update.user\" method=\"post\" style=\"margin-bottom: 0;\">\r\n");
      out.write("                   \r\n");
      out.write("                  <table\r\n");
      out.write("                     style=\"cellpadding: 0; cellspacing: 0; margin: 0 auto; width: 100%\">\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td style=\"text-align: left\">\r\n");
      out.write("                           <p><strong>아이디</strong>&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("                        </td>                     \r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           class=\"form-control\" maxlength=\"14\"\r\n");
      out.write("                           style=\"margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de\"\r\n");
      out.write("                           readonly>\r\n");
      out.write("                        </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("         \r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td style=\"text-align: left\">\r\n");
      out.write("                           <p><strong>이름을 수정해 주세요.</strong>&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           class=\"form-control\" maxlength=\"6\"\r\n");
      out.write("                           style=\"margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de\"\r\n");
      out.write("                           placeholder=\"이름을 입력하세요.\"></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     \r\n");
      out.write("                      \r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td style=\"text-align: left\">\r\n");
      out.write("                           <p><strong>이메일을 수정해 주세요.</strong>&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td><input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           class=\"form-control\" \r\n");
      out.write("                           style=\"margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de\"\r\n");
      out.write("                           placeholder=\"ex) abc@jsp.com\"></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td style=\"text-align: left\">\r\n");
      out.write("                           <p><strong>주소를 수정해 주세요.</strong>&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td><input type=\"text\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           class=\"form-control\" \r\n");
      out.write("                           style=\"margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de\"\r\n");
      out.write("                           placeholder=\"ex) 서울특별시 종로구\"></td>\r\n");
      out.write("                     </tr> \r\n");
      out.write("                     \r\n");
      out.write("         \r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td style=\"width: 100%; text-align: center; colspan: 2;\">\r\n");
      out.write("							<input type=\"submit\" value=\"정보수정\" class=\"btn btn-primary btn-lg\" onclick=\"return confirm('수정하시겠습니까?')\"> &nbsp;&nbsp;\r\n");
      out.write("							<input type=\"button\" value=\"취소\" class=\"btn btn-danger btn-lg\" onclick=\"location.href='/MyWeb/myPage.user'\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("         \r\n");
      out.write("                  </table>\r\n");
      out.write("               </form>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!--Footer-->\r\n");
      out.write("  <footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-5\">\r\n");
      out.write("          <span class=\"copyright\">\r\n");
      out.write("            Copyright &copy; By Jsp Programming \r\n");
      out.write("          </span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("          <ul class=\"list-inline social\">\r\n");
      out.write("            <li class=\"list-inline-item\">\r\n");
      out.write("              <a class=\"facebook-btn\" href=\"\">\r\n");
      out.write("                <img src=\"/MyWeb/img/facebook.PNG\" alt=\"페이스북 링크\">\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-inline-item\">\r\n");
      out.write("              <a class=\"instagram-btn\" href=\"\">\r\n");
      out.write("                <img src=\"/MyWeb/img/insta.PNG\" alt=\"인스타 링크\">\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-inline-item\">\r\n");
      out.write("              <a class=\"twitter-btn\" href=\"\">\r\n");
      out.write("                <img src=\"/MyWeb/img/twitter.PNG\" alt=\"트위터 링크\">\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <span class=\"contact\">\r\n");
      out.write("            Email: stephen4951@gmail.com\r\n");
      out.write("          </span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </footer>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    	");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                    	");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /user/../include/header.jsp(72,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		                    <li>\r\n");
          out.write("		                        <a href=\"/MyWeb/loginPage.user\">LOGIN</a>\r\n");
          out.write("		                    </li>\r\n");
          out.write("		                    <li>\r\n");
          out.write("		                        <a href=\"/MyWeb/joinPage.user\" style=\"color:red\">JOIN</a>\r\n");
          out.write("		                    </li>\r\n");
          out.write("                    	");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		                    <li>\r\n");
          out.write("		                        <a href=\"/MyWeb/logout.user\">LOGOUT</a>\r\n");
          out.write("		                    </li>\r\n");
          out.write("		                    <li>\r\n");
          out.write("		                        <a href=\"/MyWeb/myPage.user\" style=\"color:red\">MyPage</a>\r\n");
          out.write("		                    </li>\r\n");
          out.write("                    	");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
