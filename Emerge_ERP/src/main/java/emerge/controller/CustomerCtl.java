package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.CustomerBean;
import emerge.bean.OrderBean;
import emerge.model.CustomerModel;
import emerge.model.OrderModel;

@WebServlet("/CustomerCtl")
public class CustomerCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.sendRedirect("CustomerAddView.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CustomerBean bean = new CustomerBean();

		bean.setCustomer_Id(Integer.parseInt(request.getParameter("CustomerId")));
		bean.setCustomerName(request.getParameter("Cname"));
		bean.setMobile(request.getParameter("Cmobile"));
		bean.setAddress(request.getParameter("Caddress"));
		bean.setESTN_P(request.getParameter("Cestn_p"));

		CustomerModel model = new CustomerModel();
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
