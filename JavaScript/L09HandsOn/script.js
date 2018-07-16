let profileloader = new XMLHttpRequest();
profileloader.onreadystatechange = function(){
    if (this.readyState == 4 && this.status == 200){
        let Jobject = JSON.parse(this.responseText);
        document.getElementById("name").innerHTML = Jobject.name;
        document.getElementById("birthday").innerHTML = Jobject.birthday;
        document.getElementById("picture").innerHTML = "<img src='"+ Jobject.picture +"'>";
        document.getElementById("bio").innerHTML = Jobject.bio;
    }
};
profileloader.open("GET", "einstein.json", true);
profileloader.send();

$(document).ready(function() {
    $("#bio").hide();
});

$(document).ready(function() {
    $("#loadbutton").click(function(event) {
        $("#bio").show();
    });
});