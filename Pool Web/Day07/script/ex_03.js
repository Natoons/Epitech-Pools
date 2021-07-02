window.onload = function () {
    divs = document.getElementsByTagName("div");
    divs[2].onclick = function () {
        var name = window.prompt('What\'s your name ?');
        while (name == "") {
            name = window.prompt('What\'s your name ?');
        }
        if (name != null) { 
            if (confirm = window.confirm('Are you sure that ' + name +' is your name ?')) {
                window.alert("Hello " + name + "!");
                divs[2].innerHTML = "Hello " + name + "!";
            }
        }
    }
}