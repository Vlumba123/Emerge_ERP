package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.CustomerBean;
import emerge.bean.EstnPackageBean;
import emerge.model.CustomerModel;
import emerge.model.EstnPackageModel;

@WebServlet("/EstnPackageCtl")
public class EstnPackageCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EstnPackageBean bean = new EstnPackageBean();

		bean.setConfiguration(request.getParameter("Config"));
		bean.setESTN(request.getParameter("estn"));
		bean.setESTN_P(request.getParameter("estn_p"));
		
		EstnPackageModel model = new EstnPackageModel();
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
