<%-- 
    Document   : MockTestPaper
    Created on : Feb 24, 2020, 2:16:31 AM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mock Test</title>
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
        <%@include file="SideNab.jsp"%>
        <div class="center-front">
            <%@include file="mock.jsp"%>
        </div>
    </body>
</html>
