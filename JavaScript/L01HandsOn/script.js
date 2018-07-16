let age = 15;

function allowedIntoMovie(){
    if(age < 10){
        console.log("You're " + age + ", sorry you are not permitted to see this movie.");
    } else if (age < 15) {
        console.log("You're " + age + ", you can attend if accompanied by a parent.");
        } else if (age < 18) {
          console.log("You're " + age + ", you can attend with anyone over the age of 18.");
          }  else if (age > 18){
            console.log("You're " + age + ", you can attend this movie alone.");
            } 
}
console.log(allowedIntoMovie(age));
