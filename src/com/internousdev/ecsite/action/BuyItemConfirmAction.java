package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String itemName;
	private String itemPrice;
	private int id;
	private String count;
	private String pay;

	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<>();


	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {

		buyItemDTOList =(ArrayList<BuyItemDTO>) session.get("list");

		for (int i = 0; i < buyItemDTOList.size(); i++){
			int id = buyItemDTOList.get(i).getId();
			int totalPrice = buyItemDTOList.get(i).getTotalPrice();
				System.out.println(totalPrice);



		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

		buyItemCompleteDAO.buyItemInfo(
				id,
				session.get("login_user_id").toString(),
				totalPrice,
				count,
				pay);

		}

		String result = SUCCESS;
		return result;
	}


	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String setItemPrice(){
		return itemPrice;
	}

	public void getItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int setId(){
		return id;
	}

	public void getId(int id){
		this.id = id;
	}

	public String count(){
		return count;
	}

	public void getCount(String count){
		this.count = count;
	}

	public String setPay(){
		return pay;
	}

	public void getPay(String pay){
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
