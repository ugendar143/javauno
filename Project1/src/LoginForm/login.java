package LoginForm;

import java.sql.*; 
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username:");
			String username=sc.nextLine();
			 
			System.out.println("Password:");
			int password=sc.nextInt();
			
			Regeristation r=new Regeristation() ;
			 if (r.equals(username)&&(r.equals(password))) {
			  
		         	String insertData="INSERT INTO details (username,pasword)VALUES(?,?)";
	        		Connection c=(DriverManager.getConnection("jdbc:mysql://localhost:3306/login ","root","ugendar@143"));
   		        	PreparedStatement pstmt=c.prepareStatement(insertData);
	         		pstmt.setString(1,username);
               			pstmt.setInt(2, password);
	            		 System.out.println("|-------------------------------------------|");
	               		 System.out.println("|                                           |");
		             	 System.out.println("|                                           |");
			             System.out.println("|                 LOGIN FORM                |");
		            	 System.out.println("|                                           |");
			             System.out.println("|                                           |");
              			 System.out.println("|   username:"+username+                    "");
			             System.out.println("|   password: "+password+                   "");
            			 System.out.println("|                                           |");
			             System.out.println("|                                           |"); 
	             		 System.out.println("|                                           |");
			            System.out.println("|-------------------------------------------|");
			 }else {
			     	  System.out.println("regeristation failed");
				      System.out.println("Enter into Regeristation Form");
				  
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter EmailAdress:");
						String  EmailAdress=sc1.nextLine();
						
						System.out.println("Enter Firstname:");
						String Firstname=sc1.nextLine();
						
						System.out.println("Eneter username:");
						String Username=sc1.nextLine();
						
						System.out.println("Enter password:");
						int Password=sc1.nextInt(); 
						
						
						String strl="SELECT* FROM regeristation(EmailAdress,Firstname,username,password)+VALUES(?,?,?,?)";
						try {
							Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/regeristation","root","ugendar@143");
							PreparedStatement pstmt=con.prepareStatement(strl);
							pstmt.setString(1,EmailAdress);
							pstmt.setString(2, Firstname);
							pstmt.setString(3,Username);
							pstmt.setInt(4, Password);
							System.out.println("|===============================================|");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|                REGERISTATION FORM             |");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|   EmailAdress:"+EmailAdress                 +"|");
							System.out.println("|   Firstname:"+Firstname                     +"|");
							System.out.println("|   Username:"+Username                       +"|");
							System.out.println("|   Password:"+Password                       +"|");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|                                               |");
							System.out.println("|===============================================|");
                            
							
							       if (username.contentEquals(Username)&&password==Password) {
								            System.out.println("LOGIN SUCCESSFULL");
				       			 }
				                       System.out.println(" REGERISTATED SUCCESSFULL ");
				                       sc1.close();    
					
					         } catch (Exception e) {
						    e.printStackTrace();
					     }
						sc.close();
			      }
			         }catch (Exception e) {
					
				}
		
			 
	}

}
