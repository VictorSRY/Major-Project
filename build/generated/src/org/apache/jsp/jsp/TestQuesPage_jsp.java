package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.Session;
import DB.ConnectionDB;
import java.util.ArrayList;
import com.victorObj.*;

public final class TestQuesPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/JSP/CSS.jsp");
    _jspx_dependants.add("/JSP/Header.jsp");
    _jspx_dependants.add("/JSP/SideNab.jsp");
    _jspx_dependants.add("/JSP/topicQue.jsp");
  }

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
      out.write("        <title>testLOL</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/Header.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/SideNab.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/topicQue.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"Header-nav\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <img style=\"max-height: 100%;\" src=\"..\\Images\\CA_icon.png\">\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <nav class=\"NabBody\">\n");
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
      out.write("        <script src=\"../JavaScript/SideNab.js\">");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"QPaper\">\r\n");
      out.write("        ");

            String topic =(String)session.getAttribute("topic");
            ConnectionDB cq = new ConnectionDB();
            Questions[] quesList = cq.getQues("average"/* topic */);
            /*pass topic*/
            int limit = quesList.length;
            Cookie c[] = new Cookie[limit];
            /*for(Question q:quesList){*/
            for (int i = 0; i < limit; i++) {
                Questions q = quesList[i];
                String qn = Integer.toString(i + 1);
                c[i] = new Cookie("Q" + qn, q.getAns());
        
      out.write("\r\n");
      out.write("        <div class=\"Qid\">\r\n");
      out.write("            Q");
      out.print((i + 1));
      out.write(".\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"question\" id=\"Q");
      out.print((i + 1));
      out.write("\">\r\n");
      out.write("            ");
      out.print(q.getQuestion());
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"choices\">\r\n");
      out.write("                    ");
int temp = 1;
      out.write("\r\n");
      out.write("                    <div class=\"choiceBlock\">\r\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">A.</div>\r\n");
      out.write("                    <label class=\"choiceLabl\">\r\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp++);
      out.write("\" value=\"a\">\r\n");
      out.write("                        <div class=\"choice\">\r\n");
      out.write("                            ");
      out.print(q.getA());
      out.write("\r\n");
      out.write("                        </div>");
      out.write("\r\n");
      out.write("                    </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"choiceBlock\">\r\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">B.</div>\r\n");
      out.write("                    <label class=\"choiceLabl\">\r\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp++);
      out.write("\" value=\"b\">\r\n");
      out.write("                        <div class=\"choice\">\r\n");
      out.write("                            ");
      out.print(q.getB());
      out.write("\r\n");
      out.write("                        </div>");
      out.write("\r\n");
      out.write("                    </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"choiceBlock\">\r\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">C.</div>\r\n");
      out.write("                    <label class=\"choiceLabl\">\r\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp++);
      out.write("\"value=\"c\">\r\n");
      out.write("                        <div class=\"choice\">\r\n");
      out.write("                            ");
      out.print(q.getC());
      out.write("\r\n");
      out.write("                        </div>");
      out.write("\r\n");
      out.write("                    </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"choiceBlock\">\r\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">D.</div>\r\n");
      out.write("                    <label class=\"choiceLabl\">\r\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp);
      out.write("\"value=\"d\">\r\n");
      out.write("                        <div class=\"choice\">\r\n");
      out.write("                            ");
      out.print(q.getD());
      out.write("\r\n");
      out.write("                        </div>");
      out.write("\r\n");
      out.write("                    </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("        ");

                response.addCookie(c[i]);
            }
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <button onclick=\"checkAns(10)\">Check</button>\r\n");
      out.write("    <script src=\"../JavaScript/topicQue.js\">");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
