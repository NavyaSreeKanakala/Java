import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class DBconnection extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  {
     String uname=request.getParameter("t1");
	 String pwd=request.getParameter("t2");
	 String email=request.getParameter("t3");
	 long phno=Long.parseLong(request.getParameter("t4"));
	 String address=request.getParameter("t5");
	 
  
  
     try
	 {
	    PrintWriter out=response.getWriter();
	 
	    Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/servlet","root","root");
	
		PreparedStatement pstmt=con.prepareStatement("insert into register values(?,?,?,?,?)");
		pstmt.setString(1,uname);
		pstmt.setString(2,pwd);
		pstmt.setString(3,email);
		pstmt.setLong(4,phno);
		pstmt.setString(5,address);
		
		
		int i=pstmt.executeUpdate();
		if(i>0)
		{
			out.println("registration successfully");
			
		}
		
		Statement stmt=con.createStatement();
  
      ResultSet rs=stmt.executeQuery("select * from register");  
              
 
      ResultSetMetaData rsmd=rs.getMetaData();  
      int total=rsmd.getColumnCount();  
      out.print("<tr>");  
      for(int j=1;j<=total;j++)  
      {  
          out.print("<th>"+rsmd.getColumnName(j)+"</th>");  
      }  
  
     
  
       while(rs.next())  
       {  
         out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" ");  
                  
       }  
  
	
		
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  
  }

}