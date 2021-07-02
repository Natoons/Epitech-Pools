window.onload = function() {
    buttons = document.getElementsByTagName("button");
    divs = document.getElementsByTagName("div");
    selects = document.getElementsByTagName("select");
    font = 16;
    fontChange = 2;
    buttons[0].onclick = function increaseFont() {
        font = font + fontChange
        divs[0].style.fontSize = font + "px";
        }

    buttons[1].onclick = function decreaseFont() {
        font = font - fontChange
        divs[0].style.fontSize = font + "px";
    }

    selects[0].onclick = function backgroundColor() {
        document.body.style.backgroundColor = this.value;
    }
}