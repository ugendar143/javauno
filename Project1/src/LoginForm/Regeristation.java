package LoginForm;

import java.sql.*;
import java.util.Scanner;

public class Regeristation {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter EmailAdress:");
			String  EmailAdress=sc.nextLine();
			
			System.out.println("Enter Firstname:");
			String Firstname=sc.nextLine();
			
			System.out.println("Eneter username:");
			String username=sc.nextLine();
			
			System.out.println("Enter password:");
			int password=sc.nextInt(); 
			
			sc.close();
			String strl="SELECT* FROM regeristation(EmailAdress,Firstname,username,password)+VALUES(?,?,?,?)";
			try {
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/regeristation","root","ugendar@143");
				PreparedStatement pstmt=con.prepareStatement(strl);
				pstmt.setString(1,EmailAdress);
				pstmt.setString(2, Firstname);
				pstmt.setString(3,username);
				pstmt.setInt(4, password);
				System.out.println("|===============================================|");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|                REGERISTATION FORM             |");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|   EmailAdress:"+EmailAdress                 +"|");
				System.out.println("|   Firstname:"+Firstname                     +"|");
				System.out.println("|   username:"+username                       +"|");
				System.out.println("|   password:"+password                       +"|");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|                                               |");
				System.out.println("|===============================================|");

	           System.out.println(" REGERISTATED SUCCESSFULL ");
			} catch (Exception e) {
				
			}
		} catch (Exception e) {
			
		}
		
	}

}
