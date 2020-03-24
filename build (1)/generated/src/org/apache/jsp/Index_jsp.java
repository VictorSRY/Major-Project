package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Campus Acticve</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .login{/*\n");
      out.write("                background: rgba(0,0,0,.3); */\n");
      out.write("                /*padding: 20px;\n");
      out.write("                padding-top: 10px ;\n");
      out.write("                border: 2px;\n");
      out.write("                border-style: solid;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin-top: 400px;\n");
      out.write("                margin-left: 50%;\n");
      out.write("                transform:translateY(-50%) translateX(-50%);\n");
      out.write("                text-align: center;\n");
      out.write("                width: auto;\n");
      out.write("                color: white;\n");
      out.write("                display: flex;*/\n");
      out.write("            }\n");
      out.write("            .login form{\n");
      out.write("                padding: 20px;\n");
      out.write("                padding-top: 10px ;\n");
      out.write("                border: 2px;\n");
      out.write("                border-style: solid;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin-top: 400px;\n");
      out.write("                margin-left: 50%;\n");
      out.write("                transform:translateY(-50%) translateX(-50%);\n");
      out.write("                text-align: center;\n");
      out.write("                width: auto;\n");
      out.write("                color: white;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                border-radius: 2px 2px 5px 5px;\n");
      out.write("                padding: 10px 20px 20px 20px;\n");
      out.write("                width: 90%;\n");
      out.write("                max-width: 320px;\n");
      out.write("                background: #ffffff;\n");
      out.write("                position: relative;\n");
      out.write("                padding-bottom: 80px;\n");
      out.write("                box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.3);\n");
      out.write("                overflow: visible;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            .login input{\n");
      out.write("                display: block;\n");
      out.write("                padding: 15px 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                transition: border-width 0.2s ease;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("            .login select {\n");
      out.write("                display: block;\n");
      out.write("                padding: 15px 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                transition: border-width 0.2s ease;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                color: #444;\n");
      out.write("            }\n");
      out.write("            .login select option{\n");
      out.write("                padding: 5px;\n");
      out.write("                margin-left: 5px;\n");
      out.write("            }\n");
      out.write("            .login button{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                padding: 10px 10px;\n");
      out.write("                background: #2196F3;\n");
      out.write("                color: #fff;\n");
      out.write("                display: block;\n");
      out.write("                border: none;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                max-height: 60px;\n");
      out.write("                border: 0px solid rgba(0, 0, 0, 0.1);\n");
      out.write("                border-radius: 0 0 2px 2px;\n");
      out.write("                transform: rotateZ(0deg);\n");
      out.write("                transition: all 0.1s ease-out;\n");
      out.write("                border-bottom-width: 7px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form method=\"POST\" action=\"login\">\n");
      out.write("                <p class=\"title\"><img height=\"80px\" src=\"Images/logo_png1.png\"></p>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"computerCode\" placeholder=\"computerCode\"><input type=\"password\" name=\"password\" placeholder=\"password\">\n");
      out.write("                <select id=\"uType\" name=\"type\">\n");
      out.write("                    <option value=\"Student\">Student</option>\n");
      out.write("                    <option value=\"Faculties\">Faculties</option>\n");
      out.write("                    <option value=\"Admin\">Admin</option>\n");
      out.write("                </select>\n");
      out.write("                <button type=\"submit\">log in</button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
