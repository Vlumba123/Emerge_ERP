package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import emerge.bean.CustomerBean;
import emerge.bean.RoleBean;
import emerge.bean.UserBean;

public class UserModel {

	public static void add(UserBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("INSERT INTO USER_TABLE VALUES(?,?,?,?,?,?)");

		ps.setInt(1, bean.getUserId());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getPassword());
		ps.setInt(6, bean.getRoleId());

		ps.executeUpdate();
		con.commit();

		con.close();
		ps.close();
	}

	public List<UserBean> search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM  User_table ");

		ResultSet rs = ps.executeQuery();

		ArrayList<UserBean> list = new ArrayList<UserBean>();

		while (rs.next()) {

			UserBean bean = new UserBean();

			bean.setUserId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setRoleId(rs.getInt(6));

			list.add(bean);
		}

		return list;
	}

	public void update(UserBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement(
				"UPDATE User_Table SET firstName=?, lastName=?, Email=?, Password=?,RoleId=? WHERE UserId= ?");

		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getEmail());
		ps.setString(4, bean.getPassword());
		ps.setInt(5, bean.getRoleId());
		ps.setInt(5, bean.getUserId());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}
	public void delete(UserBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emerge_erp_db?useSSL=false", "root",
				"root");

		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("DELETE FROM User_Table WHERE UserId =?");

		ps.setInt(1, bean.getUserId());

		ps.executeUpdate();
		con.commit();

		ps.close();
		con.close();
	}

}
