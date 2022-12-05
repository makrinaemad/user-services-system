import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap; 
public class Admin {
	// user us;
	//String accept;
	String service = "mm";
	// public boolean specific_Dis = false;
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

	public void request_list() {
		for(int i=0;i<amount.size();i++) {
		System.err.println("Name: "+user_list.get(i)+" , Amount: "+amount.get(i));}
	}

	public void get_request_from_user(String n, int cost,String provider) {
		user_list.add(n);
		amount.add(cost);
		provider1.add(provider);
	}

	public void make_specific_discount(String n) {
		this.service = n;

	}

	public String get_specific_discount() {

		return service;
	}

	public void Accept(String n,int a) {
		for(int i=0;i<user_list.size();i++) {
			if(user_list.get(i).equals(n))
		       accept.put(n,a);
			provider2.add(provider1.get(i));
			user_list.remove(i);
			amount.remove(i);
			provider1.remove(i);
			}
		
	}

	public void Reject(String n) {
		System.err.println("refund request rejected ");
	}
}
