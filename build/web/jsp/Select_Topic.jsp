<%-- 
    Document   : Select_Topic
    Created on : Feb 17, 2020, 12:27:10 AM
    Author     : Victor
--%>

<%@page import="DB.ConnectionDB"%>
<%@page import="com.victor.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="SelectTopic">
            <h1>Select Topic</h1>
            <div class="Aptitude">
                <%
                    ConnectionDB db = new ConnectionDB();
                    Topic[] tAT = db.getTopicsAndTypes();
                    int size = tAT.length;
                    for (int i = 0; i < size; i++) {
                        Topic tempTop = tAT[i];
                        String type = tempTop.getType();
                        String[] topics = tempTop.getTopics();
                        int tempSize = topics.length;
                %>
                <div class="<%=type%>"><%=type%></div>
                <ul>
                    <%
                        for (int j = 0; j < tempSize; j++) {
                    %>
                    <li>
                        <%=topics[j]%>
                    </li>
                    <%
                            }
                        }
                    %>
                </ul>
            </div>
    </body>
</html>
