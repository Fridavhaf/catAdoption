$(function (){


    $("#adopt").click(function () {

        let fName = $("#firstName").val();
        let lName = $("#lastName").val();
        let pNumber = $("#phoneNumber").val();
        let eAddress = $("#emailAddress").val();

        const customer = {
            firstName : fName,
            lastName : lName,
            phoneNumber : pNumber,
            emailAddress : eAddress
        }
        $.post("/saveCustomer", customer, function (){
            showCustomers();
        })
        function showCustomers() {
            $.get("/showCustomer", function (data) {
                formaterData2(data);
            });
        }

        function formaterData2(owners){
            console.log(owners);
            let ut = "<table><tr><th>First name</th><th>Last name</th>" +
                "<th>Phone Number</th><th>Email Address</th></tr>";
            for (const owner of owners){
                ut += "<tr><td>" + owner.firstName + "</td><td>" +
                    owner.lastName + "</td><td>" + owner.phoneNumber +
                    "</td><td>" + owner.emailAddress + "</td></tr>";
            }
            ut += "</table>";
            $("#customers").html("<br><h3>Owners</h3>" + ut);
        }


        let catName = $("#catName").val();
        let color = $("#color").val();
        let breed = $("#breed").val();

        const cat = {
            name: catName,
            color: color,
            breed: breed
        }

        $.post("/saveCat", cat, function () {
            showCats();
        });

        $("#catName").val("");
        $("#color").val("");
        $("#breed").val("");

        function showCats() {
            $.get("/showCats", function (data) {
                formaterData(data);
            });
        }

        function formaterData(cats) {
            for (const cat of cats) {
                if (cat.color === "orange"){
                    $("#catImg").html("<img src='images/orangeCat.jpg' alt='Your Orange Cat'>")
                }

            }
            if (color === "orange"){
                $("#catImg").html("<img src='images/orangeCat.jpg' alt='Your Orange Cat'>")
            }
            else if (color === "grey"){
                $("#catImg").html("<img src='images/greyCat.jpg' alt='Your Grey Cat'>")
            }
            // else if (color === "black"){
            //     $("#catImg").html("<img src='images/blackCat.jpg' alt='Your Black Cat'>")
            // }
            // else if (color === "brown"){
            //     $("#catImg").html("<img src='images/brownCat.webp' alt='Your Brown Cat'>")
            // }
            // else if (color === "freckly"){
            //     $("#catImg").html("<img src='images/freckely.webp' alt='Your Freckly Cat'>")
            // }
            else {
                $("#catImg").html("Sorry, we have no picture of your cat")
            }

            let ut = "<table>"
            for (const cat of cats) {
                ut += "<tr><td>Name: </td><td>" + cat.name + "</td></tr>" +
                    "<tr><td>Breed: </td><td>" + cat.breed + "</td></tr>" +
                    "<tr><td>Color: </td><td>" + cat.color + "</td></tr>";
                ut += "<tr><td></td></tr>";
            }
            ut += "</table>"
            $("#yourCats").html("<h2>Congratulation with your new cat!</h2><br><h3>Adopted Cats:</h3>" + ut);

        }




    })
})