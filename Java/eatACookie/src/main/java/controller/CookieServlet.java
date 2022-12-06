package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie firstName = new Cookie("firstName", request.getParameter("firstName"));
		firstName.setMaxAge(100);
		response.addCookie(firstName);
		
		Cookie lastName = new Cookie("lastName", request.getParameter("lastName"));
		lastName.setMaxAge(100);
		response.addCookie(lastName);
		
		RequestDispatcher cookieDispatcher = request.getRequestDispatcher("showThemCookies.jsp");
		cookieDispatcher.forward(request, response);
	}

}