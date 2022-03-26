import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded ");
		
		//connect to the sql instance and database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/learnjobs","root","root123");
		return con;
		
	}
	
	

}
