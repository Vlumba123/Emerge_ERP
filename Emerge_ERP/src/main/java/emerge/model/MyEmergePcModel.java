package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.MyEmergePcBean;

public class MyEmergePcModel {
	
	public static void add(MyEmergePcBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root", "root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO MY_EMERGEPC_TABLE VALUES(?,?,?,?)");

		ps.setInt(1, bean.getCustomerId());
		ps.setString(2, bean.getCustomerName());
		ps.setString(3, bean.getESTN_P());
		ps.setString(4, bean.getESTN());
		
	

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}
	
	public List<MyEmergePcBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM MY_EMERGEPC_TABLE  ");

		ResultSet rs = ps.executeQuery();

		ArrayList<MyEmergePcBean> list = new ArrayList<MyEmergePcBean>();

		while (rs.next()) {

			 MyEmergePcBean bean = new MyEmergePcBean();

			bean.setCustomerId(rs.getInt(1));
			bean.setCustomerName(rs.getString(2));
			bean.setESTN_P(rs.getString(3));
			bean.setESTN(rs.getString(4));

			list.add(bean);
		}

		return list;
	}
	
	public void update(MyEmergePcBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE MY_EMERGEPC_TABLE SET CustomerName=?, ESTN=?, ESTN_P=? WHERE Customer_Id=?");

		ps.setString(1, bean.getCustomerName());
		ps.setString(2, bean.getESTN());
		ps.setString(3, bean.getESTN_P());
		ps.setInt(4, bean.getCustomerId());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	
	public void delete(MyEmergePcBean bean) throws Exception {
 
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM MY_EMERGEPC_TABLE WHERE CustomerId =?");

		ps.setInt(1, bean.getCustomerId());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}


}

