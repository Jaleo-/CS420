package edu.wm.cs420.NASA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloWorld extends HttpServlet{
	public HelloWorld() {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter pWriter =resp.getWriter();
		
		pWriter.println("<html>");
		pWriter.println("<body>");
		pWriter.println("<h2>Hello World!</h2>");
		pWriter.println("</body>");
		pWriter.println("</html>");
		Exception exception = new Exception();
		exception.printStackTrace(pWriter);
		//super.doGet(req, resp);
	}


}
