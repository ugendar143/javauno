package JdbcfFrstConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class School {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","ugendar@143");
			 Statement s=c.createStatement();
//			 PreparedStatement p=c.prepareStatement("") 
			 String query="INSERT INTO students(studentname) VALUES('ugender')";
			int res= s.executeUpdate(query);
			System.out.println(res);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
