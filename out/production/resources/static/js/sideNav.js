function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "200px";
    document.body.style.backgroundColor = "rgba(0,0,0,0)";
    $('.sidenav-left').hide();
    $('.sidenav-right').show();
    $('.sidenav-hide-icon').show();
    $('#sidenav-open').css("display", "none");
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "50px";
    document.getElementById("main").style.marginLeft = "0px";
    document.body.style.backgroundColor = "white";
    $('.sidenav-left').css("width", "100%");
    $('.sidenav-left').show();
    $('.sidenav-right').hide()
    $('.sidenav-hide-icon').hide();
    $('#sidenav-open').css("display", "block");
}

var dropdown = document.getElementsByClassName("dropdown-btn");
var i;

for (i = 0; i < dropdown.length; i++) {
    dropdown[i].addEventListener("click", function () {
        this.classList.toggle("active");
        var dropdownContent = this.nextElementSibling;
        if (dropdownContent.style.display === "block") {
            dropdownContent.style.display = "none";
        } else {
            dropdownContent.style.display = "block";
        }
    });
}