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
    </head>
    <body>
        <div class="testclass">
            <button id="button">test</button>
        </div>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#button").click(function(){
                            $ajax(){
                                url:"testajaxbuttonservlet",
                                type:"POST",
                                dataType:"jason",
                                data:{"data":"testlol"},
                                success:function(data){
                                    console.log(data.id);
                                }
                            }
                })
            })
        </script>
    </body>
</html>
