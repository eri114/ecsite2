package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private boolean LoginFlg;
	private String userName1;
	private String userName2;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userAddress4;
	private String sex;
	private String mail;
	private String tel;

	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public boolean getLoginFlg() {
		return LoginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		LoginFlg = loginFlg;
	}
	public String getUserName1() {
		return userName1;
	}
	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}

	public String getUserName2() {
		return userName2;
	}

	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}

	public String getUserAddress1() {
		return userAddress1;
	}

	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public String getUserAddress3() {
		return userAddress3;
	}

	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}

	public String getUserAddress4() {
		return userAddress4;
	}

	public void setUserAddress4(String userAddress4) {
		this.userAddress4 = userAddress4;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
