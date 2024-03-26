//id temp fra html kalles når knapp trykkes
//function temp er da en event som vil bli executed
//"temp" is just a random name for the function.
$("#temp").click(function temp(){
    // Get the value entered in the input field with id "month"
    let month = $("#month").val();
    // Jeg konstruer URL-en for AJAX-forespørselen ved å legge til månedsparameteren
    let url = "temp?month=" + month;

    // Send a GET request to the server at the specified URL
    $.get(url, function (data){
        let temp = "Temperaturen i "+month.toLowerCase() + " er " + data + " grader C."
        // Upon receiving a response from the server, execute this function
        // Concatenate the month value and temperature data to create a message

        // Update the HTML content of the element with id "result" with the temperature message
        $("#result").html(temp);
    })

});