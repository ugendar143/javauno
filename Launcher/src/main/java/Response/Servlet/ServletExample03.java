package Response.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletExample3")
public class ServletExample03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String numberString= request.getParameter("number");
   String startNumberString= request.getParameter("start");
   String endNumberString= request.getParameter("end");
   
      int number =Integer.parseInt(numberString);
      int start =Integer.parseInt(startNumberString);
      int end  =Integer.parseInt(endNumberString);

      response.setContentType("text/html");
         PrintWriter pw=response.getWriter();
   
            pw.print("<!DOCTYPE html>");
            pw.print("<html>");
            pw.print("<head>");
            
            pw.print("</head>");
            pw.print("<body>");
            pw.print("<ul>");
            for(int i =start; i<=end;i++) {
            	 pw.print("<li>"+number+"*"+i+"="+(number*i)+"</li>");
            }
            pw.print("</ul>");
            pw.print("</body>");
            pw.print("</html>");
            pw.close();
	}

}
