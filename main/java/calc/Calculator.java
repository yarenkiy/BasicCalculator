package calc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out=response.getWriter();
			out.println("<center>");
			int a=Integer.parseInt(request.getParameter("n1"));
			int b = Integer.parseInt(request.getParameter("n2"));
			int c=0;
			String oper = request.getParameter("btn");
			if(oper.equals("+"))
				c=a+b;
			if(oper.equals("-"))
				c=a-b;
			if(oper.equals("*"))
				c=a*b;
			if(oper.equals("/"))
				c=a/b;
					out.println("<h3>"+a+oper+b+"="+c+"</h3>");
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
