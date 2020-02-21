<%-- 
    Document   : topicQue
    Created on : Feb 6, 2020, 12:13:48 PM
    Author     : Victor
--%>

<%@page import="org.apache.catalina.Session"%>
<%@page import="DB.ConnectionDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.victorObj.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="../CSS/topicQue.css">
        <%-- <style type="text/css">
            .front{
                box-sizing: border-box;
                display: inline-block;
            }
            .Qpaper{
                display: inline-block;
                float: left;
                width: auto;
                margin: 10px;
            }
            .Qid{
                all:none;
                background: rgba(200,200,200,1);
                padding: 5px;
            }
            .question{
                background-color: rgba(200,200,200,.2);
                padding: 10px;
            }
            .choiceLabl {
                display : block;
                width: auto;
                padding-left: 5px;
            }
            .choiceLabl > input{ /* HIDE RADIO */
                visibility: hidden; /* Makes input not-clickable */
                position: absolute; /* Remove input from document flow */
            }
            .choiceLabl > input + div{ /* DIV STYLES */
                cursor:pointer;
                border:2px solid transparent;
            }
            .choiceLabl > input:checked + div{ /* (RADIO CHECKED) DIV STYLES */
                background-color: #ffd6bb;
                border: 1px solid #ff6600;
            }
            .choice{
                padding: 5px;
                margin: 10px;
            }
            .choiceId{

                display : block;
                float: left;
                padding: 5px;
                margin: 10px;
            }
            .choiceBlock{
                padding: 10px;
                width: 100%;
                position: relative;
            } --%>
    </style>
</head>
<body>
    <div class="QPaper">
        <%
            /*String topic =session.getAttribute("topic").toString();*/
            ConnectionDB cq = new ConnectionDB();
            Questions[] quesList = cq.getQues("average"/* topic */);
            /*pass topic*/
            int limit = quesList.length;
            Cookie c[] = new Cookie[limit];
            /*for(Question q:quesList){*/
            for (int i = 0; i < limit; i++) {
                Questions q = quesList[i];
                String qn = Integer.toString(i + 1);
                c[i] = new Cookie("Q" + qn, q.getAns());
        %>
        <div class="Qid">
            Q<%=(i + 1)%>.
            <%-- print value of i+1 --%>
        </div>
        <div class="question" id="Q<%=(i + 1)%>">
            <%=q.getQuestion()%><%-- print Question of current object--%>
            <br>
            <br>
            <div class="choices">
                    <%int temp = 1;%>
                    <div class="choiceBlock">
                    <div id="Q<%=temp%>Ans" class="choiceId">A.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>" value="a">
                        <div class="choice">
                            <%=q.getA()%>
                        </div><%-- print first choice of current object--%>
                    </label>
                    </div>
                    <div class="choiceBlock">
                    <div id="Q<%=temp%>Ans" class="choiceId">B.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>" value="b">
                        <div class="choice">
                            <%=q.getB()%>
                        </div><%-- print second choice of current object--%>
                    </label>
                    </div>
                    <div class="choiceBlock">
                    <div id="Q<%=temp%>Ans" class="choiceId">C.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp++%>"value="c">
                        <div class="choice">
                            <%=q.getC()%>
                        </div><%-- print third choice of current object--%>
                    </label>
                    </div>
                    <div class="choiceBlock">
                    <div id="Q<%=temp%>Ans" class="choiceId">D.</div>
                    <label class="choiceLabl">
                        <input type="radio" name="R<%=(i + 1)%>" id="QChoice<%=temp%>"value="d">
                        <div class="choice">
                            <%=q.getD()%>
                        </div><%-- print fourth choice of current object--%>
                    </label>
                    </div>
            </div>
        </div> 
        <%
                response.addCookie(c[i]);
            }
        %>
    </div>
    <button class="checkbutton" onclick="checkAns(10)">Check</button>
    <script src="../JavaScript/topicQue.js"><%--
        x = document.cookie;
        /*for (var i = x.length - 1; i >= 0; i--) {
         console.log(x[i]);
         }*/
        /*console.log(x.length);*/
        var j = 0;
        var str = "";
        var obj = {};
        /*console.log(typeof x[0]);*/
        for (var i = 0; i <= x.length - 1; i++) {
            c = String(x[i]);
            /*console.log(c);*/
            if (c === ';') {
                /*console.log(c);*/
                var arry = str.split("=");
                var a = arry[0];
                var b = arry[1];
                obj[a] = b;
                str = "";
                j++;
            } else {
                str = str + c;
                /*console.log(i+" "+str);*/
            }
        }
        /*console.log(obj);*/
        function checkAns(x) {
            for (var i = 0; i < x; i++) {
                var radio = "R" + (i + 1);
                console.log("checking Q" + (i + 1));
                var temp = document.getElementsByName(radio);
                /*console.log(temp);*/
                var tempAns;
                var f = false;
                for (var j = 0; j < 4; j++) {
                    var tempCheck = temp[j];
                    console.log(tempCheck);
                    console.log(tempCheck.checked);
                    if (tempCheck.checked) {
                        tempAns = tempCheck.value;
                        console.log(obj["Q" + (i + 1)] + " " + (tempAns === obj["Q" + (i + 1)]) + " " + tempAns + " lol");
                        if (tempAns === obj["Q" + (i + 1)]) {
                            f = true;
                            var tempobj = document.getElementById("Q" + (i + 1));
                            tempobj.style.color = "green";
                            tempobj.style.background = "red";
                        }
                    }
                    if (f) {
                        console.log("right");
                        f = false;
                    } else {
                        console.log("wrong");
                    }
                }
            }
        }
        /*console.log(dic);*/
        --%></script>
</body>
</html>
