import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//loading a driver i.e. type4 driver for mySQL
			
			
			//connect to the sql instance and database
			Connection con=MyConnection.getConnection();
			System.out.println("Connected to database ");
			
			
			
			Statement st=con.createStatement();//statement object is used to fire the queries 
		
			String query="INSERT INTO employee VALUE (106, 'Ravi','sales')";//DML
			//st.executeUpdate("INSERT INTO employee VALUES(106,'Ravi','sales')");
			int insertCount=st.executeUpdate(query);
			System.out.println(insertCount +" record inserted successfully ");
			
			
			
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
