package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task2", "root", "ugendar@143");
	         String EmailId=request.getParameter("emailId");
	         String UserName=request.getParameter("username");
	         String Password=request.getParameter("password");
	         
	         PreparedStatement ps= con.prepareStatement("SELECT * FROM first WHERE EmailId=? AND Password=?");
	         ps.setString(1, UserName );
	         ps.setString(2, Password);
	       //  ps.setString(3, EmailId);        
	       ResultSet r=ps.executeQuery();	
	       if(r.next()) {
	    	  if(r.getString("UserName").equals(UserName) && r.getString("Password").equals(Password)) {
	    	   LoginModel lg= new LoginModel ();
	    	  // lg.setEmailId(r.getString("EmailId"));
	    	   lg.setUserName(r.getString("UserName"));
	    	   lg.setPassword(r.getString("Password"));
	    	   request.setAttribute("login", lg);
	    	   RequestDispatcher rd= 
	    	   request.getRequestDispatcher("Home.jsp");
	    	   rd.forward(request, response);
	    	  //response.sendRedirect("Home.jsp");
	    	  }else {
	    		  response.sendRedirect("second.html");
	    	  }
	    	   
	    	  }
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
			}
		}
	

	}


