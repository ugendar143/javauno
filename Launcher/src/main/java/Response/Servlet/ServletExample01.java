package Response.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletExample1")
public class ServletExample01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.getContentType();
		PrintWriter pw = response.getWriter();
		response.setHeader("response1", "Plain text");
		pw.print("\n web page = First Servlet Program");
		System.out.println("\n"+response.getHeaderNames());
		System.out.println("\n First Servlet Program");
		pw.close();
	}

}
