
public class Admin {
	
	user us;
	String service="";
	  public boolean specific_Dis=false;
	Admin() {
		
	}
	
	public void make_specific_discount(String n) {
		this.service=n;
		
	}
	public String get_specific_discount() {
		
		return service;
	}

}
