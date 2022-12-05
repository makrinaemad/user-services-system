import java.util.Scanner;

public class user {
	static Admin ad = Admin.getInstance();
	public service s;
	public String serviceName="1";
	public String name;
	public String email;
	public String password;
	public int wallet = 0;
	public boolean signup = false;
	public boolean signout = true;
	public boolean isSignout() {
		return signout;
	}

	public void setSignout(boolean signout) {
		this.signout = signout;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public payment p = new credit_card();
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


	public user() {
		super();
	}

	void signin(String name, String pass) {
		this.name = name;
		this.password = pass;
		System.err.println("Hello " + name+"\n");

	}

	void signUp(String name, String email, String pass) {
		this.name = name;
		this.email = email;
		this.password = pass;
		signup = true;

	}

	void signUp() {
		
	}
	void chooseService(String serviceObj) {
		this.serviceName = serviceObj;
		s.choose(serviceObj);
	}

	void setservice(String obj) {
		if (obj .equals("mobile")||obj.equals("Mobile")) {
			this.s = new mobile_services();
			 System.err.println("Type the service you want\norange \nwe \nvodafone \netisalat");
		} else if (obj .equals("internet")||obj.equals("Internet")) {
			this.s = new internet_service();
			 System.err.println("Type the service you want\norange \nwe \nvodafone \netisalat");
		} else if (obj .equals("landline")||obj.equals("Landline")) {
			this.s = new landLine_service();
			 System.err.println("Type the service you want\nquarter \nmonthely");
		} else if (obj .equals("donation")||obj.equals("Donation")) {
			this.s = new donations();
			 System.err.println("Type the service you want\nschools \ncancer hospital  \nNGOs ");
		}

	}

	public String getServiceName() {
		return serviceName;
	}

	public void setwallet(int amount) {
		this.wallet = wallet+amount;
	}

	public int getwallet() {
		return wallet;
	}

	public void set_sevice_provider(String name) {
		if (name == "credit") {
			p = new credit_card();
		} else if (name == "cache") {
			this.p = new cache();
		} else if (name == "wallet") {
			this.p = new wallet_pay();
		}
	}

	public void pay() {
		if (ad.get_specific_discount() == serviceName && signup == true) {
			payment p1 = new specificDiscount(p);
			payment p2 = new overallDiscount(p1);
			p2.pay();
			signup = false;
		} else if (ad.get_specific_discount() == serviceName) {
			p = new specificDiscount(p);
			p.pay();
			
		}

		else if (signup == true) {
			signup = false;
			payment p1 = new overallDiscount(p);
			p1.pay();

		} else
			p.pay();

	}

	public void Check_Discount() {
		if (signup == true) {
			System.err.println("you have 10% discount for the first transaction");
		}

		if (ad.get_specific_discount().equals( serviceName)) {
			System.err.println("you have 20% discount for all " + serviceName);
		}
		else if(signup ==false)
			System.err.println("you don't have any discounts");
	}

	public void search() {
		System.err.println("1-Mobile Service.");
		System.err.println("2-Internet Service.");
		System.err.println("3-Landline Service.");
		System.err.println("4-Donation Service.");
		System.err.println("if you want to show any service enter its number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 1) {
			service s1 = new mobile_services();
			s1.show();
		} else if (num == 2) {
			service s1 = new internet_service();
			s1.show();
		} else if (num == 3) {
			service s1 = new landLine_service();
			s1.show();
		} else if (num == 4) {
			service s1 = new donations();
			s1.show();
		} else
			System.err.println("not valid");

	}

	public void request_refund() {
		System.err.println("enter cost :");
		Scanner sc = new Scanner(System.in);
		int refund_cost = sc.nextInt();

		ad.get_request_from_user(this.name, this.serviceName, refund_cost);

	}

}
