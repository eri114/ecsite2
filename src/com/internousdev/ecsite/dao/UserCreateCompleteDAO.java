package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO login_user_transaction(login_id, login_pass, user_name1,"
			+ "userName2, userAddress1, userAddress3, userAddress4, sex, mail, tel,"
			+ "insert_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

	public void createUser(
			String loginUserId,
			String loginUserPassword,
			String userName1,
			String userName2,
			String userAddress1,
			String userAddress2,
			String userAddress3,
			String userAddress4,
			String sex,
			String mail,
			String tel) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginUserPassword);
			preparedStatement.setString(3,userName1);
			preparedStatement.setString(4,userName2);
			preparedStatement.setString(5,userAddress1);
			preparedStatement.setString(6,userAddress2);
			preparedStatement.setString(7,userAddress3);
			preparedStatement.setString(8,userAddress4);
			preparedStatement.setString(9,sex);
			preparedStatement.setString(10,mail);
			preparedStatement.setString(11,tel);
			preparedStatement.setString(12,dateUtil.getDate());

			preparedStatement.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
