package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SideNab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/SideNave.CSS\">\n");
      out.write("        <!-- <style type=\"text/css\">\n");
      out.write("            *{\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: inherit;\n");
      out.write("            }\n");
      out.write("            .tabBody{\n");
      out.write("                display: block;\n");
      out.write("                height:         auto;\n");
      out.write("                padding: auto;\n");
      out.write("                width:          16.66666667%;\n");
      out.write("                border-radius:  5px;\n");
      out.write("                box-shadow: 0px 0px 5px black;\n");
      out.write("                color:  #2FA4E7;\n");
      out.write("            }\n");
      out.write("            .tabOptions{\n");
      out.write("                display: block;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                border-radius:  5px;\n");
      out.write("                border:         1px solid #0000001a;\n");
      out.write("            }\n");
      out.write("            .tabOptions:hover {\n");
      out.write("                background-color: #2FA4E7;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .tabOptionsSelect{\n");
      out.write("                border:         1px solid #ffffff45;\n");
      out.write("            }\n");
      out.write("            .tabOptionsSelect:hover{\n");
      out.write("                background-color: white;\n");
      out.write("                color: #2FA4E7;\n");
      out.write("            }\n");
      out.write("            .tabOptionsSelect{\n");
      out.write("                margin: 0px 4px 4px 4px;\n");
      out.write("            }\n");
      out.write("            .PT{\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                background: inherit;\n");
      out.write("                padding: 0px;\n");
      out.write("                color: inherit;\n");
      out.write("                display: block;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                font: inherit;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            #PTbutton{\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <nav class=\"tabBody\">\n");
      out.write("            <ul>\n");
      out.write("                <li style=\"font-size: 15px; color: rgba(0,0,0,.6); padding: 5px;\">STUDENT</li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">Dashboard</a>                    \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">Attendance</a>                    \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">MST</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">Assignments</a>    \n");
      out.write("                </li>\n");
      out.write("                <li class=\"tabOptions\" id=\"PTbutton\">\n");
      out.write("                    <button class=\"tabOptions PT\"  onclick=\"PTButtonDrop()\">Placement Talks</a>    \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">Feedback</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">NBA Survey</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"tabOptions\" href=\".jsp\">ONline Exam</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <link rel=\"script\" type=\"text/javascript\" href=\"../JavaScript/SideNave.js\">\n");
      out.write("        <!-- <script type=\"text/javascript\">\n");
      out.write("            var f=true;\n");
      out.write("            function PTButtonDrop(){\n");
      out.write("                var obj=document.getElementById(\"PTbutton\");\n");
      out.write("                var temp=obj.innerHTML;\n");
      out.write("                if(f){\n");
      out.write("                    f=false;\n");
      out.write("                    obj.style.background=\"#2fa4e7\";\n");
      out.write("                    obj.style.color=\"white\";\n");
      out.write("                    obj.innerHTML+='<ul id=\"PTlist\"><li style=\"margin:0px;\"><a class=\"tabOptions tabOptionsSelect\" href=\".jsp\">Topics</li></a><li><a class=\"tabOptions tabOptionsSelect\" href=\".jsp\">Mock Test</a></li></ul>';\n");
      out.write("                    /*obj.innerAdjacenthtml(\"PT\",\"<ul><li>Topics</li><li>Prectic Paper</li></ul>\");*/\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    f=true;\n");
      out.write("                    obj.style.background=\"white\";\n");
      out.write("                    obj.style.color=\"#2fa4e7\";\n");
      out.write("                    obj.removeChild(document.getElementById(\"PTlist\"));\n");
      out.write("                    /*obj.innerAdjacenthtml(\"PT\",\"<ul><li>Topics</li><li>Prectic Paper</li></ul>\");*/\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script> -->\n");
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
