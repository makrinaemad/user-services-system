import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	// user us;
	String accept;
	String service = "";
	// public boolean specific_Dis = false;
	ArrayList<String> user_list = new ArrayList<String>();
	private static final Admin instance = new Admin();

	protected Admin() {
		// private constructor
	}

	public static Admin getInstance() {
		return instance;
	}

	public void request_list() {
		System.err.println(user_list);
	}

	public void get_request_from_user(String n, String str, int cost) {

		System.err.println("Accept or Reject :");
		Scanner sc = new Scanner(System.in);
		this.accept = sc.nextLine();
		if (accept.equals("Accept")) {
			Accept();
			user_list.add(n);
		} else if (accept.equals("Reject")) {
			Reject();
		}
	}

	public void make_specific_discount(String n) {
		this.service = n;

	}

	public String get_specific_discount() {

		return service;
	}

	public void Accept() {
		System.err.println("refund request accpeted ");
	}

	public void Reject() {
		System.err.println("refund request rejected ");
	}
}
