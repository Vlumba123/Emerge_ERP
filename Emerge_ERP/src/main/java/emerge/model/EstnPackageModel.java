package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.EstnPackageBean;

public class EstnPackageModel {
	
	public static void add(EstnPackageBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root", "root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO ESTN_PACKAGE_TABLE VALUES(?,?,?)");

	
		ps.setString(1, bean.getConfiguration());
		ps.setString(2, bean.getESTN());
		ps.setString(3, bean.getESTN_P());
		
	

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}
	
	public List<EstnPackageBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM  ESTN_PACKAGE_TABLE ");

		ResultSet rs = ps.executeQuery();

		ArrayList<EstnPackageBean> list = new ArrayList<EstnPackageBean>();

		while (rs.next()) {
			
			EstnPackageBean bean = new EstnPackageBean();

			bean = new EstnPackageBean();

			bean.setConfiguration(rs.getString(1));
			bean.setESTN(rs.getString(2));
			bean.setESTN_P(rs.getString(3));
			

			list.add(bean);
		}

		return list;
	}
	
	public void update(EstnPackageBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE estn_package_table SET Configuration=?, ESTN=?  WHERE ESTN_P=?");

		ps.setString(1, bean.getConfiguration());
		ps.setString(2, bean.getESTN());
		ps.setString(3, bean.getESTN_P());
		

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	
	public void delete(EstnPackageBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM estn_package_table  WHERE Estn_P =?");

		ps.setString(1, bean.getESTN_P());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}


}


