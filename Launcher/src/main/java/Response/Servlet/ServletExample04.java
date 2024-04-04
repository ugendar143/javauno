 package Response.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletExample4")
public class ServletExample04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
  
           pw.print("<!DOCTYPE html>");
           pw.print("<html>");
           pw.print("<head>");
           pw.print("<style>table, th,td {border:1px solid black}table{border-collapse:collapse} th,td{padding:5px }</style>");
           pw.print("</head>");
           pw.print("<body>");
           pw.print("<table>");
           pw.print("<tr>");
           pw.print("<th>S.No.</th>");
           pw.print("<th>Train No.</th>");
           pw.print("<th>Train Name.</th>");
           pw.print("<th>Departure Time</th>");
           pw.print("<th>Arrival Time</th>");
           pw.print("</tr>");
           List<Train>listOfTrains=getTrainsList();
           for (int i=0; i <listOfTrains.size(); i++) {
        	   Train train=listOfTrains.get(i);
        	   pw.print("<tr>");
               pw.print("<td>"+(i+1)+"</td>");
               pw.print("<td>"+train.getTrainId()+"</td>");
               pw.print("<td>"+train.getTrainName()+"</td>");
               pw.print("<td>"+train.getDeparture()+"</td>");
               pw.print("<td>"+train.getArrival()+"</td>");
               pw.print("</tr>");
           }
           pw.print("</table>");
           pw.print("</body>");
           pw.print("</html>");
           pw.close();
	}
     private  List<Train> getTrainsList(){
    	
    	List<Train> trainsList =new ArrayList<Train>();
        trainsList.add(new Train(11025,"Venkatarady Express","5:30","12:30"));
        trainsList.add(new Train(11024,"Rajandra Express","17:30","8:30"));
        trainsList.add(new Train(11023,"Sathish Express","8:30","12:30"));
        trainsList.add(new Train(11022,"Hyderbad Express","16:30","22:30"));
      
        return trainsList;
    }
	
}
