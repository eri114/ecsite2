package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName1(resultSet.getString("user_name1"));
				loginDTO.setUserName2(resultSet.getString("user_name2"));
				loginDTO.setUserAddress1(resultSet.getString("user_address1"));
				loginDTO.setUserAddress2(resultSet.getString("user_address2"));
				loginDTO.setUserAddress3(resultSet.getString("user_address3"));
				loginDTO.setUserAddress4(resultSet.getString("user_address4"));
				loginDTO.setSex(resultSet.getString("user_sex"));
				loginDTO.setMail(resultSet.getString("user_mail"));
				loginDTO.setTel(resultSet.getString("user_tel"));

				if(!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			return loginDTO;
	}

}
