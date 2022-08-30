package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.CustomerBean;
import emerge.bean.MyEmergePcBean;
import emerge.model.CustomerModel;
import emerge.model.MyEmergePcModel;

@WebServlet("/MyEmergePcCtl")
public class MyEmergePcCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MyEmergePcBean bean = new MyEmergePcBean();

		bean.setCustomerId(Integer.parseInt(request.getParameter("CustomerId")));
		bean.setCustomerName(request.getParameter("Cname"));
		bean.setESTN_P(request.getParameter("estnp"));
		bean.setESTN(request.getParameter("estn"));

		MyEmergePcModel model = new MyEmergePcModel();
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
