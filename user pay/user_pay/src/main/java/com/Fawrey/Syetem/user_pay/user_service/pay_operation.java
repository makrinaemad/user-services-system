package com.Fawrey.Syetem.user_pay.user_service;
//
//import java.util.Scanner;
//
//import com.Fawrey.Syetem.user_pay.Model.Admin;
//import com.Fawrey.Syetem.user_pay.Model.user;
//
//public class pay_operation extends  Admin{
//	credit_card credit = new credit_card();
//	cache cach = new cache();
//	wallet_pay wallet = new wallet_pay();
//	public payment p = credit;
//	
//	specificDiscount sD=new specificDiscount(p);
//	public void set_sevice_provider(String name,int n) {
//		user u=new user();
//		if (name .equals( "credit")) {
//			credit.setAmount(n);
//			p = credit;
//		} else if (name .equals( "cache")) {
//
//          cach.setAmount( n);
//		} else if (name .equals( "wallet")) {
//			wallet.setAmount(credit, n);
//		}
//	}
//	
//	public String pay(user u,int a, String provider) {
//		int cost=0;
//
//		if (sD.get_specific_discount().equals(u.getServiceName())  && u.getFirst_transaction() == false) {
//			payment p1 = new specificDiscount(p);
//			payment p2 = new overallDiscount(p1);
//			cost=p2.pay();
//			
//			
//		} else if (sD.get_specific_discount().equals(u.getServiceName()) ) {
//			payment p1 = new specificDiscount(p);
//			 cost=p1.pay();
//
//		}
//
//		else if (u.getFirst_transaction() == true) {
//			payment p1 = new overallDiscount(p);
//			cost=p1.pay();
//		} 
//		 else
//			cost=p.pay();
//		
//		u.setFirst_transaction(true);
//		if (provider.equals("credit")) {
//			this.p = credit;
//			return credit.Withdraw_money(a,cost);
//		} else if (provider.equals("cache")) {
//			this.p = cach;
//			return cach.Withdraw_money(a,cost);
//		} else if (provider.equals("wallet")) {
//			this.p = wallet;
//			return wallet.Withdraw_money(a,cost);
//		} else
//			{return("enter credit or cache or wallet and try again");}
//		
//
//	}
//}
