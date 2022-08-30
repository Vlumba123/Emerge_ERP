package emerge.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.OrderBean;

public class CustomerModel {

	public static void add(CustomerBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER_TABLE VALUES(?,?,?,?,?)");

		ps.setInt(1, bean.getCustomer_Id());
		ps.setString(2, bean.getCustomerName());
		ps.setString(3, bean.getMobile());
		ps.setString(4, bean.getAddress());
		ps.setString(5, bean.getESTN_P());

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}

	public List<CustomerBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM  Customer_table ");

		ResultSet rs = ps.executeQuery();

		ArrayList<CustomerBean> list = new ArrayList<CustomerBean>();

		while (rs.next()) {

			CustomerBean bean = new CustomerBean();

			bean = new CustomerBean();

			bean.setCustomer_Id(rs.getInt(1));
			bean.setCustomerName(rs.getString(2));
			bean.setMobile(rs.getString(3));
			bean.setAddress(rs.getString(4));
			bean.setESTN_P(rs.getString(5));

			list.add(bean);
		}

		return list;
	}

	public void update(CustomerBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE Customer_Table SET CustomerName=?, Mobile=?, Address=?, ESTN_P=? WHERE Customer_ID=?");

		ps.setString(1, bean.getCustomerName());
		ps.setString(2, bean.getMobile());
		ps.setString(3, bean.getAddress());
		ps.setString(4, bean.getESTN_P());
		ps.setInt(5, bean.getCustomer_Id());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

	public void delete(CustomerBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM Customer_Table WHERE Customer_Id =?");

		ps.setInt(1, bean.getCustomer_Id());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

}
