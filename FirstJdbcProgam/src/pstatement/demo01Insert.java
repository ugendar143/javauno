package pstatement;

import java.sql.*;

public class demo01Insert {

	public static void main(String[] args) {
		String insertData ="INSERT INTO students(stu_name, stu_id,stu_group) VALUES(?,?,?)";
		try {
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","ugendar@143");
			PreparedStatement pstmt=c.prepareStatement(insertData);
			pstmt.setString(1, "ugendar");
			pstmt.setInt(2, 101);
			pstmt.setString(3, "mpc");
			pstmt.executeUpdate();
			System.out.println("\n No of Rows Inserted");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n Insertion Failed");
		}

	}

}
