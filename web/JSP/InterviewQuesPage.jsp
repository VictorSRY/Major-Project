<%-- 
    Document   : InterviewQuesPage
    Created on : Mar 2, 2020, 2:21:27 AM
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
            <%@include file="InterviewQues.jsp"%>
        </div>
        <%--</div>--%>
    </body>
</html>