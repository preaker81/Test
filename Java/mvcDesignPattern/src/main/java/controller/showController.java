package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ImageHandler;

@WebServlet("/showController")
public class showController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public showController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String whatToShow = request.getParameter("show");
		String imageFileName = ImageHandler.getFileName(whatToShow);

		String redirectUrl = "views/showImage.jsp?image=" + imageFileName;
		response.sendRedirect(redirectUrl);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
