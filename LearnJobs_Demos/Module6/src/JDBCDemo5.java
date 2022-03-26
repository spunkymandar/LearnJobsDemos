import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

//import com.mysql.cj.jdbc.CallableStatement;

public class JDBCDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//loading a driver i.e. type4 driver for mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded ");
			
			//connect to the sql instance and database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/learnjobs","root","mysql");
			System.out.println("Connected to database ");
			
			String procSQL="call retrive_sales_emp()";//calls the stored procedure created in database
			
			CallableStatement cst= con.prepareCall(procSQL);
			
			ResultSet rs=cst.executeQuery();
			
			//ResultSet rs=st.executeQuery("select * from employee where empdept='sales'");
			while(rs.next()) {
				System.out.println(rs.getString(2)+" "+rs.getString(3));
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
