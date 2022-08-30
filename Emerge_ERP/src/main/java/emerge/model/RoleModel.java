package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.EstnPackageBean;
import emerge.bean.RoleBean;

public class RoleModel {

	public static void add(RoleBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO ROLE_TABLE VALUES(?,?)");

		ps.setInt(1, bean.getRole_Id());
		ps.setString(2, bean.getRoleName());

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}

	public List<RoleBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM  ROLE_TABLE ");

		ResultSet rs = ps.executeQuery();

		ArrayList<RoleBean> list = new ArrayList<RoleBean>();

		while (rs.next()) {

			RoleBean bean = new RoleBean();

			bean.setRole_Id(rs.getInt(1));
			bean.setRoleName(rs.getString(2));

			list.add(bean);
		}

		return list;
	}
	
	public void update(RoleBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE Role_Table SET RoleName=? WHERE RoleID=?");

		
		ps.setString(1, bean.getRoleName());
		ps.setInt(2, bean.getRole_Id());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	
	public void delete(RoleBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM Role_Table WHERE RoleId =?");

		ps.setInt(1, bean.getRole_Id());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

}
