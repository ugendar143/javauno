package HomeProducts;

import java.sql.*;

public class Update {

	public static void main(String[] args) {
		String UpdateQuery="delete from products where fruits=Bananna";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","ugendar@143");
			Statement stmt =c.createStatement();
			 ResultSet r=stmt.executeQuery(UpdateQuery);
			 System.out.println("r="+r);
			
		} catch (Exception e) {
			
		}

	}

}
