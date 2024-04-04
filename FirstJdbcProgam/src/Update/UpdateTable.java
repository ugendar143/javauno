package Update;

import java.sql.*;

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","ugendar@143");
			Statement stmt = c.createStatement();
			String Updatequery ="delete from students where student_id=5";
			int result =stmt.executeUpdate( Updatequery );
			System.out.println("result ="+result);
			
					
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}
