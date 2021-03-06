<%-- 
    Document   : topicjsp
    Created on : Feb 6, 2020, 12:13:48 PM
    Author     : Victor
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.victor.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
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
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <%
                Connectiondb cq = new Connectiondb();
                ArrayList<Questions> qList = cq.getQues("average");
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
        <button onclick="checkAns(10)">Check</button>
        <script type="text/javascript">
            x = document.cookie
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
                if (c == ';') {
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
        </script>
    </body>
</html>
