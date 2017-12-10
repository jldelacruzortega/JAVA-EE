/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    sendNameParameter();
    sendNamePathVariable();
    
});


function sendNameParameter() {
    var nombre="Juan";
    
    $("#paramPath").click(function (){
         $.ajax({
        url : "http://localhost:8080/springWebTutorial/fragments/product/requestparamPath?name="+nombre,
        method : "get",
        dataType : "html",
        success : function(response) {
            console.log(response);
        }
        
    });
        
    });  
    
}


function sendNamePathVariable() {
    var nombre="Juan";
    
    $("#variablePath").click(function (){
         $.ajax({
        url : "http://localhost:8080/springWebTutorial/fragments/product/pathvariable/"+nombre,
        method : "get",
        dataType : "html",
        success : function(response) {
            console.log(response);
        }
        
    });
        
    });  
    
}