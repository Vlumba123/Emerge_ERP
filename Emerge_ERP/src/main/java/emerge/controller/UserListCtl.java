package emerge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.RoleBean;
import emerge.bean.UserBean;
import emerge.model.RoleModel;
import emerge.model.UserModel;

@WebServlet("/UserListCtl")
public class UserListCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
    

		UserModel model = new UserModel();

		try {
			List<UserBean> list = model.search();
			RequestDispatcher rd = request.getRequestDispatcher("UserListView.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
