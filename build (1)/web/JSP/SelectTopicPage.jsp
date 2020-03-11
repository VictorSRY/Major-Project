<%-- 
    Document   : SelectTopicPage
    Created on : Feb 28, 2020, 10:42:47 PM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>topic select</title>
        <%@include file="CSS.jsp" %>
        <style>
            .center-front{
                float: left;
                width: 60%;
                min-width: 565px;
                margin:  10px; 
                padding: 30px;
                background: #f3fcf4 /*#014980*/;
            }
        </style>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <%--<div class="front">--%>
        <%@include file="SideNab.jsp"%>
        <div class="center-front">
            <%@include file="Select_Topic.jsp"%>
        </div>
        <%--</div>--%>
    </body>
</html>



