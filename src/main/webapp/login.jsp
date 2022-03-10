<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

    <title>Training Studio - Free CSS Template</title>
<!--

TemplateMo 548 Training Studio

https://templatemo.com/tm-548-training-studio

-->
    <!-- Additional CSS Files -->
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">

    <link rel="stylesheet" href="assets/css/templatemo-training-studio.css">

    </head>
    
    <body>
    
    <!-- ***** Preloader Start ***** -->
    <div id="js-preloader" class="js-preloader">
      <div class="preloader-inner">
        <span class="dot"></span>
        <div class="dots">
          <span></span>
          <span></span>
          <span></span>
        </div>
      </div>
    </div>
    <!-- ***** Preloader End ***** -->
    
    
    <!-- ***** Header Area Start ***** -->
    <header class="header-area header-sticky">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <nav class="main-nav">
                        <!-- ***** Logo Start ***** -->
                        <a href="index.html" class="logo">Fitness<em> für</em> alle</a>
                        <!-- ***** Logo End ***** -->
                        <!-- ***** Menu Start ***** -->
                        <ul class="nav">
                            <li class="scroll-to-section"><a href="index.html" class="active">Home</a></li>
                            <li class="scroll-to-section"><a href="#features">About</a></li>
                            <li class="scroll-to-section"><a href="#our-classes">Classes</a></li>
                            <li class="scroll-to-section"><a href="#schedule">Schedules</a></li>
                            <li class="scroll-to-section"><a href="#contact-us">Contact</a></li> 
            				<li class="main-button"><a href="login.jsp">Sign in</a></li>
                        </ul>        
                        <a class='menu-trigger'>
                            <span>Menu</span>
                        </a>
                        <!-- ***** Menu End ***** -->
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- ***** Header Area End ***** -->

    <!-- ***** Main Banner Area End ***** -->

    <!-- ***** Features Item Start ***** -->
    
  
    
    
    <section class="section" id="features">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 offset-lg-3">
                
                <div class="section-heading">
                        <h2>Hast du schon ein Konto? hier anmelden</h2>
                        <img src="assets/images/line-dec.png" alt="waves">
                        <div class="contact-form">
                        <form id="contact" action="login" method="post">
                          <div class="row">
                           <div class="col-md-6 col-sm-12">
                              <fieldset>
                                <input name="email" type="text" id="email" pattern="[^ @]*@[^ @]*" placeholder="Your Email*" required="">
                              </fieldset>
                            </div>
                            <div class="col-md-6 col-sm-12">
                              <fieldset>
                                <input name="password" type="password" id="password" placeholder="Password*" required="">
                              </fieldset>
                            </div>
                            
                            <div class="col-lg-12">
                              <fieldset>
                                <button type="submit" id="form-submit" class="main-button">Anmelden</button>
                              </fieldset>
                            </div>
                          </div>
                        </form>
                    </div>
                        
                    </div>
                	 <span style="color: red">${message}</span>
                    <div class="section-heading">
                        <h2>Oder fülle das Formular aus um dich zu registrieren</h2>
                        <img src="assets/images/line-dec.png" alt="waves">
                        <div class="contact-form">
                        <form id="contact" action="register" method="post">
                          <div class="row">
                            <div class="col-md-12 col-sm-6">
                              <fieldset>
                                <input name="name" type="text" id="name" placeholder="Your Name*" required="">
                              </fieldset>
                            </div>
                            <div class="col-md-12 col-sm-6">
                              <fieldset>
                                <input name="email" type="text" id="email" pattern="[^ @]*@[^ @]*" placeholder="Your Email*" required="">
                              </fieldset>
                            </div>
                            <div class="col-md-12 col-sm-6">
                              <fieldset>
                                <input name="age" type="number" id="age"  placeholder="Your Age" required="">
                              </fieldset>
                            </div>
                            <div class="col-md-12 col-sm-6">
                              <fieldset>
                                <input name="password" type="password" id="password" placeholder="Password*" required="">
                              </fieldset>
                            </div>
                            
                            
                            <div class="col-lg-12">
                              <fieldset>
                                <button type="submit" id="form-submit" class="main-button">Registrieren</button>
                              </fieldset>
                            </div>
                          </div>
                        </form>
                        
                       
                    </div>
                        
                    </div>
                </div>
                
            </div>
        </div>
    </section>
    <!-- ***** Features Item End ***** -->

    
   


    <!-- jQuery -->
    <script src="assets/js/jquery-2.1.0.min.js"></script>

    <!-- Bootstrap -->
    <script src="assets/js/popper.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <!-- Plugins -->
    <script src="assets/js/scrollreveal.min.js"></script>
    <script src="assets/js/waypoints.min.js"></script>
    <script src="assets/js/jquery.counterup.min.js"></script>
    <script src="assets/js/imgfix.min.js"></script> 
    <script src="assets/js/mixitup.js"></script> 
    <script src="assets/js/accordions.js"></script>
    
    <!-- Global Init -->
    <script src="assets/js/custom.js"></script>

  </body>
</html>