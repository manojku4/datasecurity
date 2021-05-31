<!DOCTYPE html>
<%@page import="java.sql.*;"%>
<%@page import="Network.DbConnection;"%>
<html lang="en">
<head>
    
     <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

    <title>Client Data</title>
    
    <!-- Additional CSS Files -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.css">
    <link rel="stylesheet" href="css/style.css">
    <%@page import="java.sql.*;"%>
    <style>
        
 .banner{
    position: relative;
    width:100%;
    margin: auto;  
    background: rgba(250,250,250,0.6);
}
.banner table{ position: fixed;top:35%;left:23%;background: rgba(250,250,250,0.6);}
.banner h1{background: rgba(250,250,250,0.6);text-align:center;position:fixed;top:25%;left:25%; }

  .other-button a {
  display: inline-block;
  font-size: 13px;
  padding: 12px 20px;
  background-color: #3366ff;
  color: #fff;
  text-align: center;
  font-weight: 400;
  text-transform: uppercase;
  transition: all .3s;
  border-radius: 8%;
}

.other-button a:hover {
  background-color: #00bfff;
}

    </style>
</head>
<body style="overflow: hidden;" >
    
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
                        <a href="audihome.jsp" class="logo"> SECURE <em> DATA </em></a>
                        <!-- ***** Logo End ***** -->
                        <!-- ***** Menu Start ***** -->
                        <ul class="nav">
                        <li><a href="audihome.jsp" >Auditor Home</a></li>
                        <li><a href="audidata.jsp"  >CLIENTS</a></li>
                        <li><a href="audirequest.jsp" class="active">Client request</a></li>
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
    
<%
    try
    {
        
        Connection con=DbConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from request where status='No';");
           %>
    <h1 style="text-align: center;"> CLIENT FILE ACCESS REQUEST DETAILS </h1>
     
    <table border=1 align=center style="text-align:center">
         
      <thead>
          <tr>
              <th>CLIENT ID</th>
             <th>NAME</th>
             <th>EMAIL</th>
             <th>STATE</th>
            <th>COUNTRY</th>
            <th>FILE NAME</th>
            <th>ALGORITHM</th>
            <th>SECRET KEY</th>
            
          </tr>
      </thead>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("id") %></td>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("mail") %></td>
                <td><%=rs.getString("state") %></td>
                <td><%=rs.getString("country") %></td>
                <td><%=rs.getString("fname") %></td>
                <td><%=rs.getString("algo") %></td>
                <td class="other-button" ><a href="send_key.jsp?id=<%=rs.getString("id") %>">SEND</a></td>
            </tr>
            <%}%>
           
        </table>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    finally{
        //st.close();
        //con.close();
    }
    %>
 </div>  

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript"></script>    

    </header>
    <!-- ***** Header Area End ***** -->
    
    <!-- ***** Main Banner Area Start ***** -->
    <div class="main-banner" id="top">
         <img src="images/audi.jpg" style="max-width: 100%;height:auto;">
     
    </div>
    <!-- ***** Main Banner Area End ***** -->
   <!-- jQuery -->
    <script src="js/jquery-2.1.0.min.js"></script>

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
