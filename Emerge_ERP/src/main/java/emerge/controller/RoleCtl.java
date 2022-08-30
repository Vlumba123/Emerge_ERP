package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.MyEmergePcBean;
import emerge.bean.RoleBean;
import emerge.model.MyEmergePcModel;
import emerge.model.RoleModel;

@WebServlet("/RoleCtl")
public class RoleCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RoleBean bean = new RoleBean();

		bean.setRole_Id(Integer.parseInt(request.getParameter("RoleId")));
		bean.setRoleName(request.getParameter("Rname"));

		RoleModel model = new RoleModel();
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
