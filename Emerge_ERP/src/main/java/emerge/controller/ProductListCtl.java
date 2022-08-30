package emerge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.ProductBean;
import emerge.model.ProductModel;

@WebServlet("/ProductListCtl")
public class ProductListCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductModel model = new ProductModel();

		try {
			List<ProductBean> list = model.search();
			RequestDispatcher rd = req.getRequestDispatcher("ProductListView.jsp");
			req.setAttribute("list", list);
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
