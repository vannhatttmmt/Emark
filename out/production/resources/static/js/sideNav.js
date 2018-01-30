function openNav() {
    document.getElementById("mySidenav").style.width = "200px";
    document.getElementById("main").style.marginLeft = "150px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.1)";
    document.getElementById("main").style.opacity = "0.6";
    $('.sidenav-hide-icon').css("display", "block");
    $('.sidenav-show-icon').css("display", "none");
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "50px";
    document.getElementById("main").style.marginLeft = "0px";
    document.body.style.backgroundColor = "white";
    document.getElementById("main").style.opacity = "1";
    $('.sidenav-hide-icon').css("display", "none");
    $('.sidenav-show-icon').css("display", "block");
}