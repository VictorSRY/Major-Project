package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.victor.*;

public final class topicjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp/Header.jsp");
    _jspx_dependants.add("/jsp/SideNab.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .Qid{\n");
      out.write("                all:none;\n");
      out.write("                background: rgba(200,200,200,1);\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            .question{\n");
      out.write("                background-color: rgba(200,200,200,.2);\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .choiceLabl {\n");
      out.write("                display : block;\n");
      out.write("                width: auto;\n");
      out.write("                padding-left: 5px;\n");
      out.write("            }\n");
      out.write("            .choiceLabl > input{ /* HIDE RADIO */\n");
      out.write("                visibility: hidden; /* Makes input not-clickable */\n");
      out.write("                position: absolute; /* Remove input from document flow */\n");
      out.write("            }\n");
      out.write("            .choiceLabl > input + div{ /* DIV STYLES */\n");
      out.write("                cursor:pointer;\n");
      out.write("                border:2px solid transparent;\n");
      out.write("            }\n");
      out.write("            .choiceLabl > input:checked + div{ /* (RADIO CHECKED) DIV STYLES */\n");
      out.write("                background-color: #ffd6bb;\n");
      out.write("                border: 1px solid #ff6600;\n");
      out.write("            }\n");
      out.write("            .choice{\n");
      out.write("                padding: 5px;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("            .choiceId{\n");
      out.write("\n");
      out.write("                display : block;\n");
      out.write("                float: left;\n");
      out.write("                padding: 5px;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("            .choiceBlock{\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style type=\"text/css\">\n");
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
      out.write("        }\n");
      out.write("        .logo{\n");
      out.write("            margin-left: 10px;\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"Header-nav\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <img style=\"max-height: 100%;\" src=\"C:\\Users\\Lenovo\\Google Drive\\NetBeansProjects\\majorPro\\web\\Images\\CA_icon.png\">\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        \t.tabBody{\n");
      out.write("        \t\theight: \t\t100%;\n");
      out.write("        \t\twidth:\t\t\t16.66666667%;\n");
      out.write("        \t\tborder: \t\t2px solid black;\n");
      out.write("\n");
      out.write("        \t}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"tabBody\">\n");
      out.write("        \t\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <div>\n");
      out.write("            ");

                Connectiondb cq = new Connectiondb();
                ArrayList<Questions> qList = cq.getQues("average");
                /*pass topic*/
                int limit = qList.size();
                Cookie c[] = new Cookie[limit];
                /*for(Question q:qList){*/
                for (int i = 0; i < limit; i++) {
                    Questions q = qList.get(i);
                    String qn = Integer.toString(i + 1);
                    c[i] = new Cookie("Q" + qn, q.getAns());
            
      out.write("\n");
      out.write("            <div class=\"Qid\">\n");
      out.write("                Q");
      out.print((i + 1));
      out.write(".\n");
      out.write("                ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"question\" id=\"Q");
      out.print((i + 1));
      out.write("\">\n");
      out.write("                ");
      out.print(q.getQuestion());
      out.write("\n");
      out.write("                <div class=\"choices\">\n");
      out.write("                    <div class=\"choiceBlock\">\n");
      out.write("                    ");
int temp = 1;
      out.write("\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">A.</div>\n");
      out.write("                    <label class=\"choiceLabl\">\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp++);
      out.write("\" value=\"a\">\n");
      out.write("                        <div class=\"choice\">\n");
      out.write("                            ");
      out.print(q.getA());
      out.write("\n");
      out.write("                        </div>");
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">B.</div>\n");
      out.write("                    <label class=\"choiceLabl\">\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp++);
      out.write("\" value=\"b\">\n");
      out.write("                        <div class=\"choice\">\n");
      out.write("                            ");
      out.print(q.getB());
      out.write("\n");
      out.write("                        </div>");
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">C.</div>\n");
      out.write("                    <label class=\"choiceLabl\">\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp++);
      out.write("\"value=\"c\">\n");
      out.write("                        <div class=\"choice\">\n");
      out.write("                            ");
      out.print(q.getC());
      out.write("\n");
      out.write("                        </div>");
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <br>\n");
      out.write("                    <div id=\"QNO");
      out.print(temp);
      out.write("\" class=\"choiceId\">D.</div>\n");
      out.write("                    <label class=\"choiceLabl\">\n");
      out.write("                        <input type=\"radio\" name=\"R");
      out.print((i + 1));
      out.write("\" id=\"QChoice");
      out.print(temp);
      out.write("\"value=\"d\">\n");
      out.write("                        <div class=\"choice\">\n");
      out.write("                            ");
      out.print(q.getD());
      out.write("\n");
      out.write("                        </div>");
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            ");

                    response.addCookie(c[i]);
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <button onclick=\"checkAns(10)\">Check</button>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            x = document.cookie\n");
      out.write("            /*for (var i = x.length - 1; i >= 0; i--) {\n");
      out.write("             console.log(x[i]);\n");
      out.write("             }*/\n");
      out.write("            /*console.log(x.length);*/\n");
      out.write("            var j = 0;\n");
      out.write("            var str = \"\";\n");
      out.write("            var obj = {};\n");
      out.write("            /*console.log(typeof x[0]);*/\n");
      out.write("            for (var i = 0; i <= x.length - 1; i++) {\n");
      out.write("                c = String(x[i]);\n");
      out.write("                /*console.log(c);*/\n");
      out.write("                if (c == ';') {\n");
      out.write("                    /*console.log(c);*/\n");
      out.write("                    var arry = str.split(\"=\");\n");
      out.write("                    var a = arry[0];\n");
      out.write("                    var b = arry[1];\n");
      out.write("                    obj[a] = b;\n");
      out.write("                    str = \"\";\n");
      out.write("                    j++;\n");
      out.write("                } else {\n");
      out.write("                    str = str + c;\n");
      out.write("                    /*console.log(i+\" \"+str);*/\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /*console.log(obj);*/\n");
      out.write("            function checkAns(x) {\n");
      out.write("                for (var i = 0; i < x; i++) {\n");
      out.write("                    var radio = \"R\" + (i + 1);\n");
      out.write("                    console.log(\"checking Q\" + (i + 1));\n");
      out.write("                    var temp = document.getElementsByName(radio);\n");
      out.write("                    /*console.log(temp);*/\n");
      out.write("                    var tempAns;\n");
      out.write("                    var f = false;\n");
      out.write("                    for (var j = 0; j < 4; j++) {\n");
      out.write("                        var tempCheck = temp[j];\n");
      out.write("                        console.log(tempCheck);\n");
      out.write("                        console.log(tempCheck.checked);\n");
      out.write("                        if (tempCheck.checked) {\n");
      out.write("                            tempAns = tempCheck.value;\n");
      out.write("                            console.log(obj[\"Q\" + (i + 1)] + \" \" + (tempAns === obj[\"Q\" + (i + 1)]) + \" \" + tempAns + \" lol\");\n");
      out.write("                            if (tempAns === obj[\"Q\" + (i + 1)]) {\n");
      out.write("                                f = true;\n");
      out.write("                                var tempobj = document.getElementById(\"Q\" + (i + 1));\n");
      out.write("                                tempobj.style.color = \"green\";\n");
      out.write("                                tempobj.style.background = \"red\";\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                        if (f) {\n");
      out.write("                            console.log(\"right\");\n");
      out.write("                            f = false;\n");
      out.write("                        } else {\n");
      out.write("                            console.log(\"wrong\");\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /*console.log(dic);*/\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
