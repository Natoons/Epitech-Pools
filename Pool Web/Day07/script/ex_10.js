window.onload = function () {
    let divs = document.getElementsByTagName("div");
    let a = document.getElementsByTagName("a");
    let button = document.getElementsByTagName("button")
    let cook = ""
    let cookie = document.cookie;
    console.log(cookie)
    
    let str = cookie.search("acceptsCookies=true")
    
    if(str!='-1'){
        divs[2].innerHTML = '<button>Delete the cookie</button>'
    }
    
    if(button[0]){
        button[0].classList.add("click")
        cook = "y"
    } else {
        a[0].classList.add("click")
        cook = "n"
    }
    
    let click = document.getElementsByClassName("click")
    
    click[0].onclick = function cookies(){
        console.log(cook)
        if(cook === "y"){
            console.log("deleting cookies")
            document.cookie = 'acceptsCookies=; expires=Thu, 01 Jan 1970 00:00:00 UTC;'
            document.location.reload()
        } else {
            console.log("creating cookies")
            let date = new Date(new Date().getTime() + 60 * 60 * 24 * 1000)
            document.cookie = 'acceptsCookies=true; expires='+date
            document.location.reload()
        }
    }
}
