<%-- 
    Document   : Header
    Created on : Feb 16, 2020, 2:37:04 AM
    Author     : SRY
--%>

<%@page import="com.victor.Obj.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%-- User user = (User)session.getAttribute("user"); --%>
        <%--
           /* HttpSession testSession=request.getSession(false);*/
            System.out.println("\n \n \n"+(Boolean)session.getAttribute("logIn"));
            if((Boolean)session.getAttribute("logIn")){
                System.out.println("not login");
                request.getRequestDispatcher("../index.jsp");
            }
        --%>
<!DOCTYPE html>
<html>
<head>
    
    <%-- <style type="text/css">
        body{
            margin: 0px;
            padding: 0px;
        }
        .Header-nav{
            padding-top: 5px;
            line-height: 30px;
            height: 60px;
            background-color: #178acc;
            color: white;
            box-sizing: border-box;
            border-radius: 4px;
            box-shadow: 0px 2px 5px black;
            margin-bottom: 10pX;
        }
        .logo{
            margin-left: 10px;
            height: 50px;
        }
    </style> --%>
</head>
<body>
<header class="Header-nav">
    <div class="logo">
        <img style="max-height: 100%;" src="..\Images\CA_icon.png">
    </div>
    <div class="header-user-opt">
        <%--=user.getUname()--%>
        <p><input type="hidden" id="uid" value="<%= session.getAttribute("uid") %>"><%=session.getAttribute("uName")%></p>
        <form method="link" action="../logOut"><button type="submit">logOut</button></form>
    </div>
</header>
</body>
</html>
