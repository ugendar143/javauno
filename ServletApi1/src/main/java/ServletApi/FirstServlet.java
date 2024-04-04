package ServletApi;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet {
     ServletConfig servletConfig;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig=config;
		System.out.println("Servlet get Installed");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("ServletConfig is calleds");
		return servletConfig;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Request is being processed");
		System.out.println("\n Servlet Config: "+ getServletConfig().getServletName());
	    System.out.println("\n Servlet Info:"+getServletInfo() );
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo is called");
		return "This servlet is created to see how it works when it request comes";
	}

	@Override
	public void destroy() {
		System.out.println("Destory is called");
		
	}

}
