package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Bean;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("isLoggedIn") != null) {
			RequestDispatcher rd = request.getRequestDispatcher("views/loggedIn.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("../index.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Bean user = new Bean();
		user.setUsername(username);
		user.setPassword(password);

		if (user.validate()) {
			HttpSession httpSession = request.getSession();
			httpSession.setMaxInactiveInterval(60 * 20);
			httpSession.setAttribute("isLoggedIn", user);

			request.setAttribute("username", user);

			RequestDispatcher rd = request.getRequestDispatcher("views/loggedIn.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/views/failedLoggin.jsp");
			rd.forward(request, response);
		}

	}
}
