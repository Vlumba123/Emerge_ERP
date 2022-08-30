package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.OrderBean;
import emerge.bean.ProductBean;
import emerge.model.OrderModel;
import emerge.model.ProductModel;

@WebServlet("/ProductCtl")
public class ProductCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductBean bean = new ProductBean();

		bean.setCategory(request.getParameter("Category"));
		bean.setBrand(request.getParameter("Brand"));
		bean.setConfiguration(request.getParameter("Configuration"));
		bean.setESTN(request.getParameter("Estn"));

		ProductModel model = new ProductModel();
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
