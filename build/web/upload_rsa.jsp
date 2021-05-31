<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

    <title>File_Upload-RSA</title>
    
    <!-- Additional CSS Files -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="css/font-awesome.css">

    <link rel="stylesheet" href="css/style.css">
    
    <style>


.banner { 
    position:fixed;
    top:25%;
    left:30%;
    background: rgba(250,250,250,0.9); 
    width: 600px; 
    height: 300px;
    
}
.banner p{color: #0077b5; padding-top: 20px;}
.banner h1{ padding-top: 20px; padding-bottom: 20px;}

.btn{
  background:#adad85;
  width:125px;
  padding-top:5px;
  padding-bottom:5px;
  color:black;
  border-radius:4px;
  border: #27ae60 1px solid;
  text-align: center;
  margin-top:40px;
  margin-bottom:20px;
  margin-left:16px;
  font-weight:800;
  font-size:0.8em;
}

.btn:hover{
  background:#00a6ff;color:white; 
}

    </style>
       
      </head>
    
    <body style="overflow:hidden;">
    
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
                        <a href="clienthome.jsp" class="logo"> SECURE <em> DATA </em></a>
                        <!-- ***** Logo End ***** -->
                        <!-- ***** Menu Start ***** -->
                        <ul class="nav">
                        <li><a href="clienthome.jsp" style="color:black;" >Home</a></li>
                        <li><a href="clientprofile.jsp" style="color:black;" >PROFILE</a></li>
                        <li><a href="file_upload.jsp" class="active" >FILE UPLOAD</a></li>
                        <li><a href="clientfile.jsp" style="color:black;">FILE DETAILS</a></li>
                        <li><a href="file_download.jsp" style="color:black;">DOWNLOAD</a></li>
                        <li class="main-button"><a href="index.html">LOGOUT</a></li> 
                        </ul>                                            
                        <a class='menu-trigger'>
                            <span>Menu</span>
                        </a>
                        <!-- ***** Menu End ***** -->
                    </nav>
                </div>
            </div>
        </div>
        

            <div class="banner">
            
                <center> <h1>Upload File</h1> 
    
    <form class="form" method="post" action="Servlet_rsaup" enctype="multipart/form-data">
       <p> Select Files to Upload: </p>
        
       <p class="field">
          <input type="file" name="file" accept="50" size="50" multiple/>
      </p>
      
      <input type="submit" name="sent" value="UPLOAD" class="btn" > 
      <a href="upload_tdes.jsp"><div class="btn">RESET</div></a> 

    </form>
                    </center>
           </div>


<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript"></script>              

    </header>
    <!-- ***** Header Area End ***** -->

    <!-- ***** Main Banner Area Start ***** -->
    <div class="main-banner" id="top">
         <img src="images/client.jpg" style="max-width: 100%;height:auto;">
     </div>

    <!-- ***** Main Banner Area End ***** -->
   
  

    <!-- jQuery -->
    <script src="assets/js/jquery-2.1.0.min.js"></script>

    <!-- Bootstrap -->
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugins -->
    <script src="js/scrollreveal.min.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/imgfix.min.js"></script> 
    <script src="js/mixitup.js"></script> 
    <script src="js/accordions.js"></script>
    
    <!-- Global Init -->
    <script src="js/custom.js"></script>

  </body>
</html>