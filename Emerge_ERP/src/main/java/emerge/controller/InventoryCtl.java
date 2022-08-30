package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.CustomerBean;
import emerge.bean.InventoryBean;
import emerge.model.CustomerModel;
import emerge.model.InventoryModel;

@WebServlet("/InventoryCtl")
public class InventoryCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		InventoryBean bean = new InventoryBean();

		bean.setProductCategory(request.getParameter("Product"));
		bean.setProductSubCategory(request.getParameter("SubProduct"));
		bean.setSpecification(request.getParameter("Specificaton"));
		bean.setWarranty(request.getParameter("Warranty"));
		bean.setBrand(request.getParameter("Brand"));
		bean.setPrice(Integer.parseInt(request.getParameter("Price")));
		bean.setQuantity(Integer.parseInt(request.getParameter("Quantity")));
		bean.setOrderValue(Integer.parseInt(request.getParameter("Order")));
		bean.setVendorName(request.getParameter("Vname"));
		bean.setVendorAddress(request.getParameter("Vaddress"));

		InventoryModel model = new InventoryModel();
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
