package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/imageServlet")
public class imageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public imageServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String width = request.getParameter("width");
	String height = request.getParameter("height");
		
out.print("	<div>\r\n"
		+ "		<form action=\"imageServlet\" method=\"GET\">\r\n"
		+ "			<input type=\"text\" name=\"width\" placeholder=\"Width\" /> \r\n"
		+ "			<input type=\"text\" name=\"height\" placeholder=\"Height\" />\r\n"
		+ "			<input type=\"submit\" name=\"submit\"/>\r\n"
		+ "		</form>\r\n"
		+ "	</div>");
		
		out.print("<img src=\"./images/img1.jpg\" style=\"width: " + width + " px; height: " + height + "px;\">");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
