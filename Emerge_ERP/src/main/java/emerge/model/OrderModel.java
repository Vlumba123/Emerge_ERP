package emerge.model;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.OrderBean;

public class OrderModel {

	public static void add(OrderBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO Orders_placed_table VALUES(?,?,?,?)");

		ps.setString(1, bean.getCustomerName());
		ps.setString(2, bean.getMobile());
		ps.setString(3, bean.getCustomerAddress());
		ps.setString(4, bean.getRequirement());

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();

	}

	public List<OrderBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM  Orders_placed_table ");

		ResultSet rs = ps.executeQuery();

		ArrayList<OrderBean> list = new ArrayList<OrderBean>();

		while (rs.next()) {

			OrderBean bean = new OrderBean();

			bean.setCustomerName(rs.getString(1));
			bean.setMobile(rs.getString(2));
			bean.setCustomerAddress(rs.getString(3));
			bean.setRequirement(rs.getString(4));

			list.add(bean);
		}

		return list;
	}

	public void update(OrderBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE Order_Table SET CustomerName=?, Mobile=?, CustomerAddress=? WHERE Requirement=?");

		ps.setString(1, bean.getCustomerName());
		ps.setString(2, bean.getMobile());
		ps.setString(3, bean.getCustomerAddress());
		ps.setString(4, bean.getRequirement());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	
	public void delete(OrderBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM Order_Table WHERE Requirement=?");

		ps.setString(1, bean.getRequirement());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

}
