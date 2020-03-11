<%-- 
    Document   : Index
    Created on : Mar 12, 2020, 12:53:15 AM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Campus Acticve</title>
        <style type="text/css">
            .login{/*
                background: rgba(0,0,0,.3); */
                /*padding: 20px;
                padding-top: 10px ;
                border: 2px;
                border-style: solid;
                border-radius: 10px;
                margin-top: 400px;
                margin-left: 50%;
                transform:translateY(-50%) translateX(-50%);
                text-align: center;
                width: auto;
                color: white;
                display: flex;*/
            }
            .login form{
                padding: 20px;
                padding-top: 10px ;
                border: 2px;
                border-style: solid;
                border-radius: 10px;
                margin-top: 400px;
                margin-left: 50%;
                transform:translateY(-50%) translateX(-50%);
                text-align: center;
                width: auto;
                color: white;
                display: flex;
                flex-direction: column;
                border-radius: 2px 2px 5px 5px;
                padding: 10px 20px 20px 20px;
                width: 90%;
                max-width: 320px;
                background: #ffffff;
                position: relative;
                padding-bottom: 80px;
                box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.3);
                overflow: visible;
                box-sizing: border-box;
            }
            .title{
                display: block;
            }
            .login input{
                display: block;
                padding: 15px 10px;
                margin-bottom: 10px;
                border: 1px solid #ddd;
                transition: border-width 0.2s ease;
                border-radius: 2px;
            }
            .login select {
                display: block;
                padding: 15px 10px;
                margin-bottom: 10px;
                width: 100%;
                border: 1px solid #ddd;
                transition: border-width 0.2s ease;
                border-radius: 2px;
                color: #444;
            }
            .login select option{
                padding: 5px;
                margin-left: 5px;
            }
            .login button{
                width: 100%;
                height: 100%;
                padding: 10px 10px;
                background: #2196F3;
                color: #fff;
                display: block;
                border: none;
                margin-top: 20px;
                position: absolute;
                left: 0;
                bottom: 0;
                max-height: 60px;
                border: 0px solid rgba(0, 0, 0, 0.1);
                border-radius: 0 0 2px 2px;
                transform: rotateZ(0deg);
                transition: all 0.1s ease-out;
                border-bottom-width: 7px;
            }
        </style>
    </head>
    <body>
        <div class="login">
            <form method="POST" action="#">
                <p class="title"><img height="80px" src="Images/logo_png1.png"></p>
                <br>

                <input type="text" name="computerCode" placeholder="computerCode"><input type="password" name="password" placeholder="password">
                <select id="uType" name="uType">
                    <option value="Student">Student</option>
                    <option value="faculties">Faculties</option>
                    <option value="admin">Admin</option>
                </select>
                <button type="submit">log in</button>

            </form>
        </div>
    </body>
</html>