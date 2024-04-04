package ServletApi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Third")
public class ThirdServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respones) throws ServletException, IOException {
		System.out.println("Get Request is Handled ");
		
		respones.setContentType("text/html");
		
		PrintWriter pwrite=respones.getWriter();
		pwrite.print("<p style='color:Green'> This is a Respones from the server</p>");
        pwrite.close();
        }

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respones) throws ServletException, IOException {
		System.out.println("Post Request is Handled");
		 
		String color=request.getParameter("color");
		respones.setContentType("text/html");
		PrintWriter pwriter=respones.getWriter();
		pwriter.print("<p style='color:"+color+"'>This is a Respones from doPost() method</p>");
		pwriter.close();
		}
	
	
}
