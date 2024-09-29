package JDBC_Hands_On;
import java.sql.*;

public class DB_Utility {
	
	private static Connection cn;
	
	static {
		
		
			try {
				Class.forName("org.postgresql.Driver");
				System.out.println("Driver loaded successfully..");
				cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin123");
				System.out.println("Connection established successfully..");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		
	}
	
	public static Connection getCn() {
		
		return cn;
	}
	
	

}
