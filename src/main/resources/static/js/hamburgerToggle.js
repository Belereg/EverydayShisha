var open = document.getElementById('hamburger');
var changeIcon = true;
var cacat = document.getElementById("cacat")
var hide_instagram = document.getElementById("hide_instagram")
var hide_facebook = document.getElementById("hide_facebook")
var hide_snapchat = document.getElementById("hide_snapchat")
var hide_phone = document.getElementById("hide_phone")
var hide_whatsapp = document.getElementById("hide_whatsapp")
// var hide_content = document.getElementById("hide_content")

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
        hide_instagram.style.display = "none";
        hide_facebook.style.display = "none";
        hide_snapchat.style.display = "none";
        hide_phone.style.display = "none";
        hide_whatsapp.style.display = "none";
        // hide_content.style.display = "none";
        changeIcon = false;
    }
    else {
        icon.classList.remove("fa-times");
        icon.classList.add("fa-bars");
        cacat.style.display = "flex";
        hide_instagram.style.display = "inline-block";
        hide_facebook.style.display = "inline-block";
        hide_snapchat.style.display = "inline-block";
        hide_phone.style.display = "inline-block";
        hide_whatsapp.style.display = "inline-block";

        // hide_content.style.display = "inline-block";
        changeIcon = true;
    }
});