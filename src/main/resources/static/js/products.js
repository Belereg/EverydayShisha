$(document).ready(function () {
    $('div .tb').mouseover(function () {
        divId = $(this).parent().parent().attr('id');
        console.log(divId);

        $(`div#${divId} .tb`).removeClass('tb-active');
        $(this).addClass('tb-active');

        current_fs = $(`div#${divId} .active`);

        next_fs = $(this).attr('id');
        next_fs = '#' + next_fs + '1';

        $(`div#${divId} fieldset`).removeClass('active');
        $(next_fs).addClass('active');

        // current_fs.animate(
        //     {},
        //     {
        //         step: function () {
        //             current_fs.css({
        //                 'display': 'none',
        //                 'position': 'relative',
        //             });
        //             next_fs.css({
        //                 'display': 'block',
        //             });
        //         },
        //     }
        // );
    });
});

var open = document.getElementById('hamburger');
var changeIcon = true;
var cacat = document.getElementById("cacat")
var hide_products = document.getElementById("hide_products")
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
        hide_products.style.display = "none";
        hide_footer.style.display = "none";
        changeIcon = false;
    }
    else {
        icon.classList.remove("fa-times");
        icon.classList.add("fa-bars");
        cacat.style.display = "flex";
        hide_products.style.display = "inline-block";
        hide_footer.style.display = "block";
        changeIcon = true;
    }
});
