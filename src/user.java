import java.util.Scanner;

public class user extends Admin{
	public static Admin ad = Admin.getInstance();
	public service s;
	public String serviceName ;
	public String name;
	public String email;
	public String password;
	// public int wallet = 0;
	public boolean signup = false;
	public boolean signout = true;
	public boolean first_transaction = false;
	public boolean first_transaction_money = false;
	credit_card credit = new credit_card();
	cache cach = new cache();
	wallet_pay wallet = new wallet_pay();
	
	public user() {
		super();
		
	}
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

	// public credit_card credit=new credit_card(0,0);

	public payment p = credit;

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

	void signin(String name, String pass) {
		this.name = name;
		this.password = pass;
		System.err.println("Hello " + name + "\n");
		for (String i : ad.accept.keySet()) {
			int j=0;
			if(i.equals(name)) {
				if (ad.provider2.get(j).equals("credit") ) {
					credit.setAmount(ad.accept.get(i), 1);
				//	p = credit;
				} else if (ad.provider2.get(j).equals("cache") ) {
					// this.p =
					cach.setAmount("1", ad.accept.get(i));
				} else if (ad.provider2.get(j).equals("wallet")) {
					wallet.setAmount(credit,ad.accept.get(i));
				}
				ad.accept.remove(i);
				ad.provider2.remove(j);
			}
			j++;
		}

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
		s.choose(serviceObj);
	}

	void setservice(String obj) {
		this.serviceName = obj;
		if (obj.equals("mobile") || obj.equals("Mobile")) {
			this.s = new mobile_services();
			System.err.println("Type the service you want\norange \nwe \nvodafone \netisalat");
		} else if (obj.equals("internet") || obj.equals("Internet")) {
			this.s = new internet_service();
			System.err.println("Type the service you want\norange \nwe \nvodafone \netisalat");
		} else if (obj.equals("landline") || obj.equals("Landline")) {
			this.s = new landLine_service();
			System.err.println("Type the service you want\nquarter \nmonthely");
		} else if (obj.equals("donation") || obj.equals("Donation")) {
			this.s = new donations();
			System.err.println("Type the service you want\nschools \ncancer hospital  \nNGOs ");
		}

	}

	public String getServiceName() {
		return serviceName;
	}


	public void set_sevice_provider(String name) {
		System.err.println("Enter amount of the money");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		if (name == "credit") {
			System.err.println("Enter the code of the credit card");
			Scanner sc2 = new Scanner(System.in);
			int c = sc2.nextInt();
			credit.setAmount(n, c);
			p = credit;
		} else if (name == "cache") {
			System.err.println("Enter your mobile number");
			Scanner sc2 = new Scanner(System.in);
			String c = sc2.nextLine();
			// this.p =
			cach.setAmount(c, n);
		} else if (name == "wallet") {
			wallet.setAmount(credit, n);
		}
	}

	public void pay(int a, int provider) {
		if (provider == 1) {
			this.p = credit;
			credit.Withdraw_money(a);
		} else if (provider == 2) {
			this.p = cach;
			cach.Withdraw_money(a);
		} else if (provider == 3) {
			this.p = wallet;
			wallet.Withdraw_money(a);
		} else
			{System.err.println("enter 1 or 2 or 3 and try again");}
		if (ad.get_specific_discount().equals(getServiceName())  && signup == true) {
			payment p1 = new specificDiscount(p);
			payment p2 = new overallDiscount(p1);
			p2.pay();

			signup = false;
		} else if (ad.get_specific_discount().equals(getServiceName()) ) {
			payment p1 = new specificDiscount(p);
			 p1.pay();

		}

		else if (signup == true) {
			signup = false;
			payment p1 = new overallDiscount(p);
			p1.pay();
		} 
		 else
			p.pay();
		
		first_transaction = true;

	}

	public void Check_Discount() {
		if (first_transaction == false) {
			System.err.println("you have 10% discount for the first transaction");
		}
			System.err.println("you have 20% discount for all " + ad.get_specific_discount()+" service");
			
		if (first_transaction && ad.get_specific_discount().equals(serviceName) == false)
			System.err.println("you don't have any discounts for other services");
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
		System.err.println("enter cost and the service provider:");
		Scanner sc = new Scanner(System.in);
		int refund_cost = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		String provider = sc1.nextLine();
		ad.get_request_from_user(this.name, refund_cost, provider);

	}

}
