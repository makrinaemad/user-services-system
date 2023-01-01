package com.Fawrey.Syetem.user_pay.user_service;


	import java.util.ArrayList;
	import java.util.List;
import java.util.Scanner;

import javax.swing.JList;
	import org.springframework.stereotype.Service;

import com.Fawrey.Syetem.user_pay.Model.Admin;
import com.Fawrey.Syetem.user_pay.Model.pay_service;
import com.Fawrey.Syetem.user_pay.Model.user;

	@Service
	
	
	public class User_service {
		
//////////////////////
public pay_service serve;
//public pay_operation p;
///////////////////
public  List <user> users=new ArrayList<>();
public static Admin ad = Admin.getInstance();
public static Admin getAd() {
	return ad;
}



public static void setAd(Admin ad) {
	User_service.ad = ad;
}


credit_card credit = new credit_card();
cache cach = new cache();
wallet_pay wallet = new wallet_pay();
public payment pay = credit;
specificDiscount sD=new specificDiscount(pay);
		public User_service() {
			super();
			this.users=new ArrayList<>();
			//this.pay=new pay_operation();
			
		}


		
		//private static final User_service instance = new User_service();

//		protected User_service() {
//			// private constructor
//		}
//
//		public static User_service getInstance() {
//			return instance;
//		}
		
		public List<user> getUsers() {
			return users;
		}


		public void setUsers(List<user> users) {
			this.users = users;
		}


		public service getS() {
			return s;
		}


		public void setS(service s) {
			this.s = s;
		}


		public service s;

		 
		 ///signup
		 public String signup(user u)	{
			 
			 for(user use: users) {
				 if(u.getName() .equals( use.getName()))
					 {return ("Is already Exist please enter another name\n");}
//				 if(u.getEmail().equals(use.getEmail())) {
//					 return ("Is already Exist please enter another Email\n");
//				 }
			 }
			 
			 users.add(u);
			 return ("you sign up successful sign in now to continue\n");
		 }
		 
		 
		 ////signin
           public String signIn(String email,String password)	{
			 
			 for(user use: users) {
				 if(email .equals( use.getEmail())&&password.equals( use.getPassword()))
					 {return ("you sign in successfull\n1-Search\n2-Choose Service to pay"
					 		+ "\n3-Check Discount\n4-Ask for refund\n5-Add money in the wallet "
					 		+ "\n6-Set credit card or Cache payment  \n7-sign out");}

			 }
			 return (" the email or the password is not correct\n");
		 }
           
           ////////////////////////////////////////////////////////
       
    	
    	void setservice(String obj,user u) {
    		u.setServiceName(obj);
    		if (obj.equals("mobile") || obj.equals("Mobile")) {
    			u.setS( new mobile_services());;
    			//System.err.println("Type the service you want\norange \nwe \nvodafone \netisalat");
    		} else if (obj.equals("internet") || obj.equals("Internet")) {
    			u.setS ( new internet_service());
    			//System.err.println("Type the service you want\norange \nwe \nvodafone \netisalat");
    		} else if (obj.equals("landline") || obj.equals("Landline")) {
    			u.setS ( new landLine_service());
    			//System.err.println("Type the service you want\nquarter \nmonthely");
    		} else if (obj.equals("donation") || obj.equals("Donation")) {
    			u.setS( new donations());
    			//System.err.println("Type the service you want\nschools \ncancer hospital  \nNGOs ");
    		}

    	}
    	void chooseService(String serviceObj,user u) {
    		for(user use: users) {
   			 if(u.getName().equals(use.getName()))
   				 {
    		use.getS().choose (serviceObj);}}
    	}
    	
    	/////choose and pay
    	public String chooseToPay(pay_service service)	{
    		 
    		 for(user use: users) {
    			 if(service.getUser_name().equals( use.getName()))
    				 {
    		//user use =new user();
    				 setservice (service.getService_name(),use);
    				 chooseService(service.getSrvise_type(),use);
    				 //User_service p;
					return pay(use,service.getAmount(),service.getServise_provider());
    				 }
    		 }
    		 return ("the email or the password is incorrect\n");
    	 }
    	
           
    	public String Check_Discount(user u) {

    		if (u.getFirst_transaction() == false&&ad.getService().equals(u.getServiceName())) {
    			return("you have 10% discount for the first transaction and 20% discount for your service");
    		}
    		if(u.getFirst_transaction() == false)
    		{return("you have 10% discount for the first transaction\n ");}
    		if(ad.getService().equals(u.getServiceName()))
    			return("you have 20% discount for yoour service ");

    			return ("you don't have any discounts for other services");
    	}
           
           ////////////////////////////////////////
    	
    	
    	
    	public String pay(user u,int a, String provider) {
    		int cost=100;

    		if (sD.get_specific_discount().equals(u.getServiceName())  && u.getFirst_transaction() == false) {
    			payment p1 = new specificDiscount(pay);
    			payment p2 = new overallDiscount(p1);
    			cost=p2.pay();
    			
    			
    		} else if (sD.get_specific_discount().equals(u.getServiceName()) ) {
    			payment p1 = new specificDiscount(pay);
    			 cost=p1.pay();

    		}

    		else if (u.getFirst_transaction() == true) {
    			payment p1 = new overallDiscount(pay);
    			cost=p1.pay();
    		} 
    		 else
    			cost=pay.pay();
    		
    		u.setFirst_transaction(true);
    		if (provider.equals("credit")) {
    			this.pay = credit;
    			return credit.Withdraw_money(a,cost);
    		} else if (provider.equals("cache")) {
    			this.pay = cach;
    			return cach.Withdraw_money(a,cost);
    		} else if (provider.equals("wallet")) {
    			this.pay = wallet;
    			return wallet.Withdraw_money(a,cost);
    		} else
    			{return("enter credit or cache or wallet and try again");}
    		

    	}
           /////////////////////////////////////
    	
    	public void set_sevice_provider(String userName,String name,int n) {
    		for(user use: users) {
      			 if(userName.equals( use.getName()))
      				 {
    		if (name .equals( "credit")) {
    			credit.setAmount(use,n);
    			pay = credit;
    		} else if (name .equals( "cache")) {

              cach.setAmount( use,n);
    		} else if (name .equals( "wallet")) {
    			wallet.setAmount(use,credit, n);
    		}}}
    	}
    	
    	
    	
    	public ArrayList<String> request_list() {
   		 ArrayList<String> requests = new ArrayList<String>();
   		for(int i=0;i<ad.amount.size();i++) {
   			requests.add("Name: "+ad.user_list.get(i)+" , Amount: "+ad.amount.get(i));}
   		return (requests);
   	}

   	public void get_request_from_user(String n, int cost,String provider) {
   		ad.user_list.add(n);
   		ad.amount.add(cost);
   		ad.provider1.add(provider);
   	}
   	public void Accept(String n,int a) {
   		for(int i=0;i<ad.user_list.size();i++) {
   			if(ad.user_list.get(i).equals(n))
   		      ad.accept.put(n,a);
   			ad.provider2.add(ad.provider1.get(i));
   			ad.user_list.remove(i);
   			ad.amount.remove(i);
   			ad.provider1.remove(i);
   			}
   		
   	}
   	public String Reject(String n) {
   		return("refund request rejected ");
   	}

    	
    	
    	
           
           
//       	else if(num.equals("2")) {
//         System.err.println("Type the service you want \n -Mobile \n -Internet \n -Landline  \n -Donation ");
//         Scanner sc40=new Scanner(System.in);
//         String servname=sc40.nextLine();
//         us.get(user).setservice (servname);
//         Scanner sc5=new Scanner(System.in);
//         String serv=sc5.nextLine();
//         us.get(user).chooseService(serv);
//         System.err.println("Enter \n1-for(credit) \n2-for (cache) \n3-for (withdraw from your wallet)");
//         Scanner sc11=new Scanner(System.in);
//         int no=sc11.nextInt();
//         System.err.println("Enter the amount");
//         Scanner sc0=new Scanner(System.in);
//         int money=sc0.nextInt();
//      	   us.get(user).pay(money,no);
//       }
//		
	}




