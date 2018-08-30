<!DOCTYPE html>
<!-- saved from url=(0025)https://bibi.themeix.com/ -->
<html lang="en">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
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
<body class="home-template">
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
                                        <li><a href="/home?p=1">Home</a></li>
                                        <#if usuario?? && usuario.autor == true>
                                            <li><a href="/crearPost">Crear Post</a></li>
                                         <li><a href="/logout">Log-out</a></li>
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
                <a href="/home?p=1" class="themeix-navbar-brand navbar-brand d-flex align-items-center">
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
    <!-- End Header Area -->
    <!-- Start Post Area -->
    <div class="post-area section-spacing">
        <div class="container">
            <div class="row">
                <div class="col-md-12 m-auto">

                    <#list articulos as articulo>
                        <div class="themeix-post-style wow fadeIn d-md-flex" style="visibility: hidden; animation-name: none;">
                            <div class="post-featured-image" style="background-image:url(https://dcassetcdn.com/design_img/2312077/501322/501322_12084041_2312077_9b8c94a4_thumbnail.png);background-size: cover;background-position: center center;"></div>

                            <div class="themeix-post-descript">
                                <div class="post-big-font">${articulo_index + 1}</div>
                                <ul class="post-meta-data list-inline">
                                    <#if usuario??>
                                        <#if usuario.administrator == true && usuario.autor == true>
                                        <li>
                                            <a href="editarPost/${articulo.id}"><strong>Editar</strong></a>
                                        </li>
                                        </#if>
                                    </#if>
                                    <li class="list-inline-hemeix.com/welcome/"> <a href="/articulo/${articulo.id}"><h3 class="title_heading">${articulo.titulo}</h3></a>
                                        <p>${articulo.cuerpo[0..*70]}</p>
                                 <i class="fa fa-calendar"></i> ${articulo.fecha}</li>

                                    <div class="single-share-post d-flex justify-content-between themeix">
                                        <div class="tags-cloud-wrapper">
                                            <span class="mr-2"><i class="fa fa-tag"></i> Tags: </span>
                                            <div class="tag-list">
                                <#if articulo.listaEtiq??>
                                    <#list articulo.listaEtiq as etiqueta>
                                            <a href="/tagFilter/${etiqueta.etiq}?p=1">${etiqueta.etiq}<#sep>, </#sep></a>
                                    </#list>
                                </#if>
                                            </div>
                                        </div>
                                        <#if usuario??>
                                            <#if usuario.administrator == true && usuario.autor == true>
                                        <li>
                                            <a href="eliminar/${articulo.id}"><strong class="alert-danger">ELIMINAR</strong></a>
                                        </li>
                                            </#if>
                                        </#if>
                                </ul>
                            </div>
                        </div>
                    </#list>
                    </div>

                </div>
            </div>
        </div>




    </div>

</body>
    <!-- End Post Area -->
<footer class="footer-area section-spacing bg-color2">
    <div class="container">
        <div class="themeix-footer-widget">
            <ul class="pagination">
            <#if prevN == 1>
					<li><a class="active" href="/home?p=${prev}">&lt;&lt; Previous Page</a></li>

            </#if>

            <#if nextN == 1>
                <li><a class="active" href="/home?p=${next}">Next Page &gt;&gt;</a></li>
            </#if>

            </ul>
        </div>
    </div>
</footer>
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