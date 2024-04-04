package Response.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletExample2")
public class ServletExample02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String colorOne=request.getParameter("color1");
		String colorTwo=request.getParameter("color2");
   
		response.setContentType("text/html");
         PrintWriter pw=response.getWriter();
   
   pw.print("<!DOCTYPE html>");
   pw.print("<html>");
   pw.print("<head>");
   pw.print("<style>h1{color:"+colorOne+"} p{color:"+colorTwo+"}</style>");
   pw.print("</head>");
   pw.print("<body>");
   
   pw.print("<h1>Heading</h1>");
   pw.print("<p>Paragraph</p>");
   
   pw.print("</body>");
   pw.print("</html>");
   pw.close();
   
	}
}
