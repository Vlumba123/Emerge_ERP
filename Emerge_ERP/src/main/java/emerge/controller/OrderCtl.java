package emerge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emerge.bean.OrderBean;
import emerge.model.OrderModel;


@WebServlet("/OrderCtl")
public class OrderCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		 OrderBean bean =new OrderBean();
			
	        bean.setCustomerName(request.getParameter("Cname"));
	    	bean.setMobile(request.getParameter("Cmobile"));
	        bean.setCustomerAddress(request.getParameter("Caddress"));
			bean.setRequirement(request.getParameter("Crequirement"));
		   
			
			
	  OrderModel model= new OrderModel();
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


