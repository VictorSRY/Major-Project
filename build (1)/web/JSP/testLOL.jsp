<%-- 
    Document   : testLOL
    Created on : Feb 18, 2020, 11:41:28 PM
    Author     : Victor
--%>

<%@page import="DB.ConnectionDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.victorObj.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <%@include file="CSS.jsp" %>

    </head>
    <body>
        <div class="front">
        <div class="NabBody">
            <ul>
                <li style="font-size: 15px; color: rgba(0,0,0,.6); padding: 5px;">STUDENT</li>
                <li>
                    <a class="tabOptions" href=".jsp">Dashboard</a>                    
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">Attendance</a>                    
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">MST</a>
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">Assignments</a>    
                </li>
                <li class="tabOptions" id="PTbutton">
                    <button class="tabOptions PT"  onclick="PTButtonDrop()">Placement Talks</a>    
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">Feedback</a>
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">NBA Survey</a>
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">ONline Exam</a>
                </li>
            </ul>
        </div>
        <div class="QPaper">
        <%
            ConnectionDB cq = new ConnectionDB();
            ArrayList<Questions> qList = cq.getQues("average"/*(String)request.getAttribute("topic")*/);
            /*pass topic*/
            int limit = qList.size();
            Cookie c[] = new Cookie[limit];
            /*for(Question q:qList){*/
            for (int i = 0; i < limit; i++) {
                Questions q = qList.get(i);
                String qn = Integer.toString(i + 1);
                c[i] = new Cookie("Q" + qn, q.getAns());
        %>
        <div class="Qid">
            Q<%=(i + 1)%>.
            <%-- print value of i+1 --%>
        </div>
        <div class="question" id="Q<%=(i + 1)%>">
            <%=q.getQuestion()%><%-- print Question of current object--%>
            <div class="choices">
                <div class="choiceBlock">
                    <%int temp = 1;%>
                    <div id="QNO<%=temp%>" class="choiceId">A.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>" value="a">
                        <div class="choice">
                            <%=q.getA()%>
                        </div><%-- print first choice of current object--%>
                    </label>
                </div>
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
                <br>
                <div id="QNO<%=temp%>" class="choiceId">D.</div>
                <label class="choiceLabl">
                    <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp%>"value="d">
                    <div class="choice">
                        <%=q.getD()%>
                    </div><%-- print fourth choice of current object--%>
                </label>
                <br>
            </div>
        </div> 
        <%
                response.addCookie(c[i]);
            }
        %>
    </div>
    </div>
    </body>
</html>
