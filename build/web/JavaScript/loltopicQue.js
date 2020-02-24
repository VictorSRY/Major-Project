/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){

	$("#checkbutton").click(function(){
		for(var i=1; i<=8 ;i++){
			var user_answer = $("input[name='R"+i+"']:checked").val()
			console.log(user_answer)
			var correct_answer = readCookie("Q"+i)
			console.log(correct_answer)
			if(user_answer == correct_answer){
				$("input[name='R"+i+"']:checked").next().addClass("right")
			}
			else{
				$("input[name='R"+i+"']:checked").next().addClass("wrong")
			}
		}
		$(".choice_input").prop("disabled", true)
	})
})


function readCookie(name) {
            var nameEQ = name + "=";
            var ca = document.cookie.split(';');
            for (var i = 0; i < ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == ' ') c = c.substring(1, c.length);
                if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length, c.length);
            }
            return null;
        }