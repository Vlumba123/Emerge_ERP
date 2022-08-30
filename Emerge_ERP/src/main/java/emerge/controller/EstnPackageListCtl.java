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
import emerge.bean.EstnPackageBean;
import emerge.model.CustomerModel;
import emerge.model.EstnPackageModel;

@WebServlet("/EstnPackageListCtl")
public class EstnPackageListCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		

		EstnPackageModel model = new EstnPackageModel();

		try {
			List<EstnPackageBean> list = model.search();
			RequestDispatcher rd = request.getRequestDispatcher("ESTN_P_ListView.jsp");
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
