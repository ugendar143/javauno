package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task2", "root", "ugendar@143");
	         String EmailId=request.getParameter("EmailId");
	         String UserName=request.getParameter("UserName");
	         String Password=request.getParameter("Password");
	         PreparedStatement ps= con.prepareStatement("INSERT INTO first(EmailId,UserName,Password) VALUE(?,?,?)");
	        
	         ps.setString(1, EmailId);
	         ps.setString(2, UserName);
	         ps.setString(3, Password);	         
	        int result=ps.executeUpdate();	
	        if (result>0) {
	        	response.setContentType("text/html");
	        	PrintWriter pw = response.getWriter();
	        	pw.print("EmailId");
	        	pw.print("UserName");
	        	pw.print("Password");
	        	response.sendRedirect("second.html");
	        	pw.close();
	        	ps.close();
	        }
			
		}
		catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("first.html");
			}
		}
	}

			
		
	


