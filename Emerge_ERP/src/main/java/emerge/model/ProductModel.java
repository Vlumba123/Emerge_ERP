package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.OrderBean;
import emerge.bean.ProductBean;

public class ProductModel {

	public static void add(ProductBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO PRODUCT_TABLE VALUES(?,?,?,?)");

		ps.setString(1, bean.getCategory());

		ps.setString(2, bean.getBrand());

		ps.setString(3, bean.getConfiguration());

		ps.setString(4, bean.getESTN());

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}

	public List<ProductBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM  PRODUCT_TABLE ");

		ResultSet rs = ps.executeQuery();

		ArrayList<ProductBean> list = new ArrayList<ProductBean>();

		while (rs.next()) {

			ProductBean bean = new ProductBean();

			bean.setCategory(rs.getString(1));
			bean.setBrand(rs.getString(2));
			bean.setConfiguration(rs.getString(3));
			bean.setESTN(rs.getString(4));

			list.add(bean);
		}

		return list;
	}
	
	public void update(ProductBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE Product_Table SET Category=?, Brand=?, Configuration=? WHERE Estn=?");

		ps.setString(1, bean.getCategory());
		ps.setString(2, bean.getBrand());
		ps.setString(3, bean.getConfiguration());
		ps.setString(4, bean.getESTN());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	public void delete(ProductBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM Product_Table WHERE Estn =?");

		ps.setString(1, bean.getESTN());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	

}
