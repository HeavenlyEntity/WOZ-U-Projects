let gitHubRequest = new XMLHttpRequest();
gitHubRequest.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    let gitObject = JSON.parse(this.responseText);
    document.getElementById("gitBoi").innerHTML = gitObject.bio;
  }
};
newRequest.open("GET", "https://api.github.com/users/HeavenlyEntity", true);
newRequest.send();