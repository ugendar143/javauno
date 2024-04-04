package pstatement;

import java.sql.*;
import java.util.Scanner;

public class demo02Update {

	public static void main(String[] args) {
		String updateQuert="UPDATE students "
				+ "SET stu_name=?"
				+ "stu_id=?"
				+ "WHERE stu_group=?";
		try {
			Connection c =DriverManager.getConnection(DBkeys.URL,DBkeys.USERNAME, DBkeys.PASSWORD);
		    PreparedStatement pstmt=c.prepareStatement(updateQuert);
		    Scanner scan=new Scanner(System.in);
		    System.out.println("\n Enter the new stu_name:");
		    String stu_nameString=scan.next();
		    System.out.println("\n Enter the new stu_id:");
		    int stu_id =scan.nextInt();
		    System.out.println("\n Enter the new stu_group:");
		    pstmt.setString(1, "ugendar");
		    pstmt.setInt(2, 103);
		    pstmt.setString(3,"BIPc");
		    int result =pstmt.executeUpdate();
		    System.out.println("\n Result="+result);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\n updation failed");
		}

	}

}
