<!DOCTYPE html>
<!-- saved from url=(0025)https://bibi.themeix.com/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Blog Space - Home</title>
    <!-- Add CSS File -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/responsive.css">
    <!--  Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
    <meta name="description" content="Thoughts, stories and ideas.">
    <link rel="shortcut icon" href="https://bibi.themeix.com/favicon.ico" type="image/x-icon">
    <link rel="canonical" href="http://bibi.themeix.com/">
    <meta name="referrer" content="no-referrer-when-downgrade">
    <link rel="next" href="https://bibi.themeix.com/page/2/">

    <meta property="og:site_name" content="Bibi - Responsive Ghost Theme">
    <meta property="og:type" content="website">
    <meta property="og:title" content="Bibi - Responsive Ghost Theme">
    <meta property="og:description" content="Thoughts, stories and ideas.">
    <meta property="og:url" content="http://bibi.themeix.com/">
    <meta property="og:image" content="http://bibi.themeix.com/content/images/2018/06/slider-img.jpg">
    <meta property="article:publisher" content="https://www.facebook.com/themeix">
    <meta name="twitter:card" content="summary_large_image">
    <meta name="twitter:title" content="Bibi - Responsive Ghost Theme">
    <meta name="twitter:description" content="Thoughts, stories and ideas.">
    <meta name="twitter:url" content="http://bibi.themeix.com/">
    <meta name="twitter:image" content="http://bibi.themeix.com/content/images/2018/06/slider-img.jpg">
    <meta name="twitter:site" content="@themeix_ltd">
    <meta property="og:image:width" content="1424">
    <meta property="og:image:height" content="942">

    <script type="application/ld+json">
{
    "@context": "https://schema.org",
    "@type": "WebSite",
    "publisher": {
        "@type": "Organization",
        "name": "Bibi - Responsive Ghost Theme",
        "logo": "http://bibi.themeix.com/content/images/2018/07/bibiblog.png"
    },
    "url": "https://bibi.themeix.com/",
    "image": {
        "@type": "ImageObject",
        "url": "http://bibi.themeix.com/content/images/2018/06/slider-img.jpg",
        "width": 1424,
        "height": 942
    },
    "mainEntityOfPage": {
        "@type": "WebPage",
        "@id": "http://bibi.themeix.com/"
    },
    "description": "Thoughts, stories and ideas."
}
    </script>

    <script src="js/ghost-sdk.min.js"></script>
    <script>
        ghost.init({
            clientId: "ghost-frontend",
            clientSecret: "723e9a4f45e4"
        });
    </script>
    <meta name="generator" content="Ghost 1.24">
    <link rel="alternate" type="application/rss+xml" title="Blog Space" href="https://bibi.themeix.com/rss/">
    <meta name="ROBOTS" content="NOINDEX, NOFOLLOW">
    <meta name="google-site-verification" content="0eZCam5WiXbBLJ4qbXdYKZwPqBY7B5JnBDiq3kM-Ts8">
    <style id="fit-vids-style">.fluid-width-video-wrapper{width:100%;position:relative;padding:0;}.fluid-width-video-wrapper iframe,.fluid-width-video-wrapper object,.fluid-width-video-wrapper embed {position:absolute;top:0;left:0;width:100%;height:100%;}</style><script src="./Blog_files/l.js.download" async=""></script><link href="https://client.relay.crisp.chat/" rel="dns-prefetch" crossorigin=""><link href="https://settings.crisp.chat/" rel="preconnect" crossorigin=""><link href="https://client.crisp.chat/" rel="preconnect" crossorigin=""><link href="https://image.crisp.chat/" rel="preconnect" crossorigin=""><script src="./Blog_files/client.js.download" type="text/javascript" async=""></script><link href="./Blog_files/client_default.css" type="text/css" rel="stylesheet"></head>

<div class="main-area">

    <!-- Start Header Area -->
    <header class="header-area">
        <div class="themeix-header-collapse collapse bg-color2" id="navbarHeader">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="themeix-header-nav text-left">
                            <div class="menu-outer">
                                <div class="table">
                                    <ul id="horizontal-list">
                                        <li><a href="/home">Home</a></li>
                                        <#if usuario??>
                                            <li><a href="/crearPost">Crear Post</a></li>
                                         <li><a href="/logout">Log-outF</a></li>
                                        <#else>
                                           <li><a href="/log-in">Log-in</a></li>
                                           <li><a href="/signupPage">Sign-up</a></li>
                                        </#if>

                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="themeix-navbar navbar bg-color">
            <div class="container d-flex justify-content-between">
                <a href="/home" class="themeix-navbar-brand navbar-brand d-flex align-items-center">
                    <img src="./Blog_files/bibiblog.png" alt="Blog Space">
                </a>
                <button class="toggle-nav js-toggle-nav navbar-toggler" data-toggle="collapse" data-target="#navbarHeader">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                </button>
            </div>
        </div>
    </header>
<body class="post-area section-spacing">
    <form action="/crearPost" method="post">

        <div class="row">
            <div class="form-group col-lg-4">
            <label for="titulo">Titulo</label>
            <input type="text" name="titulo" placeholder="Titulo del articulo" class="form-control" >
            </div>
            </div>

        <div class="row">
            <div class="form-group col-lg-6">
            <label for="cuerpo">Cuerpo</label>
            <textarea type="text" name="cuerpo" placeholder="Cuerpo del articulo" class="form-control"></textarea>
        </div>
            </div>

        <div class="row">
            <div class="form-group col-lg-4">
            <label for="listaEtiqueta">Etiquetas</label>
            <input type="text" name="listaEtiqueta" placeholder="Etiquetas del articulo" class="form-control">
        </div>
            </div>
        <div>
            <button type="submit" class="btn">
                Crear Post
            </button>
        </div>
    </form>
</body>

    <footer class="footer-area section-spacing bg-color2">
        <div class="container">
                <p class="themeix-footer-copyright">©Copyright - 2018 Bibi - Responsive Ghost Theme - Designed by <a href="http://themeix.com/">Themeix</a></p>
                <p class="themeix-footer-copyright-bottom">Published with  <a href="https://ghost.org/">Ghost</a></p>
            </div>
        </div>
    </footer>
    <!-- End Footer Area -->
</div>
<!-- Add Javascript File -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.easing.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/jquery.fitvids.js"></script>
<script src="js/custom.js"></script>
</html>