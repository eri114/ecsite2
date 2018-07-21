package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	public int id;

	public String itemName;

	public String itemPrice;

	public String count;

	public int totalPrice;

	public String pay;

	public String payValue;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCount(){
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

	public String getPay(){
		return pay;
	}

	public void setPay(String pay){
		this.pay = pay;
	}

	public String getPayValue(){
		return payValue;
	}

	public void setPayValue(String payValue){
		this.payValue = payValue;
	}
}
