var open = document.getElementById('hamburger');
var changeIcon = true;
var cacat = document.getElementById("cacat")
var hide_about = document.getElementById("hide_about")
var hide_testimonials = document.getElementById("hide_testimonials")
var hide_footer = document.getElementById("hide_footer")

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
        hide_about.style.display = "none";
        hide_testimonials.style.display = "none";
        hide_footer.style.display = "none";
        changeIcon = false;
    }
    else {
        icon.classList.remove("fa-times");
        icon.classList.add("fa-bars");
        cacat.style.display = "flex";
        hide_about.style.display = "inline-block";
        hide_testimonials.style.display = "block";
        hide_footer.style.display = "block";

        changeIcon = true;
    }
});