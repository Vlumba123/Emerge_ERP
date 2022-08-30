package emerge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.CustomerBean;
import emerge.bean.InventoryBean;
import emerge.model.CustomerModel;
import emerge.model.InventoryModel;

@WebServlet("/InvetoryListCtl")
public class InvetoryListCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		InventoryModel model = new InventoryModel();

		try {
			List<InventoryBean> list = model.search();
			RequestDispatcher rd = request.getRequestDispatcher("InventoryListView.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
