package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.CustomerBean;
import emerge.bean.UserBean;
import emerge.model.CustomerModel;
import emerge.model.UserModel;

@WebServlet("/UserCtl")
public class UserCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		UserBean bean = new UserBean();

		bean.setUserId(Integer.parseInt(request.getParameter("UserId")));
		bean.setFirstName(request.getParameter("Fname"));
		bean.setLastName(request.getParameter("Lname"));
		bean.setEmail(request.getParameter("Email"));
		bean.setPassword(request.getParameter("Password"));
		bean.setRoleId(Integer.parseInt(request.getParameter("RoleId")));
		

		UserModel model = new UserModel();
		try {
			model.add(bean);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("success");
			out.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

		
	}


