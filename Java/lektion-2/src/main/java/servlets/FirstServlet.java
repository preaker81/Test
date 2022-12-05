package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String data = request.getParameter("data");
		out.print("<html><body>");
		out.print("<h1>Hello Servlet</h1>");
		out.print("</body></html>");
		out.print("<h3>" + data + "</h3>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bodyData = request.getReader().lines().collect(Collectors.joining());
		PrintWriter out = response.getWriter();
		User user = new User(bodyData);
		out.print(bodyData);
		out.close();
	}

}
