<%-- 
    Document   : mock
    Created on : Feb 19, 2020, 2:00:45 AM
    Author     : SRY
--%>
<%@page import="com.victor.Obj.Questions"%>
<%@page import="DB.ConnectionDB"%>
<%-- Query SELECT * FROM table_name ORDER BY RAND() LIMIT 1; --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mock Page</title>
    </head>
    <body><div class="Paper">
        <%
            ConnectionDB db = new ConnectionDB();
            Questions[] quesList = db.getMock();
            /*pass topic*/
            System.out.println("lol mock test");
            int limit = quesList.length;
            Cookie c[] = new Cookie[limit];
            System.out.println("limit");
            /*for(Question q:quesList){*/
            for (int i = 0; i < limit; i++) {
                Questions q = quesList[i];
                String qn = Integer.toString(i + 1);
                c[i] = new Cookie("Q" + qn, q.getAns());
        %>
        <div class="Question">
        <div class="Qid border-top <%--<% if(i==0){%>Paper-top<%}%>--%>">
            Q<%=(i + 1)%>.
            <%-- print value of i+1 --%>
        </div>
            <div class="question-text-and-choice border-bottom <%--<% if(i==(limit-1)){%>Paper-bottom<%}%>--%>" id="Q<%=(i + 1)%>">
            <%=q.getQuestion()%><%-- print Question of current object--%>
            <br>
            <br>
            <div class="choices">
                    <div class="choiceBlock">
                    <div class="choiceId Q<%=(i+1)%>Ans">A.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" class="choice_input" value="a">
                        <div class="choice">
                            <%=q.getA()%>
                        </div><%-- print first choice of current object--%>
                    </label>
                    </div>
                    <div class="choiceBlock">
                    <div class="choiceId Q<%=(i+1)%>Ans">B.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" class="choice_input" value="b">
                        <div class="choice">
                            <%=q.getB()%>
                        </div><%-- print second choice of current object--%>
                    </label>
                    </div>
                    <div class="choiceBlock">
                    <div class="choiceId Q<%=(i+1)%>Ans">C.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" class="choice_input" value="c">
                        <div class="choice">
                            <%=q.getC()%>
                        </div><%-- print third choice of current object--%>
                    </label>
                    </div>
                    <div class="choiceBlock">
                    <div class="choiceId Q<%=(i+1)%>Ans">D.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" class="choice_input" value="d">
                        <div class="choice">
                            <%=q.getD()%>
                        </div><%-- print fourth choice of current object--%>
                    </label>
                    </div>
            </div>
        </div> 
    </div>
        <%
                response.addCookie(c[i]);
            }
        %>
    </div>
        <button id="checkbutton" value="<%=limit%>">Check</button>
    <script src="../JavaScript/loltopicQue.js"></script>
    </body>
</html>
