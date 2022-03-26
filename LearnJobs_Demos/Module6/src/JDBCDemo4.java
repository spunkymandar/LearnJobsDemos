import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;


public class JDBCDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//loading a driver i.e. type4 driver for mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded ");
			
			//connect to the sql instance and database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/learnjobs","root","mysql");
			System.out.println("Connected to database ");
			
			
			
			String query="select * from employee where empdept=?"; //? denotes that the value is going get changed dynamically at runtime 
			PreparedStatement pst= con.prepareStatement(query);
			//Statement st=con.createStatement();
			pst.setString(1, "sales");
			
			
			ResultSet rs=pst.executeQuery();
			//ResultSet rs=st.executeQuery("select * from employee where empdept='sales'");
			while(rs.next()) {
				System.out.println(rs.getString(2)+" "+rs.getString(3));
			}
			
			
			//working with ResultSetMetaData
			ResultSetMetaData rsmetadata=rs.getMetaData();
			System.out.println(rsmetadata.getColumnCount());
			System.out.println(rsmetadata.getColumnName(1));
			
			
			//Working with DatabaseMetaData
			DatabaseMetaData dbMetadata =con.getMetaData();
			System.out.println(dbMetadata.getDatabaseMajorVersion());
			System.out.println(dbMetadata.getDatabaseProductName());
			System.out.println(dbMetadata.getDriverMajorVersion());
			
			
			
			
			
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
