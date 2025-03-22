package javajdbcproject;

import java.sql.Connection;
import java.sql.SQLException;

public class Javajdbcclass {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3303/java";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver successfully Loaded.....");
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Done....");
			//
			
			con.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("Wrong data");
		}
	}
}


