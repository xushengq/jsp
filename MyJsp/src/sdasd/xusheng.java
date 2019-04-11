package sdasd;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

/**
 * Servlet implementation class xusheng
 */

public class xusheng extends HttpServlet {
	
   
	public void init(ServletConfig config) throws ServletException {
		System.out.println("执行了");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*PageContext a=new PageContext();
		HttpSession session=se.getSession();*/
		JspFactory factory = JspFactory.getDefaultFactory();
		PageContext a = factory.getPageContext(null, null, null, null, false, 0, false);
		HttpSession session=a.getSession();
		HttpSession a1= request.getSession();
		ServletContext d=request.getServletContext();
	   HttpSession session2 = request.getSession();
	  ServletContext applicate = session2.getServletContext();

	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
