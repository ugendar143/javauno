package login.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("user_name");
		String password=request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter pwriter=response.getWriter();
		pwriter.print("welcome :"+ username +"<br/>");
		pwriter.print("Here is ur password:"+ password);
		pwriter.close();
	}

}
