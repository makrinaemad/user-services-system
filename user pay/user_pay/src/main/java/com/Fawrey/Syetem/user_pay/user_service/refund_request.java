package com.Fawrey.Syetem.user_pay.user_service;
import java.util.ArrayList;

import com.Fawrey.Syetem.user_pay.Model.Admin;
public class refund_request {
	Admin ad;
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

}
