var open = document.getElementById('hamburger');
var changeIcon = true;
var cacat = document.getElementById("cacat")
var hide_content = document.getElementById("hide_content")

open.addEventListener("click", function(){

    var overlay = document.querySelector('.overlay');
    var nav = document.querySelector('nav');
    var icon = document.querySelector('.menu-toggle i');
    overlay.classList.toggle("menu-open");
    nav.classList.toggle("menu-open");

    if (changeIcon) {
        icon.classList.remove("fa-bars");
        icon.classList.add("fa-times");
        cacat.style.display = "none";
        hide_content.style.display = "none";
        changeIcon = false;
    }
    else {
        icon.classList.remove("fa-times");
        icon.classList.add("fa-bars");
        cacat.style.display = "flex";
        hide_content.style.display = "inline-block";
        changeIcon = true;
    }
});