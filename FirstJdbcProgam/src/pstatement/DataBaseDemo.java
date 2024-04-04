package pstatement;
import java.sql.*;
import java.util.Scanner;
public class DataBaseDemo {

	private static String insertData;

	public static <PStatements> void main(String[] args) {
		String insertData="INSERT INTO students"
				+ "(stu_name,stu_id,stu_group)"
				+ "VALUES(?,?,?)";
		try {Connection c =DriverManager.getConnection(DBkeys.URL,DBkeys.USERNAME,DBkeys.PASSWORD);
		PreparedStatement pstmt =c.prepareStatement(insertData);
	    Scanner scan =new Scanner (System.in);
	    System.out.println("\n enter name of student:");
	    String name =scan.next();
	    System.out.println("\n enter name of student:");
	    int id =scan.nextInt();
	    System.out.println("\n enter id of student:");
         String group =scan.next();
         System.out.println("\n enter group of students:");
         
         int noofRowsInserted=pstmt.executeUpdate();
         System.out.println("\n noofRows inserted="+noofRowsInserted);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
