<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <title>${articulo.titulo}</title>
    <!-- Add CSS File -->
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
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="canonical" href="http://bibi.themeix.com/themes-2/" />
    <meta name="referrer" content="no-referrer-when-downgrade" />
    <link rel="amphtml" href="http://bibi.themeix.com/themes-2/amp/" />

    <meta property="og:site_name" content="Bibi - Responsive Ghost Theme" />
    <meta property="og:type" content="article" />
    <meta property="og:title" content="Setting up your own Ghost theme" />
    <meta property="og:description" content="Creating a totally custom design for your publication Ghost comes with a beautiful default theme called Casper, which is designed to be a clean, readable publication layout and can be easily adapted for most purposes. However, Ghost can also be completely themed to suit your needs. Rather than just giving" />
    <meta property="og:url" content="http://bibi.themeix.com/themes-2/" />
    <meta property="og:image" content="https://casper.ghost.org/v1.0.0/images/design.jpg" />
    <meta property="article:published_time" content="2018-06-04T08:59:27.000Z" />
    <meta property="article:modified_time" content="2018-06-05T04:13:07.000Z" />
    <meta property="article:tag" content="Getting Started" />

    <meta property="article:publisher" content="https://www.facebook.com/themeix" />
    <meta property="article:author" content="https://www.facebook.com/try_ghost" />
    <meta name="twitter:card" content="summary_large_image" />
    <meta name="twitter:title" content="Setting up your own Ghost theme" />
    <meta name="twitter:description" content="Creating a totally custom design for your publication Ghost comes with a beautiful default theme called Casper, which is designed to be a clean, readable publication layout and can be easily adapted for most purposes. However, Ghost can also be completely themed to suit your needs. Rather than just giving" />
    <meta name="twitter:url" content="http://bibi.themeix.com/themes-2/" />
    <meta name="twitter:image" content="https://casper.ghost.org/v1.0.0/images/design.jpg" />
    <meta name="twitter:label1" content="Written by" />
    <meta name="twitter:data1" content="Ghost" />
    <meta name="twitter:label2" content="Filed under" />
    <meta name="twitter:data2" content="Getting Started" />
    <meta name="twitter:site" content="@themeix_ltd" />
    <meta name="twitter:creator" content="@try_ghost" />
    <meta property="og:image:width" content="1400" />
    <meta property="og:image:height" content="1050" />

    <script type="application/ld+json">
{
    "@context": "https://schema.org",
    "@type": "Article",
    "publisher": {
        "@type": "Organization",
        "name": "Bibi - Responsive Ghost Theme",
        "logo": "http://bibi.themeix.com/content/images/2018/07/bibiblog.png"
    },
    "author": {
        "@type": "Person",
        "name": "Ghost",
        "image": {
            "@type": "ImageObject",
            "url": "http://bibi.themeix.com/content/images/2018/06/admin-img.png",
            "width": 73,
            "height": 73
        },
        "url": "https://bibi.themeix.com/author/ghost/",
        "sameAs": [
            "http://ghost.org",
            "https://www.facebook.com/try_ghost",
            "https://twitter.com/try_ghost"
        ]
    },
    "headline": "Setting up your own Ghost theme",
    "url": "https://bibi.themeix.com/themes-2/",
    "datePublished": "2018-06-04T08:59:27.000Z",
    "dateModified": "2018-06-05T04:13:07.000Z",
    "image": {
        "@type": "ImageObject",
        "url": "https://casper.ghost.org/v1.0.0/images/design.jpg",
        "width": 1400,
        "height": 1050
    },
    "keywords": "Getting Started",
    "description": "Creating a totally custom design for your publication Ghost comes with a beautiful default theme called Casper, which is designed to be a clean, readable publication layout and can be easily adapted for most purposes. However, Ghost can also be completely themed to suit your needs. Rather than just giving",
    "mainEntityOfPage": {
        "@type": "WebPage",
        "@id": "http://bibi.themeix.com/"
    }
}
    </script>

    <script src="/public/ghost-sdk.min.js?v=56b100dc45"></script>
    <script>
        ghost.init({
            clientId: "ghost-frontend",
            clientSecret: "723e9a4f45e4"
        });
    </script>
    <meta name="generator" content="Ghost 1.24" />
    <link rel="alternate" type="application/rss+xml" title="Bibi - Responsive Ghost Theme" href="https://bibi.themeix.com/rss/" />
    <META NAME="ROBOTS" CONTENT="NOINDEX, NOFOLLOW">
    <meta name="google-site-verification" content="0eZCam5WiXbBLJ4qbXdYKZwPqBY7B5JnBDiq3kM-Ts8" />
</head>
<body class="post-template tag-getting-started">
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
                <a href="/home" class="themeix-navbar-brand navbar-brand d-flex align-items-center">
                    <img src="/content/images/2018/07/bibiblog.png" alt="Blog Space" />
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
    <!-- Start Well Area -->
    <section class="section-well bg-color2">
        <div class="container">
            <div class="well-wrapper">
                <h2>${articulo.titulo}</h2>
            </div>
        </div>
    </section>
    <!-- End Well Area -->
    <!-- Start Single Area -->
    <div class="single-area section-spacing">
        <div class="container">
            <div class="row">
                <div class="offset-md-2 col-md-8">
                    <div class="post-area">
                        <div class="post-details">
                            <p>${articulo.cuerpo}</p>
                    </div>
                    <div class="single-share-post d-flex justify-content-between themeix">
                        <div class="tags-cloud-wrapper">
                            <span class="mr-2"><i class="fa fa-tag"></i> Tags: </span>
                            <div class="tag-list">
                                <#if articulo.listaEtiq??>
                                    <#list articulo.listaEtiq as etiqueta>

                                            <a href="#">${etiqueta.etiq}<#sep>,</#sep></a>

                                    </#list>


                                </#if>
                            </div>
                        </div>
                    </div>

                    <div class="single-admin wow fadeIn">
                        <div class="single-admin-avatar">
                            Autor: ${autor.username}
                        </div>
                    </div>

                        <#if usuario??>
                        <div class="form-group">
                            <form style="display: inline;" action="/articulo/${articulo.id}/like" method="get">
                                <button class="btn" type="submit" >
                                    ${numeroLikes} Like
                                </button>
                            </form>

                            <form action="/articulo/${articulo.id}/dislike" style="display: inline;" method="get">
                                <button class="btn" type="submit">
                                    ${numeroDislikes} Dislike
                                </button>
                            </form>

                        </div>
                        <div class="form-group">
                            <form action="${articulo.id}/comentar" method="post">
                                <label for="comentario">
                                    Comentario:
                                    <input type="text" name="comentario" class="text-field">
                                </label>

                                <div>
                                    <button type="submit" class="btn">
                                        Comentar
                                    </button>
                                </div>
                            </form>
                        </div>
                        </#if>
                    <div class="single-title">
                        <h4>Comments</h4>
                        <div class="comments">
                            <#if articulo.listaComs??>
                                <#list articulo.listaComs as comentarios>

                                        ${comentarios.autor.username} dijo:
                                <div>
                                    ${comentarios.com}
                                </div>

                                </#list>

                            <#else>
                                <h5>No hay comentarios</h5>
                            </#if>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <!-- End Single Area -->

    <!-- Start Footer Area -->
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
</body>
</html>