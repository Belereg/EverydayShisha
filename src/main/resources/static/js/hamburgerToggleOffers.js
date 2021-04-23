var open = document.getElementById('hamburger');
var changeIcon = true;
var cacat = document.getElementById("cacat")
var hide_content = document.getElementById("hide_content")
var hide_footer = document.getElementById("hide_footer")
var hide_pricings = document.getElementById("hide_pricings")

hide_pricings
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
        hide_footer.style.display = "none";
        hide_pricings.style.display = "none";
        changeIcon = false;
    }
    else {
        icon.classList.remove("fa-times");
        icon.classList.add("fa-bars");
        cacat.style.display = "flex";
        hide_content.style.display = "inline-block";
        hide_footer.style.display = "block";
        hide_pricings.style.display = "inline-block";
        changeIcon = true;
    }
});