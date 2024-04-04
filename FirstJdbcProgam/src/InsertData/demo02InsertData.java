package InsertData;

import java.sql.*;

public class demo02InsertData {

	public static void main(String[] args) {
		final String URL =" com.mysql.cj.jdbc";
		final String USERNAME ="root";
		final String PASSWORD="ugendar@143";
		try(
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/primaryschool","root","ugendar@143");
			Statement s = con.createStatement();
				) {
			String insertDataQuery1="INSERT INTO students(student_name,student_id,student_fee) VALUES('ugendar',101,10000)";
			int Result1 =s.executeUpdate(insertDataQuery1);
			System.out.println("Result="+Result1);
			String insertDataQuery2="INSERT INTO students(student_name,student_id,student_fee) VALUES('ramu',102,20000)";
			Result1 =s.executeUpdate(insertDataQuery2);
			System.out.println("Result="+Result1);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
