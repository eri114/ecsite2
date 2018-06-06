package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	private String userName1;
	private String userName2;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userAddress4;
	private String sex;
	private String mail;
	private String tel;
	public Map<String, Object> session;
	private String errorMessage;
	public String execute() {
		String result = SUCCESS;

		/*未入力の項目がないかの確認*/
		if(!(loginUserId.equals(""))
				&&!(loginPassword.equals(""))
				&&!(userName1.equals(""))
				&&!(userName2.equals(""))
				&&!(userAddress1.equals(""))
				&&!(userAddress3.equals(""))
				&&!(userAddress4.equals(""))
				&&!(sex.equals(""))
				&&!(mail.equals(""))
				&&!(tel.equals(""))
		){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName1", userName1);
			session.put("userName2", userName2);
			session.put("userAddress1", userAddress1);
			session.put("userAddress2", userAddress2);
			session.put("userAddress3", userAddress3);
			session.put("userAddress4", userAddress4);
			session.put("sex", sex);
			session.put("mail", mail);
			session.put("tel", tel);

		} else {
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
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
		this.userAddress3=userAddress3;
	}

	public String getUserAddress4() {
		return userAddress4;
	}

	public void setUserAddress4(String userAddress4) {
		this.userAddress4=userAddress4;
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

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
