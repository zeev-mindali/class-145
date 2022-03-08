console.log("me here");

function makeLogin(){
    console.log("doing some login stufffffffff");
    let userName = document.getElementById("uName").value;
    let userPassword = document.getElementById("uPass").value;

    if (userName=="admin@admin.com" && userPassword=="admin"){
         document.getElementById("res").innerHTML="<b>Hello Administrator</b>";
         window.location.href="https://www.johnbryce.co.il";
    } else {
        document.getElementById("res").innerHTML="WTF R U !!!!";
    }
}