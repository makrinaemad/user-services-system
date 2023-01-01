package com.Fawrey.Syetem.user_pay.user_service;
import java.util.Vector;

import com.Fawrey.Syetem.user_pay.Model.user;

public class wallet_pay implements payment{

	int amount_wallet=0;
	credit_card credit;
	user u=new user();
	public wallet_pay() {}
	
	public String wallet_pay(user u,credit_card c,int a) {
		this.u=u;
		this.amount_wallet=a ;
		this.credit=c;
		if(a<=credit.amount) {
			this.amount_wallet = a+amount_wallet;
			credit.amount-=a;
			return(a+" pounds Added successfull");
		}
		else
			return("you don't have enough money on your your credit set it and try again");
		
	}

	public int getAmount() {
		return amount_wallet;
	}
	public String setAmount(user u,credit_card c,int a) {
		this.credit=c;
		if(a<=credit.amount) {
			this.amount_wallet = a+amount_wallet;
			credit.amount-=a;
			return(a+" pounds Added successfull");
		}
		else
			return("you don't have enough money on your your credit set it and try again");
	}
	
	@Override
	public int pay() {
		return 0;
	}
	public String Withdraw_money(int money,int discount) {
		if(money<=amount_wallet )
		{int reminder=amount_wallet-money;
		int dis=money*(discount/100);
		amount_wallet -=money;
		if(discount>0)
			return ("you pay "+money+" from your wallet the remainder of your balance ( "+(reminder)+")before the discount");
		else
			return("you pay "+money+" via credit card the remainder of your balance after discount("+(reminder)+")");
		}
		else 
			return ("you don't have enough money in your wallet set it and try again");
	}
}
