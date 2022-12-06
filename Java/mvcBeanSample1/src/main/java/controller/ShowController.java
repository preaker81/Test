package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ImageBean;

@WebServlet("/showController")
public class ShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String whatToShow = request.getParameter("show");

		ImageBean imageBean = new ImageBean();
		imageBean.setWhatToShow(whatToShow);

		request.setAttribute("ImageBean", imageBean);
		
		Cookie ck = new Cookie("schoolName", "GritAcademy");
		ck.setMaxAge(100);
		response.addCookie(ck);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/showThemCookies.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}