package com.Fawrey.Syetem.user_pay.Model;

import com.Fawrey.Syetem.user_pay.user_service.service;

public class user {
	
	public String name;
	public String email;
	public String password;
	//public String serviceName ;
	//public pay_service serve;
	Boolean first_transaction=false;
	public Boolean getFirst_transaction() {
		return first_transaction;
	}

	public void setFirst_transaction(Boolean first_transaction) {
		this.first_transaction = first_transaction;
	}

	public String serviceName ;
	public service s;
	public user() {}
	
public user( String name,String email,String password) {

		
		this.name = name;
		this.email = email;
		this.password = password;
	}

//public String getServiceName() {
//	return serviceName;
//}
//
//public void setServiceName(String serviceName) {
//	this.serviceName = serviceName;
//}
//void chooseService(String serviceObj) {
//	s.choose(serviceObj);
//}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

//public pay_service getServe() {
//	return serve;
//}
//
//public void setServe(pay_service serve) {
//	this.serve = serve;
//}

public String getServiceName() {
	return serviceName;
}

public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}

public service getS() {
	return s;
}

public void setS(service s) {
	this.s = s;
}



}


