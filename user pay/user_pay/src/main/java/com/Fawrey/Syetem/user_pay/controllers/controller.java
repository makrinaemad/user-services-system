package com.Fawrey.Syetem.user_pay.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Fawrey.Syetem.user_pay.Model.Admin;
import com.Fawrey.Syetem.user_pay.Model.pay_service;
import com.Fawrey.Syetem.user_pay.Model.user;
import com.Fawrey.Syetem.user_pay.user_service.User_service;
//import com.Fawrey.Syetem.user_pay.user_service.choose_service;

//import API_pack.GetMapping;
//import API_pack.ResponseBody;
//import API_pack.payment_controller;
//import base_project.search;

//import com.Fawry_System.Payment.Models.user;
//import com.Fawry_System.Payment.services.services;
//import com.Fawry_System.Payment.userBsl.user_service;
import com.Fawrey.Syetem.user_pay.user_service.search;
@RestController

public class controller {
	public static Admin ad = Admin.getInstance();
	private User_service service_user;
	static  search searchin_serv=new search();
    // choose_service choose=new choose_service();
	public controller(User_service service_user) {
		super();
		this.service_user =service_user;
		
	}

	
//@Autowired

	
	
//	@GetMapping ("/print/{id}")
//	public String payment_name (@PathVariable ("id") int id) {
//		
//		//System.out.println("a------------------\n");
//			return service_user.getname(id);
//	}
	
	
	@PostMapping ("/signup")
	public String signUp (@RequestBody user u) {
		
			return service_user.signup(u);
	}
	
	@PostMapping ("/signin")
	public String signIn (@RequestParam (value ="email") String email,@RequestParam (value="password") String password) {
		
			return service_user.signIn(email,password);
	}
	
	@GetMapping(value="/search_list")
	public static ArrayList<String> get_servin_search() {
		return searchin_serv.get_list_services();
	}
	//return service obj 
	
	@PostMapping(value="/search_query")
	public static ArrayList<String> searchQuery(@RequestParam (value ="name",required=false) String s) {
		searchin_serv.set_service(s);
		return searchin_serv.get_serv().show();
	}
	
	@PostMapping(value="/Choose Service")
	public String chooseToPay(@RequestBody pay_service service)	{
		 
		 return (service_user.chooseToPay(service));
	 }
	
	@GetMapping(value="/check discount")
	public String Check_Discount(user u) {
		return service_user.Check_Discount(u);
	}
	
	@PostMapping(value="/set service provider")
	public String set_sevice_provider(@RequestParam (value ="user name") String u_name,@RequestParam (value ="provider name") String s,@RequestParam (value ="amount")int n,user u) {
		service_user.set_sevice_provider(u_name,s,n);
		return "Added Successfull\n";
		}
	
	@GetMapping(value="/admin/request list")
	public ArrayList<String> request_list() {
		
		return service_user.request_list();
	}
	@PostMapping(value="/ask for refund")
	public String get_request_from_user(@RequestParam (value ="user name")String n,@RequestParam (value ="amount") int cost,@RequestParam (value ="provider name")String provider) {
		 service_user.get_request_from_user(n,cost,provider);
		 return "your request is send";
   	}
	@PostMapping(value="/admin accept refund")
	public void Accept(@RequestParam (value ="user name")String n,@RequestParam (value ="amount")int a) {
		service_user.Accept(n,a);
		}
	
	@PostMapping(value="/admin reject refund")
	public void Reject(@RequestParam (value ="user name")String n) {
		service_user.Reject(n);
	}
	@PostMapping(value="/admin make discount")
	public String make_specific_discount(@RequestParam (value ="service name") String n) {
		ad.make_specific_discount(n);
		return "the discount added successfull";
	}
	
	
	//search?name=koko&id=2
//	@GetMapping ("/search")        //or @RequestBody
//	public String search (@RequestParam (value ="name",required=false) String name,@RequestParam (value="id",required=false) int id) {
//		
//		//System.out.println("a------------------\n");
//			return service_user.search(name,id);
//	}
}
