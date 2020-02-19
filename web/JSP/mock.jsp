<%-- 
    Document   : mock
    Created on : Feb 19, 2020, 2:00:45 AM
    Author     : Victor
--%>
<%@page import="com.victorObj.Questions"%>
<%@page import="DB.ConnectionDB"%>
<%-- Query SELECT * FROM table_name ORDER BY RAND() LIMIT 1; --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mock Page</title>
    </head>
    <body><div class="QPaper">
        <%
            ConnectionDB db = new ConnectionDB();
            Questions[] quesList = db.getMock();
            /*pass topic*/
            int limit = quesList.length;
            Cookie c[] = new Cookie[limit];
            /*for(Question q:quesList){*/
            for (int i = 0; i < limit; i++) {
                Questions q = quesList[i];
                String qn = Integer.toString(i + 1);
                c[i] = new Cookie("Q" + qn, q.getAns());
        %>
        <div class="Qid">
            Q<%=(i + 1)%>.
            <%-- print value of i+1 --%>
        </div>
        <div class="question" id="Q<%=(i + 1)%>">
            <%=q.getQuestion()%><%-- print Question of current object--%>
            <br>
            <br>
            <div class="choices">
                    <%int temp = 1;%>
                    <div id="QNO<%=temp%>" class="choiceId">A.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>" value="a">
                        <div class="choice">
                            <%=q.getA()%>
                        </div><%-- print first choice of current object--%>
                    </label>
                    <div id="QNO<%=temp%>" class="choiceId">B.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>" value="b">
                        <div class="choice">
                            <%=q.getB()%>
                        </div><%-- print second choice of current object--%>
                    </label>
                    <div id="QNO<%=temp%>" class="choiceId">C.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>"value="c">
                        <div class="choice">
                            <%=q.getC()%>
                        </div><%-- print third choice of current object--%>
                    </label>
                    <div id="QNO<%=temp%>" class="choiceId">D.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp%>"value="d">
                        <div class="choice">
                            <%=q.getD()%>
                        </div><%-- print fourth choice of current object--%>
                    </label>
            </div>
        </div> 
        <%
                response.addCookie(c[i]);
            }
        %>
    </div>
    <button onclick="checkAns(10)">Check</button>
    </body>
</html>
