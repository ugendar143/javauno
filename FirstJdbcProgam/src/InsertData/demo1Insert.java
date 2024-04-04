package InsertData;

import java.sql.*;

public class demo1Insert {

	public static void main(String[] args) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/highschool","root","ugendar@143");
			Statement stmt =c.createStatement();
			String insertquery="SELECT *from student WHERE student_id=2 ";
			 ResultSet r=stmt.executeQuery(insertquery);
			while (r.next()){
				int i=r.getInt(1);
				String v=r.getString(2);
				System.out.println(i +" "+v);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("failed");
		}
		

	}

}
