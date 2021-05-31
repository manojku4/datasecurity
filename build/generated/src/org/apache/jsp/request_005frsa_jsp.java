package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import Network.DbConnection;
import pack.Download_rsa;

public final class request_005frsa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>RSA Request</title>\n");
      out.write("    \n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("\n");
      out.write(".banner { \n");
      out.write("    position:fixed;\n");
      out.write("    top:25%;\n");
      out.write("    left:25%;\n");
      out.write("    background: rgba(250,250,250,0.6); \n");
      out.write("    width: 700px; \n");
      out.write("    height: 400px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".banner a{color: #0077b5;}\n");
      out.write(".banner a:hover{color: #66c9ff;}\n");
      out.write("    </style>\n");
      out.write("       \n");
      out.write("      </head>\n");
      out.write("    \n");
      out.write("    <body style=\"overflow:hidden;\">\n");
      out.write("    \n");
      out.write("        <!-- ***** Preloader Start ***** -->\n");
      out.write("    <div id=\"js-preloader\" class=\"js-preloader\">\n");
      out.write("      <div class=\"preloader-inner\">\n");
      out.write("        <span class=\"dot\"></span>\n");
      out.write("        <div class=\"dots\">\n");
      out.write("          <span></span>\n");
      out.write("          <span></span>\n");
      out.write("          <span></span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ***** Preloader End ***** -->\n");
      out.write("    \n");
      out.write("    <!-- ***** Header Area Start ***** -->\n");
      out.write("    <header class=\"header-area header-sticky\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <nav class=\"main-nav\">\n");
      out.write("                        <!-- ***** Logo Start ***** -->\n");
      out.write("                        <a href=\"clienthome.jsp\" class=\"logo\"> SECURE <em> DATA </em></a>\n");
      out.write("                        <!-- ***** Logo End ***** -->\n");
      out.write("                        <!-- ***** Menu Start ***** -->\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                        <li class=\"main-button\"><a href=\"file_download.jsp\"> << BACK</a></li> \n");
      out.write("                        </ul>                                            \n");
      out.write("                        <a class='menu-trigger'>\n");
      out.write("                            <span>Menu</span>\n");
      out.write("                        </a>\n");
      out.write("                        <!-- ***** Menu End ***** -->\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write(" \n");
      out.write("        ");

                        String search = session.getAttribute("ssidsecretkey").toString();
                        System.out.println("get the search"+search);
                        session.setAttribute("search", search);
         
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"banner\">\n");
      out.write("            \n");
      out.write("                    <center><h2>User Details</h2></center><br />\n");
      out.write("                    <table border=\"2\" style=\"text-align: center;margin-left: 70px\">\n");
      out.write("                            <tr><th style=\"text-align: center;width: 70px;\">File ID</th>\n");
      out.write("                                <th style=\"text-align: center;width: 120px;\">Client Name</th>\n");
      out.write("                                <th style=\"text-align: center;width: 120px;\">File Name</th>\n");
      out.write("                                <th style=\"text-align: center;width: 120px;\">Date</th>\n");
      out.write("                                <th style=\"text-align: center;width: 100px;\">View</th>\n");
      out.write("                                <th style=\"text-align: center;\">Download</th>\n");
      out.write("                            </tr>    \n");
      out.write("                            ");
 
                                int fid=0;
                                Connection con = null;
                                Statement st = null;
                                ResultSet rs = null;
                                try {
                                    con = DbConnection.getConnection();
                                    st = con.createStatement();
                                    rs = st.executeQuery("select * from uploads where secretkey LIKE '%" + search + "%'");
                                    if (rs.next()) {
                                   
                            
      out.write("\n");
      out.write("                                <td>");
      out.print(rs.getString("fileid"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("cname"));
      out.write("</td>     \n");
      out.write("                                <td>");
      out.print(rs.getString("filename"));
      out.write("</td>     \n");
      out.write("                                <td>");
      out.print(rs.getString("date"));
      out.write("</td>     \n");
      out.write("                                <td> <a href=\"viewdata_rsa.jsp?id=");
      out.print(rs.getString("fileid"));
      out.write("\"><font style=\"color: green\">view</a></font> </td>  \n");
      out.write("                                <td> <a href=\"Download_rsa?id=");
      out.print(rs.getString("fileid"));
      out.write("\"><font style=\"color: green\">Download</a></font> </td>   \n");
      out.write("                                <tr />\n");
      out.write("                                                                                                                                         \n");
      out.write("                                        ");
 } 
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                
      out.write("\n");
      out.write("                        \n");
      out.write("                 </table>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\" type=\"text/javascript\"></script>              \n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("                                                                                                                                         \n");
      out.write("    <!-- ***** Header Area End ***** -->\n");
      out.write("\n");
      out.write("    <!-- ***** Main Banner Area Start ***** -->\n");
      out.write("    <div class=\"main-banner\" id=\"top\">\n");
      out.write("         <img src=\"images/client.jpg\" style=\"max-width: 100%;height:auto;\">\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("    <!-- ***** Main Banner Area End ***** -->\n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"assets/js/jquery-2.1.0.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"js/popper.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugins -->\n");
      out.write("    <script src=\"js/scrollreveal.min.js\"></script>\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"js/imgfix.min.js\"></script> \n");
      out.write("    <script src=\"js/mixitup.js\"></script> \n");
      out.write("    <script src=\"js/accordions.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Global Init -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
