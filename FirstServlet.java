 
import java.io.*;  
  
import javax.servlet.*;   
import javax.servlet.http.*;  
   
  
  
public class FirstServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
        PrintWriter out = response.getWriter(); 


       String u=request.getParameter("usr");
       String p=request.getParameter("pwd");
     

      if(u.equals("navya") && p.equals("1234"))
     {

       out.println("<body>homepage</body>");
     }
     else
     { 
        out.println("<body>Invalid username and password</body>");
     }
     
    }  
}  