$(function(){

    $("#registrer").click(function (){
        //initiate object, the objects name don't have to match, but the attributes do
        const bil = {
            personnummer : $("#personnr").val(),
            navn : $("#navn").val(),
            adresse : $("#adresse").val(),
            kjennetegn : $("#kjennetegn").val(),
            bilmerke : $("#merke").val(),
            biltype : $("#type").val()
        }

        /*
        I post the object to the array in the server
        The function(){} is an anonymous callback function that will be executed once the AJAX
        request is completed. Inside this function, you can specify the actions you want to take
        based on the response from the server.
         */
        $.post("/save", bil, function (){
            //We want getAll executed once request is completed
            getAll();
        });
        //clear input fields
        $("#personnr").val("");
        $("#navn").val("");
        $("#adresse").val("");
        $("#kjennetegn").val("");
        $("#merke").val("");
        $("#type").val("");
    })

    /*
    Function getAll is now defined. It is getting data  from a method with a GetMapping
    "/getAll" in the controller. Data is the data that the method returns, which will
    be the objects of the array
    */
    function getAll(){
        $.get("/getAll", function (data){
            formaterData(data);
        });
    }

    //Function that defines how the data will be shown in the html.
    function formaterData(motorvogner){
        let ut = "<table><tr><th>Personnr</th><th>Navn</th><th>Adresse</th><th>Kjennetegn</th>" +
            "<th>Merke</th><th>Type</th></tr>";
        for(const motorvogn of motorvogner){
            ut += "<tr><td>" + motorvogn.personnummer + "</td><td>" + motorvogn.navn + "</td><td>" +
        motorvogn.adresse + "</td><td>" + motorvogn.kjennetegn + "</td><td>" + motorvogn.bilmerke +
        "</td><td>" + motorvogn.biltype + "</td></tr>";
        }
        ut += "</table>";
        $("#bilregister").html(ut);
    }

    $("#slettAlle").click(function (){
        $.get("/deleteAll", function (){
            getAll();
        })
    })
});