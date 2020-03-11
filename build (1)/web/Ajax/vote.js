/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $(".IQuestion").click(function(){
                $.ajax({
                    URL : "IQVotes",
                    type : "POST",
                    dataType : "json",
                    data:{"Action":$(this).attr('name') ,"Id"    : $(this).parent().parent().attr("id")}/*$(this).parent().parent().serialize()*/,
                    sucess : function(data){
                         console.log(data);
                    }
                })
                return false
        })
})