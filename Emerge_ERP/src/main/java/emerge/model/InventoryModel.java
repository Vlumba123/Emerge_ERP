package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.InventoryBean;

public class InventoryModel {

	public static void add(InventoryBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO INVENTORY_TABLE VALUES(?,?,?,?,?,?,?,?,?,?)");

		ps.setString(1, bean.getProductCategory());
		ps.setString(2, bean.getProductSubCategory());
		ps.setString(3, bean.getSpecification());
		ps.setString(4, bean.getWarranty());
		ps.setString(5, bean.getBrand());
		ps.setInt(6, bean.getPrice());
		ps.setInt(7, bean.getQuantity());
		ps.setInt(8, bean.getOrderValue());
		ps.setString(9, bean.getVendorName());
		ps.setString(10, bean.getVendorAddress());

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}

	public List<InventoryBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM INVENTORY_TABLE  ");

		ResultSet rs = ps.executeQuery();

		ArrayList<InventoryBean> list = new ArrayList<InventoryBean>();

		while (rs.next()) {

			InventoryBean bean = new InventoryBean();

			bean.setProductCategory(rs.getString(1));
			bean.setProductSubCategory(rs.getString(2));
			bean.setSpecification(rs.getString(3));
			bean.setWarranty(rs.getString(4));
			bean.setBrand(rs.getString(5));
			bean.setPrice(rs.getInt(6));
			bean.setQuantity(rs.getInt(7));
			bean.setOrderValue(rs.getInt(8));
			bean.setVendorName(rs.getString(9));
			bean.setVendorAddress(rs.getString(10));

			list.add(bean);
		}

		return list;
	}

	public void update(InventoryBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE INVENTORY_TABLE SET ProductCategory=?, ProductSubCategory=?, Warranty=?, Brand=?, Price=?, Quantity=?,OrderValue=?,VendorName=?,VendorAddress=? WHERE Specification=?");

		ps.setString(1, bean.getProductCategory());
		ps.setString(2, bean.getProductSubCategory());
		ps.setString(3, bean.getWarranty());
		ps.setString(4, bean.getBrand());
		ps.setInt(5, bean.getPrice());
		ps.setInt(6, bean.getQuantity());
		ps.setInt(7, bean.getOrderValue());
		ps.setString(8, bean.getVendorName());
		ps.setString(9, bean.getVendorAddress());
		ps.setString(10, bean.getSpecification());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

	public void delete(InventoryBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM Inventory_Table WHERE Specification =?");

		ps.setString(1, bean.getSpecification());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

}
