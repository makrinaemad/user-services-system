package com.Fawrey.Syetem.user_pay.Model;

public class pay_service {
	
	String user_name;
	String service_name;
	String srvise_type;
	String servise_provider;
	int amount;
	public pay_service() {}
	public pay_service(String user_name, String service_name, String srvise_type, String servise_provider, int amount) {
		super();
		this.user_name = user_name;
		this.service_name = service_name;
		this.srvise_type = srvise_type;
		this.servise_provider = servise_provider;
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getSrvise_type() {
		return srvise_type;
	}
	public void setSrvise_type(String srvise_type) {
		this.srvise_type = srvise_type;
	}
	public String getServise_provider() {
		return servise_provider;
	}
	public void setServise_provider(String servise_provider) {
		this.servise_provider = servise_provider;
	}
}
