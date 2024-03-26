


$("#add").click(function(){
    let field1 = $("#field1").val();
    let field2 = $("#field2").val();

    //let [field1, field2] = readInput();

    if(!validateInput(field1, field2)){
        return;
    }

    let url = "/add?field1=" + field1 + "&field2=" + field2;

    $.get(url, function(data) {
        $("#calc_result").html(data);
    });

    }
)

$("#subtract").click(function (){
    let [field1, field2] = readInput();
    if(!validateInput(field1, field2)){
        return;
    }
    let url = "/subtract?field1=" + field1 + "&field2=" +field2;

    $.get(url, function (data){
        // This function is called when the GET request is successful
        // The 'data' parameter contains the response data from the server
        // You can manipulate the received data here
        $("#calc_result").html(data);
    });
})
$("#multiply").click(function (){
    let [field1, field2] = readInput();
    if(!validateInput(field1, field2)){
        return;
    }
    let url = "/multiply?field1="+field1+"&field2="+field2;
    $.get(url, function (data){
        $("#calc_result").html(data);
    });
})

$("#divide").click(function (){
    let [field1, field2] = readInput();
    if(!validateInput(field1, field2)){
        return;
    }
    let url = "/divide?field1="+field1+"&field2="+field2;
    $.get(url, function (data){
        $("#calc_result").html(data);
    });
})

//This function is just shortening the code, see add for alternative method
function readInput(){
    let field1 = $("#field1").val();
    let field2 = $("#field2").val();
    return [field1, field2];
}

function validateInput(field1, field2) {

    if (field1 === "" || field2 === "") {
        alert("Fyll inn begge feltene!");
        return false;
    }
    if (isNaN(field1) || isNaN(field2)) {
        alert("Fyll inn tall i begge feltene!");
        return false;
    }
    return true;
}