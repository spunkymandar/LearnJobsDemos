import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {

	public static void main(String[] args) {
		try {
			//loading a driver i.e. type4 driver for mySQL
			
			
			//connect to the sql instance and database
			Connection con=MyConnection.getConnection();
			System.out.println("Connected to database ");
			
			Statement st=con.createStatement();//statement object is used to fire the queries 
			String createTableQuery="CREATE TABLE user(userid VARCHAR(20), password VARCHAR(20))";
			//st.execute("CREATE TABLE user(userid VARCHAR(20), password VARCHAR(20))");
			st.execute(createTableQuery);
			System.out.println("table created ");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not configured!! ");
			//e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
