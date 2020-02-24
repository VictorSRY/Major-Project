<%-- 
    Document   : TestQuesPage
    Created on : Feb 18, 2020, 11:14:02 PM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=session.getAttribute("topic").toString()%> Test<!--LOL--></title>
        <%@include file="CSS.jsp" %>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <%--<div class="front">--%>
            <%@include file="SideNab.jsp"%>
            <%@include file="topicQue.jsp"%>
        <%--</div>--%>
    </body>
</html>


