window.onload = function() {
    divs = document.getElementsByTagName("div");
    var lastChar = "";

    document.addEventListener('keypress', logKey);

    function logKey(e) {
        lastChar += e.key;
        if (lastChar.length > 42) {
            lastChar = lastChar.substring(1);
        }
        divs[2].innerHTML = lastChar;
    }
}