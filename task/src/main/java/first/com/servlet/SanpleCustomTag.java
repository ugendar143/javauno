package first.com.servlet;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SanpleCustomTag extends TagSupport {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 5217781919765410010L;
	public int doStartTag() throws JspException {  
	    JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
	    try{  
	     out.print(Calendar.getInstance().getTime());//printing date and time using JspWriter  
	    }catch(Exception e){System.out.println(e);}  
	    return SKIP_BODY;//will not evaluate the body content of the tag  
	}  
	}  

