$(function (){
    $("#load").click(function (){
        $.post("/load", function (data,status){
            console.log(status);
            if(status == "success"){
                alert("Valutaer er lastet")
            }
            else{
                alert("Valutaer er ikke lastet")
            }
        })
    })
})