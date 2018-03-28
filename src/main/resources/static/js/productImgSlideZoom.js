$('.next').click(function () {
    $('div.mySlides').addClass('animated fadeInRight');
    $('div.mySlides').removeClass('fadeInLeft');
});

$('.prev').click(function () {
    $('div.mySlides').addClass('animated fadeInLeft');
    $('div.mySlides').removeClass('fadeInRight');
});
$('#zoom_01').elevateZoom({
    cursor: "crosshair",
    zoomWindowFadeIn: 500,
    zoomWindowFadeOut: 750,
    scrollZoom : true,
    easing: true
});

$('#zoom_02').elevateZoom({
    cursor: "crosshair",
    zoomWindowFadeIn: 500,
    zoomWindowFadeOut: 750,
    scrollZoom : true,
    easing: true
});

$('#zoom_03').elevateZoom({
    cursor: "crosshair",
    zoomWindowFadeIn: 500,
    zoomWindowFadeOut: 750,
    scrollZoom : true,
    easing: true
});

$('#zoom_04').elevateZoom({
    cursor: "crosshair",
    zoomWindowFadeIn: 500,
    zoomWindowFadeOut: 750,
    scrollZoom : true,
    easing: true
});
