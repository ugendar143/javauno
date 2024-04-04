
package HomeProducts;

import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/products ","root","ugendar@143");
				Statement stmt =c.createStatement();
				String uodatequery1="INSERT INTO products (Vegetables,fruits,totalAmount)VALUE('Tamoto','Bananna',100) ";
				 stmt.executeUpdate(uodatequery1);
				 System.out.println("r=");
				 String  insertquery2="INSERT INTO products(vegetables,fruits,totalAmount)VALUE('Potato','Grapees',200)";
				 stmt.executeQuery(insertquery2);
				 System.out.println("r1=");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Insert successfuly");
		}

	}

}
