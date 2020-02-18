/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

