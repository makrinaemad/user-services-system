package com.Fawrey.Syetem.user_pay.user_service;

import java.util.ArrayList;
import java.util.Scanner;

public class search {
	service serv;
	ArrayList<String>services;
	
	public ArrayList<String>get_list_services(){
		return services;
	}
	
	public search() {
		services=new ArrayList<>();
		services.add("mobile service");
		services.add("internet service");
		services.add("landline service");
		services.add("donations service");
        
	}
	
	
	
	public service get_serv() {
		return serv;
	}

	public void set_service(String servName) {
		if(servName.equals("mobile")) {
			
			serv=new mobile_services();
		}
		else if (servName.equals("internet")) {
			
			serv = new internet_service();
			
		} 
		else if (servName.equals("landline")) {
			
			serv = new landLine_service();
	
		} 
		else if (servName.equals("donations")) {
			
			serv = new donations();
			
		}
		
	}
	

}
