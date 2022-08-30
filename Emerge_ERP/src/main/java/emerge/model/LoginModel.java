package emerge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

import emerge.bean.LoginBean;
import emerge.bean.UserBean;

public class LoginModel {

	public UserBean Authenticate(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emerge_erp_db?useSSL=false", "root",
				"root");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM User_Table WHERE EMAIL = ? AND PASSWORD = ?");

		ps.setString(1, bean.getEmail());
		ps.setString(2, bean.getPassword());

		ResultSet rs = ps.executeQuery();
		UserBean bean1 = null;
		while (rs.next()) {

			bean1 = new UserBean();
			bean1.setEmail(rs.getString(4));
			bean1.setPassword(rs.getString(5));
			bean1.setRoleId(rs.getInt(6));

		}

		return bean1;
	}

}
