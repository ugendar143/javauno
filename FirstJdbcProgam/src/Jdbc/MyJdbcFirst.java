package Jdbc;

import java.sql.*;

public class MyJdbcFirst {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection d =DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","ugendar@143" );
			Statement s=d.createStatement();
			String query="UPDATE INTO students(studentname)VALUES ('Rajesh')";
			int result=s.executeUpdate(query);
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
