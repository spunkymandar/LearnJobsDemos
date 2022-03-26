import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. Load the driver that you are going to use
 * 		Class.forName("");
 * 2. Create Connection interface reference 
 * 		Connection con=DriverManager.getConnection("url","username","password")
 */


public class JDBCDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//loading a driver i.e. type4 driver for mySQL
			
			
			//connect to the sql instance and database
			Connection con=MyConnection.getConnection();
			System.out.println("Connected to database ");
			
			Statement st=con.createStatement();//statement object is used to fire the queries 
			ResultSet rs=st.executeQuery("select * from employee where empdept='sales'");
			while(rs.next()) {
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			}
			
			
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
