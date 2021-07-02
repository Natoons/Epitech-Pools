window.onload = function() {
    canva = document.getElementsByTagName("canvas");
    nbOrange = 0;
    nbPurple = 0;
    nbBlack = 0;
    nbOlive = 0;

    for(i = 0; i < canva.length; i++) {
        let color = window.getComputedStyle(canva[i], null).getPropertyValue("background-color");

        if (color === "rgb(255, 165, 0)") {
            nbOrange += 1;
        }

        else if (color === "rgb(128, 0, 128)") {
            nbPurple+=  1;
        }

        else if (color === "rgb(0, 0, 0)") {
            nbBlack+= 1;
        }

        else if (color === "rgb(128, 128, 0)") {
            nbOlive += 1;
        }
    }
    
    for(i = 0; i < canva.length; i++) {
        if (nbOrange > 0) {
            canva[i].style.background = "orange";
            nbOrange--;
        }
        else if (nbPurple > 0) {
            canva[i].style.background = "purple";
            nbPurple--;
        }
        else if (nbBlack > 0) {
            canva[i].style.background = "black";
            nbBlack--;
        }
        else if (nbOlive > 0) {
            canva[i].style.background = "olive";
            nbOlive--;
        }
    }
}