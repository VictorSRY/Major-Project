<%-- 
    Document   : InterviewQues
    Created on : Feb 20, 2020, 12:17:17 AM
    Author     : SRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interview Ques</title>
        <style type="text/css">
            body{
                margin: 0px;
                padding: 0px;
            }
            .InterviewQues{
                display: flex;
                flex-direction: column;
                min-width: 565px;
            }
            .questionAndAns{
                display: flex;
                flex-direction: column;
                border:1px solid black;
                padding: 5px;
            }
            .question{
                display: flex;
                flex-direction: column;
                border:inherit;
                padding: inherit;
            }
            .QuestionText p{
                padding:10px;
                margin: 0px;
                font-size: large;

            }
            .qAttribute{
                border:inherit;
                /*padding: inherit;*/
                display: flex;
                justify-content: space-between;
                align-items: center;
                /*height: 25px;*/
            }
            .qInfo{
                padding: 0px 5px;
                display: inline-block;
                top: 50%;
                font-size: 13px;
            }
            .QvoteSys{
                border:inherit;
                display: flex;
                justify-content: space-between;
                align-items: stretch;
                width: 82px;
            }
            .up{
            }
            .notSoUp{
            }
            .Answers{
                display: flex;
                flex-direction: column;
                border:inherit;
                padding: 10px;
            }
            .Ans{
                border:     inherit;
                display: flex;
                flex-direction: column;
            }
            .ansHead{
                border: inherit;
            }
            h2{
                margin: 5px auto;
            }
            h3{
                margin: 5px auto;
            }
            .ansText{
                border:inherit;
            }
            .ansText p{
                padding:10px;
                margin: 0px;
            }
            .aAttribute{
                border:inherit;
                padding: inherit;
                display: flex;
                justify-content: space-between;
                align-items: center;
            }
            .AvoteSys{
                border:inherit;
                display: flex;
                justify-content: space-between;
                align-items: stretch;
                width: 82px;
            }
            .aInfo{
                display: inline-block;
                top: 50%;
                font-size: 13px;
                padding: 0px 5px;
            }
            #qS{
                border: inherit;
                display: inline-block;
                margin:auto;
                width:30px;
                text-align: center;
                transform: translateY(1px);
            }
            .Add-Ans{
                display: flex;
                flex-direction: column;
                align-items: stretch;
                padding: 5px;
                border: inherit;
            }
            #Input-Ans{
                display: flex;
                flex-direction: column;
                resize: none;
                cursor: text;
                padding: 5px;
                /*width: 100%;*/
                height: auto;
                overflow-y: scroll;
                line-height: 1.4;
                transition: all .15s ease-in-out;
                text-size-adjust: 100%;
                overflow: auto; 
                overflow-wrap: break-word; 
                max-height: 350px;
                border: 1px solid black;


            }
            #Input-Ans p{
                display: block;
                margin-block-start: 1em;
                margin-block-end: 1em;
                margin-inline-start: 0px;
                margin-inline-end: 0px;
                margin: 0px;

                line-height: 1.4;
            }
            .post-actions{
                cursor: auto;
                display: flex;
                flex-direction: row;
                justify-content: space-between;
                margin-top: 5px; 
            }
        </style>
    </head>
   <body>
        <div class="Paper">
            <div class="InterviewQues">
                <div class="questionAndAns">
                    <div class="question">
                        <div class="qAttribute">
                            <div class="qInfo"><b>Topic Q</b><span class="test" style=" vertical-align: middle;   color: black;  font-size: 10px;  line-height: 20px;margin: 0 4px; " role="presentation">•</span>Posted by : lol <l style="">time ago</l></div>
                            <div class="QvoteSys">
                                <button class="Up">\</button>
                                <div id="qS" style="align-self: center;">123</div>
                                <button class="notSoUp">/</button>
                            </div>
                        </div>
                        <div class="QuestionText">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                                quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                                consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                                cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                                proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                            </p>
                        </div>
                    </div>
                    <div class="Answers">
                        <div class="ansHead">
                            <h3>Answer:</h3>
                        </div>
                        <div class="Ans" id="top-ans">
                            <div class="ansText">
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                                    quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                                    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                                </p>
                            </div>
                            <div class="aAttribute">
                                <div class="AvoteSys">
                                    <button class="Up">\</button>
                                    <p id="qS">123</p>
                                    <button class="notSoUp">/</button>
                                </div>
                                <div class="aInfo">
                                    <span class="test" style=" vertical-align: middle;   color: black;  font-size: 10px;  line-height: 20px;margin: 0 4px; " role="presentation">•</span>Posted by : lol <l style="">time ago</l>
                                </div>
                            </div>
                        </div>
                        <div class="Add-Ans">
                            <div class="textarea" id="Input-Ans" rows="1" placeholder="Add Your Ans" area-multiline="true" tabindex="0" role="textbox" aria-multiline="true" contenteditable="PLAINTEXT-ONLY" data-role="editable" aria-label="Join the discussion…" style="overflow: auto; overflow-wrap: break-word; max-height: 350px;"></div>
                            <div class="post-actions">
                                <!--<a href="#" data-action="attach" tabindex="-1">1</a>
                                <input type="file" name="" data-role="media-upload" tabindex="-1" accept="image/*">-->
                                <div>lol</div>
                                <div class="text-summit">
                                    <button id="Submmit-Ans">Submit</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="../JavaScript/jquery-3.4.1.js" type="text/javascript"></script>
        <script type="text/javascript">
            function getDate(){
                Fdate = new Date();
                temp=String(Fdate.getDate());
                dday=(temp.length==1)? "0"+temp : temp;
                temp=String(Fdate.getMonth());
                dmonth=(temp.length==1)? "0"+temp : temp;
                dyear = String(Fdate.getFullYear());
                date = dday + "/" + dmonth + "/" + dyear + " " + String(Fdate.getHours()) + ":" + String(Fdate.getMinutes());
                dbDate=dyear+"-"+dmonth+"-"+dday;
                return date;
            }
            console.log(getDate()+" "+dbDate);
            /*function getCurDate(){
                var Fdate = new Date();
            var date = String(Fdate.getDate()) + "/" + String(Fdate.getMonth()) + "/" + String(Fdate.getFullYear()) + " " + String(Fdate.getHours()) + ":" + String(Fdate.getMinutes()); 
            var dbDate =String(Fdate.getFullYear()+"-"+String(Fdate.getMonth())
            console.log(date);
            }
            getCurDate();*/
            var uname = "Victor";
            var qid=1;
            var uid=38707;
            $(document).ready(function () {
                /*console.log($(".Add-Ans").html())*/
                $("#Submmit-Ans").click(function () {
                    var newAns = $("#Input-Ans").text()
                    console.log(newAns)
                    if (newAns.trim() == "") {
                        alert("lol")
                    }
                    /*$(".Ans").find(".ansText p").text(newAns)
                     $(tempHtml).html($(tempHtml).find(".ansText p").text(newAns))
                     console.log($(tempHtml))
                     $(".Answers").append(tempHtml);*/
                    else {
                        $.ajax({
                            url: "../QAndA",
                            type: "POST",
                            dataType: "json",
                            data: {"type":"ans","qid":qid,"uid":uid,"uName":"Victor","ans": newAns,"date":dbDate},
                            success: function (data) {
                                console.log("success")
                                var tempHtml = $(".Ans").html()
                                $("#top-ans").after("<div class=\"Ans\" id = \"your-Ans\"><div class=\"ansText\"><p>" + newAns + "</p></div><div class=\"aAttribute\"><div class=\"AvoteSys\"><button class=\"Up\">\\</button><p id=\"qS\">123</p><button class=\"notSoUp\">/</button></div><div class=\"aInfo\"><span class=\"test\" style=\" vertical-align: middle;   color: black;  font-size: 10px;  line-height: 20px;margin: 0 4px; \" role=\"presentation\">•</span>Posted by : " + uname + "  <l style=\"\">" +getDate()+ "</l></div></div></div>"/*tempHtml*/)
                                $(".Add-Ans").remove()
                            }
                        })
                    }
                })
            })
        </script>
    </body>
</html>