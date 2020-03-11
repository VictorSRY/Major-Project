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
        <title><%--=session.getAttribute("topic").toString()--%> Test<!--LOL--></title>
        <%@include file="CSS.jsp" %>
        <style>
            .center-front{
                float: left;
                width: 60%;
                min-width: 565px;
                margin:  10px; 
                padding: 30px;
                background: #dceef7 /*#014980*/;
            }
        </style>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <%--<div class="front">--%>
        <%@include file="SideNab.jsp"%>
        <div class="center-front">
            <%@include file="topicQue.jsp"%>
        </div>
        <%--</div>--%>
    </body>
</html>


