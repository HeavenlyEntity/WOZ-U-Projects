$(document).ready(function(){    
    $("ul").dblclick(function(){
        $("li").hide();
    });
    $(".header1").hover(function(){
        $(this).css("filter", "hue-rotate(270deg)");
    }, function(){
        $(this).css("filter", "hue-rotate(0deg)");
    });
 
    $("strong").click(function(){
        $("strong").text("jQuery is a fast, JavaScript library that makes many tasks easier and simpler to accomplish. A JavaScript library contains pre-written JavaScript which makes developing applications a bit easier for the developer. This means jQuery is not a language, but an extension of JavaScript. It takes many lines of JavaScript code, which we would have had to write ourselves before jQuery, and compresses it.");
    });   
    $("input").focus(function(){
       $(this).css("background-color", "rgba(11, 255, 44, 0.308)");
    });
    $("input").keydown(function(){
        $(this).css("color", "red");
    });
}); 
