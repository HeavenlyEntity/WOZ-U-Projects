
var fullName = (firstname + " " + lastname);

function nameFormat() {
    
    firstname = document.getElementById("firstname").value;
    lastname = document.getElementById("lastname").value;
    fullname = (firstname + " " + lastname);
    let firstRegex = /^[a-zA-Z0-9]*$/.test(firstname);
    let lastRegex = /^[a-zA-Z0-9]*$/.test(lastname);
    if (firstname === true && lastname === true) {
      alert("Valid Credidentials");
    
   }else {
     alert("Credidentials are invalid");
     
   }
}


nameFormat(firstname);
nameFormat(lastname);





