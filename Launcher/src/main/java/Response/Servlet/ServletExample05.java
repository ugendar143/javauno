package Response.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletExample5")
public class ServletExample05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletExample05() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
  
           pw.print("<!DOCTYPE html>");
           pw.print("<html><head>");
           pw.print("<link rel='icon' href='images/cat4.jpeg' type='image/jpeg'/>");
           pw.print("</head><body>");
           pw.print("<img src ='images/cat4.jpeg'style='width:100px;height:100px'/>");
           pw.print("<a href='https://www.unocareer.com/'>Visit Course<a/>");
           pw.print("</body></html>");
           pw.close();
	}

}
