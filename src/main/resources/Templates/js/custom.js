(function($) {

    "use strict";

    // TOOGLE CLASS

    $('.js-toggle-nav').on('click', function(event) {
        event.preventDefault();
        $('.js-toggle-nav').toggleClass('open');
    });

    // ADD WOW JS

    var wow = new WOW({
        boxClass: 'wow', // default
        animateClass: 'animated', // default
        offset: 0, // default
        mobile: true, // default
        live: true // default
    })

    wow.init();



    // bootstrap carousel add active class

    $(".carousel-inner").find(".carousel-item").first().addClass("active");


    // remove margin-bottom when the tag element one item

    if ($(".themeix-post-style").length > 0) {

        var post_count = $(".themeix-post-style").length;

        if (post_count == 1) {
            $(".themeix-post-style").css({
                "marginBottom": 0
            });
        }
    }

    // active fitvids

       $(".kg-post, .kg-markdown").fitVids();




})(jQuery);