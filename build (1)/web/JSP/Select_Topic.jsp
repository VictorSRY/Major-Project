<%-- 
    Document   : Select_Topic
    Created on : Feb 28, 2020, 8:21:53 PM
    Author     : Lenovo
--%>

<%-- 
    Document   : Select_Topic
    Created on : Feb 17, 2020, 12:27:10 AM
    Author     : SRY
--%>

<%@page import="DB.ConnectionDB"%>
<%@page import="com.victor.Obj.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--<style type="text/css">
            .topic-types-page{
                display: flex;
                flex-direction: column;
            }
            .topic-types{
                display: flex;
                flex-direction: column;
            }
            .type{
                display: flex;
                flex-direction: column;
                border-radius: 7px;
                background-color: white;
                background-color: #ddf0fb;
                border: inherit;
                padding: 10px;
            }
            .type h2{
                padding: 0px 5px;
            }
            .type-name{
                text-align: center;
                border-radius: inherit;
                background-color: #ddf0fb;
                color: #00a2ff;
                /*border: inherit;
                padding: inherit;*/
            }
            .topics{
                display: flex;
                flex-wrap: wrap;
                background-color: white/*#f3fafe*/;
                border-radius: inherit;
                /*border: inherit;
                padding: inherit;*/
            }
            .topic{
                display: flex;
                justify-content: center;
                background-color: #54b4eb; 
                margin: 10px;
                min-width: 150px;
                text-align: center;
                line-height: 20px;
                border-radius: inherit;
                color: white;
                /*border: inherit;
                padding: 5px;*/
            }
            a{
                display: inline-block;
                text-decoration: none;
                color: inherit;
                width: 100%;
                padding: 5px;
                border-radius: inherit;
            }
        </style>--%>
    </head>
    <body>
        <div class="Paper topic-types-page">
            <div class="topic-types">
                <%
                    ConnectionDB db = new ConnectionDB();
                    TopicTypes[] tAT = db.getTopicsAndTypes();
                    int size = tAT.length;
                    for (int i = 0; i < size; i++) {
                        TopicTypes tempTop = tAT[i];
                        String type = tempTop.getType();
                        Topic[] topics = tempTop.getTopics();
                        int tempSize = topics.length;
                %>
                <div class="type">
                    <div class="type-name"><h2><%=type%></h2></div>
                    <div class="topics">
                        <%
                            for (Topic t : topics) {
                                String temp = t.getName();
                        %>
                        <div class="topic"><a href='../Select_Topic?topic=<%=temp%>'><%=temp%></a></div>
                            <%
                                }
                            %>
                    </div>
                </div>
            </div>
            <%
                }
            %>


        </div>
    </body>
</html>
