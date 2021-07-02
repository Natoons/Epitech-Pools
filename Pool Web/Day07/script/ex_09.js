window.onload = function() {
    canva = document.getElementsByTagName("canvas");
    divs = document.getElementsByTagName("div"); 
    ctx = canva[0].getContext("2d");
    
    canva[0].addEventListener('mousedown', e =>{
        move = true;
        
        window.addEventListener('mouseup', e => {
            if(!move){
                return
            }
            drawRectangle();
            move = false;
        })
        
        window.addEventListener('mousemove', e => {
            if (move){
            drawRectangle();
            }
        })
    })
    
    function drawRectangle () {
        x = event.clientX - divs[0].offsetLeft - 16
        y = event.clientY - divs[0].offsetTop - 10
        
        console.log(x, y)
        if(x > 23 && y > 175 && x <705 && y < 218){
            canva[0].style.position = "absolute"
            canva[0].style.left = x+"px"
            canva[0].style.top = y+"px"
            x = x-20
            y = y -170
            divs[3].innerHTML = "New coordinates => {x:"+x+", y:"+y+"}";
        }

    }
}