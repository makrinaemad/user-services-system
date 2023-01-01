package com.Fawrey.Syetem.user_pay.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Admin {

	public String service = "";
	

	public ArrayList<String> user_list = new ArrayList<String>();
	public ArrayList<String> provider1 = new ArrayList<String>();
	public ArrayList<String> provider2 = new ArrayList<String>();
	public ArrayList<Integer> amount = new ArrayList<Integer>();
	public HashMap<String, Integer> accept = new HashMap<String, Integer>();
	private static final Admin instance = new Admin();

	protected Admin() {
		// private constructor
	}

	public static Admin getInstance() {
		return instance;
	}
	
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	public void make_specific_discount(String n) {
		setService(n); 

	}

	public String get_specific_discount() {

		return getService();
	}
}
