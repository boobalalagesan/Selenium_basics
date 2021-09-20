package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/database");
		Statement statement= connection.createStatement();
		
		ResultSet result = statement.executeQuery("SELECT * FROM tbl_login");
		
		while(result.next()) {
			System.out.println("id :"+result.getString(1)+" Username :"+result.getString(2)+" PassWord :"+result.getString(3));
		}
	}

}
