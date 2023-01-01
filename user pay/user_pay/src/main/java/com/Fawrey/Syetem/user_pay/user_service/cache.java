package com.Fawrey.Syetem.user_pay.user_service;

import com.Fawrey.Syetem.user_pay.Model.user;

//import com.Fawrey.Syetem.user_pay.Model.discount;

public class cache implements payment{
String mobile_num;
	int amount;
	user u=new user();
	public cache () {}
	
	public cache (user u,int a) {
		this.u=u;
		this.amount=amount+a;
	}
	@Override
	public int pay() {
		return 0;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(user u,int a) {
		this.amount=amount+a;
		//this.mobile_num=mob;
	}
	
	public String  Withdraw_money(int money,int discount) {
		if(money<=amount)
		{int reminder=amount-money;
		int dis=money*(discount/100);
		amount-=money;
		if(discount>0)
			return("you pay "+money+" cache the remainder of your balance ("+(reminder)+")before the discount");
		else
			return("you pay "+money+" via credit card the remainder of your balance after discount ("+(reminder)+")");
		}
		else 
			return ("you don't have enough money cache set it and try again ");
	}

}
