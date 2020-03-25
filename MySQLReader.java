package schooldatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLReader implements FileManager {
	
	public ArrayList<Account> read(String dataFileLocation) {
		
		String DB_URL = dataFileLocation;
		// Database credentials
		String USER = "root";
		String PASS = "toor";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Account> accts = new ArrayList<>();
		
		try {
			
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql = "SELECT name, major, id, gpa FROM schooldb";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String major = rs.getString("owner");
				int id = rs.getInt("id");
				int gpa = rs.getInt("gpa");
				
				accts.add(new Student(name, major, id, gpa));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL exception!");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unknown exception!");
			
		} finally {

			try {
				if (stmt != null) { stmt.close(); }
				} catch (SQLException e) {}
			try {
				if (conn != null) { conn.close(); }
				} catch (SQLException e) {}
			try {
				if (rs != null) { rs.close(); }
				} catch (SQLException e) {}
		}
		
		return accts;
	}
	
public void fileType() {
		
		System.out.println("Taking input from MySQL server.");
		
	}
	
}
