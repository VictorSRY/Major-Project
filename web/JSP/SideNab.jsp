<%-- 
    Document   : SideNab
    Created on : Feb 14, 2020, 7:18:51 PM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%-- <style type="text/css">
            *{
                margin: 0px;
                padding: 0px;
            }
            body{
                padding: 5px;
            }
            a{
                text-decoration: none;
                color: inherit;
            }
            .tabBody{
                display: block;
                height:         auto;
                padding: auto;
                width:          16.66666667%;
                border-radius:  5px;
                box-shadow: 0px 0px 5px black;
                color:  #2FA4E7;
            }
            .tabOptions{
                display: block;
                padding: 10px 15px;
                border-radius:  5px;
                border:         1px solid #0000001a;
            }
            .tabOptions:hover {
                background-color: #2FA4E7;
                color: white;
            }
            .tabOptionsSelect{
                border:         1px solid #ffffff45;
            }
            .tabOptionsSelect:hover{
                background-color: white;
                color: #2FA4E7;
            }
            .tabOptionsSelect{
                margin: 0px 4px 4px 4px;
            }
            .PT{
                outline: none;
                border: none;
                background: inherit;
                padding: 0px;
                color: inherit;
                display: block;
                cursor: pointer;
                padding: 10px 15px;
                font: inherit;
                width: 100%;
                text-align: left;
            }
            #PTbutton{
                padding: 0px;
            }
        </style>--%>
    </head>
    <body >
        <nav class="NabBody">
            <ul>
                <li style="font-size: 15px; color: rgba(0,0,0,.6); padding: 5px;">STUDENT</li>
                <li>
                    <a class="tabOptions" href=".jsp">Dashboard</a>                    
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">Attendance</a>                    
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">MST</a>
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">Assignments</a>    
                </li>
                <li class="tabOptions" id="PTbutton">
                    <button class="tabOptions PT"  onclick="PTButtonDrop()">Placement Talks</a>    
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">Feedback</a>
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">NBA Survey</a>
                </li>
                <li>
                    <a class="tabOptions" href=".jsp">ONline Exam</a>
                </li>
            </ul>
        </nav>
        <script src="../JavaScript/SideNab.js"><%--
            var f=true;
            function PTButtonDrop(){
                var obj=document.getElementById("PTbutton");
                var temp=obj.innerHTML;
                if(f){
                    f=false;
                    obj.style.background="#2fa4e7";
                    obj.style.color="white";
                    obj.innerHTML+='<ul id="PTlist"><li style="margin:0px;"><a class="tabOptions tabOptionsSelect" href=".jsp">Topics</li></a><li><a class="tabOptions tabOptionsSelect" href=".jsp">Mock Test</a></li></ul>';
                    /*obj.innerAdjacenthtml("PT","<ul><li>Topics</li><li>Prectic Paper</li></ul>");*/
                }
                else{
                    f=true;
                    obj.style.background="white";
                    obj.style.color="#2fa4e7";
                    obj.removeChild(document.getElementById("PTlist"));
                    /*obj.innerAdjacenthtml("PT","<ul><li>Topics</li><li>Prectic Paper</li></ul>");*/
                }
            } 
            --%></script>
    </body>
</html>