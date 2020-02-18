package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/Header.css\">\n");
      out.write("    <!-- <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("        }\n");
      out.write("        .Header-nav{\n");
      out.write("            padding-top: 5px;\n");
      out.write("            line-height: 30px;\n");
      out.write("            height: 60px;\n");
      out.write("            background-color: #178acc;\n");
      out.write("            color: white;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-shadow: 0px 2px 5px black;\n");
      out.write("            margin-bottom: 10pX;\n");
      out.write("        }\n");
      out.write("        .logo{\n");
      out.write("            margin-left: 10px;\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("    </style> -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"Header-nav\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <img style=\"max-height: 100%;\" src=\"C:\\Users\\Lenovo\\Google Drive\\NetBeansProjects\\majorPro\\web\\Images\\CA_icon.png\">\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
