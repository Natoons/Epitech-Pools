window.onload = function() {
    buttons = document.getElementsByTagName("button");
    canva = document.getElementsByTagName("canvas");
    myAudio = new Audio('https://file-examples-com.github.io/uploads/2017/11/file_example_MP3_700KB.mp3');

    canva[0].onclick = function play () {
        myAudio.play();
    }

    buttons[0].onclick = function pause () {
        myAudio.pause();
    }

    buttons[1].onclick = function stop () {
        myAudio.pause();
        myAudio.currentTime = 0;
    }

    buttons[2].onclick = function mute () {
        if(myAudio.muted == true) {
            myAudio.muted = false;
        }
        else {
            myAudio.muted = true;  
        }
    }

    var context = canva[0].getContext("2d");

    context.beginPath();
    context.moveTo(6, 6);
    context.lineTo(14, 10);
    context.lineTo(6, 14);
    context.closePath();

    context.fillStyle = "#FFFFFF";
    context.fill();
}