

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	   // SQL query
	   private static final String SELECT_STUDENT_QUERY = 
	         "SELECT SNAME, SADD, AVG FROM STUDENT WHERE SNO = ?";
	   
	   @Override
	   public void doGet(HttpServletRequest req, HttpServletResponse res) 
	         throws ServletException, IOException {
	      
	      // variables
	     
	      int sno = 0;
	      Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      boolean flag = false;
	      
	      // set content type
	      res.setContentType("text/html");
	     
	      // get form data
	      sno = Integer.parseInt(req.getParameter("sid"));
	      
	      try {
	         // register JDBC driver
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         // create JDBC connection
	         con = DriverManager.getConnection(
	         	"jdbc:mysql://localhost/learnjobs","root","root123");
	         
	         // compile SQL query and store it in
	         ps = con.prepareStatement(SELECT_STUDENT_QUERY);
	         
	            // set input value to query parameter
	         ps.setInt(1, sno);
	         
	         // execute the query
	         rs = ps.executeQuery();

	         // process the result
	         if (rs != null) {
	            while(rs.next()) {
	               // display result
	               flag = true;
	               res.getWriter().append("<h1>Student Details, </h1>"
	                     + "Name: " + rs.getString("SNAME") + "<br>"
	                     + "Address: " + rs.getString("SADD") + "<br>"
	                     + "Average: " + rs.getDouble("AVG") + "<br>");
	            }
	         }
	         
	         // Student not found
	         if(!flag) {
	            res.getWriter().append("<h1>Student Not Found.</h1>");
	         }

	      } catch (Exception e) {
	    	  
	         // Link to home
	         res.getWriter().append("<h3><a href='index.html'>Home</a></h3>");
	         
	      }
	   }
}
