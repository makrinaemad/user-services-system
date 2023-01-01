package com.Fawrey.Syetem.user_pay.user_service;

import com.Fawrey.Syetem.user_pay.Model.user;

public class credit_card implements payment{
	String mobile_num;
	int card_code;
	int amount=0;
	user u=new user();
	public  credit_card() {};
	public credit_card(user u,int a ) {
		this.amount=amount+a;
		//this.card_code=code;
	}
	@Override
	public int pay() {return 0;}
	public String Withdraw_money(int money,int discount) {
		if(money<=amount)
			
		{
			int reminder=amount-money;
//			double dis=(money*(discount/100));
//			double d=reminder+dis;
			amount-=money;
//			if(discount>0)
//			return("you pay "+money+" via credit card the remainder of your balance after discount ("++")");
//			else
				return("you pay "+money+" via credit card the remainder of your balance ("+reminder+")"+" before the discount ");
		}
		else 
			return("you don't have enough money via credit card set it and try again");
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public int getCard_code() {
		return card_code;
	}
	public void setCard_code(int card_code) {
		this.card_code = card_code;
	}
	public int getAmount() {
		return amount;
	}
//	public void setAmount(user u,int a) {
//		this.amount=amount+a;
//		//this.card_code=code;
//	}
	public void setAmount(user use, int n) {
		// TODO Auto-generated method stub
		this.amount=amount+n;
	}

}
