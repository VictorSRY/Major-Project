/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var f = true;
function PTButtonDrop() {
    var obj = document.getElementById("PTbutton");
    var temp = obj.innerHTML;
    if (f) {
        f = false;
        obj.style.background = "#2fa4e7";
        obj.style.color = "white";
        obj.innerHTML += '<ul id="PTlist"><li style="margin:0px;"><a class="tabOptions tabOptionsSelect" href=".jsp">Topics</li></a><li><a class="tabOptions tabOptionsSelect" href=".jsp">Mock Test</a></li></ul>';
        /*obj.innerAdjacenthtml("PT","<ul><li>Topics</li><li>Prectic Paper</li></ul>");*/
    } else {
        f = true;
        obj.style.background = "white";
        obj.style.color = "#2fa4e7";
        obj.removeChild(document.getElementById("PTlist"));
        /*obj.innerAdjacenthtml("PT","<ul><li>Topics</li><li>Prectic Paper</li></ul>");*/
    }
}
