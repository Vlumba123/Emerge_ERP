package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emerge.bean.LoginBean;
import emerge.bean.UserBean;
import emerge.model.LoginModel;

@WebServlet("/LoginCtl")

public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String u = request.getParameter("Id");
		String p = request.getParameter("pwd");

		PrintWriter out = response.getWriter();

		UserBean bean = new UserBean();
		UserBean bean1;

		bean.setEmail(u);

		bean.setPassword(p);

		LoginModel ms = new LoginModel();
		try {
			bean1 = ms.Authenticate(bean);

			if (bean1 == null) {
				RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
				request.setAttribute("error", "Invalid Id and password");
				rd.forward(request, response);

			} else {
				HttpSession session = request.getSession(true);
				session.setAttribute("name", bean1);
				response.sendRedirect("WelcomeCtl");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
