/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-04-27 05:29:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JspTag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public final class jsp_005ftag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


	    /*
	    Declaration(선언자)
	    jsp 파일 내부에서 사용할 멤버변수나 메서드 등을
	    선언할 때 사용하는 태그입니다.
	    선언자에 작성한 코드는 jsp파일이 클래스로 변환될 때
	    클래스 블록에 선언됩니다.
	    */
	    public int i;
	    int add(int n1, int n2) {
	    	return n1 + n2;
	    }
    
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.time.format.DateTimeFormatter");
    _jspx_imports_classes.add("java.time.LocalDateTime");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    	/*
    	Scriptlet(스크립틀릿)
    	지역변수 및 메서드 내부의 코드들 작성하는 태그입니다.
    	스크립틀릿에 작성한 내용은 jsp파일이 클래스로 변환될 때
    	jsp_service()라는 메서드 내부에 작성됩니다.
    	페이지 요청이 발생할 때마다 실행할 로직을 작성할 수 있습니다.
    	*/
    	
    	int j = 0;
    	
    	/* public void hello() {
    		System.out.println("안녕~");
    	} */
    	
    	i++;
    	j++;
    	
    	LocalDateTime now = LocalDateTime.now();
    	
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<!-- \r\n");
      out.write("		expression(표현자)\r\n");
      out.write("		jsp 페이지 내에서 사용되는 변수의 값 또는 메서드의 리턴값을\r\n");
      out.write("		브라우저에 바로 출력할 때 사용하는 태그.\r\n");
      out.write("		결과값 타입 -> String\r\n");
      out.write("		jsp 파일이 클래스로 변환될 때 out.print()로 변환됨.\r\n");
      out.write("	 -->\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	i의 값: ");
 out.print(i);  
      out.write(" <br>\r\n");
      out.write("	j의 값: ");
      out.print( j );
      out.write(" <br> <!-- expression 표현자 의 예 -->\r\n");
      out.write("	난수값: ");
      out.print( Math.random() );
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<h2>구구단 7단</h2>\r\n");
      out.write("	\r\n");
      out.write("	");
  
	for(int k=1; k<=9; k++) {
		out.print(7 + " X " + k + " = " + 7*k + "<br>");
	}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");
 for(int k=1; k<=9; k++ ) { 
      out.write("\r\n");
      out.write("	7 x ");
      out.print( k );
      out.write(' ');
      out.write('=');
      out.write(' ');
      out.print( 7*k );
      out.write(" <br>\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	오늘 날짜 정보: ");
      out.print( now.format(dtf) );
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
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
}