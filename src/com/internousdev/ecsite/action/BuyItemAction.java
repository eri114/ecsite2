package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	public List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	public Map<String, Object> session;

	private String itemName;

	private String itemPrice;

	private String count;

	private String pay;

	private String payValue;

	public String execute() {
		String result = SUCCESS;

		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(count);
		System.out.println(pay);


		String[] itemNameList = itemName.split(", ",0);
		String[] itemPriceList = itemPrice.split(", ",0);
		String[] countList = count.split(", ",0);


		for(int i=0; i < itemNameList.length; i++){
			BuyItemDTO buyItemDTO = new BuyItemDTO();

			buyItemDTO.setItemName(itemNameList[i].toString());

			buyItemDTO.setItemPrice(itemPriceList[i].toString());

			buyItemDTO.setCount(countList[i].toString());

			int intCount = Integer.parseInt(countList[i].toString());
			int intPrice = Integer.parseInt(itemPriceList[i].toString());
			buyItemDTO.setTotalPrice(intCount * intPrice);

			buyItemDTOList.add(buyItemDTO);


		}

		if(pay.equals("1")){
			payValue="現金払い";
		}else{
			payValue="クレジットカード";
		}

		session.put("list", buyItemDTOList);

		return result;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getPayValue() {
		return payValue;
	}

	public void setPayValue(String payValue) {
		this.payValue = payValue;
	}

}
