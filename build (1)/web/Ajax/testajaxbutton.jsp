<%-- 
    Document   : testajaxbutton
    Created on : Feb 25, 2020, 12:38:14 AM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../JavaScript/jquery-3.4.1.js" type="text/javascript"></script>
        <%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> --%>
    </head>
    <body>
        <div class="testclass">
            <button id="button">test</button>
        </div>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#button").click(function () {
                    $.ajax({
                        url: "../testajaxbuttonservlet",
                        type: "POST",
                        datatype:"json",
                        data: {"data": "testlol"},
                        success: function (data) {
                            console.log("hello");
                            console.log(data);
                        }
                    })
                    return false;
                })
            })
        </script>
    </body>
</html>
