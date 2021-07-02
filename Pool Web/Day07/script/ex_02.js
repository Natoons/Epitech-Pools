window.onload = function () {
    var count = 0;
    divs = document.getElementsByTagName("div");
    divs[2].onclick = function () {
        divs[2].innerHTML = count;
        count++;
    }
}