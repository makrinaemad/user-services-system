import java.util.Vector;

public class wallet_pay implements payment{
//	String user_name;
//	String pass;
	int amount_wallet=0;
	credit_card credit;
	//Vector<String> landline= new Vector<String>();
	public wallet_pay() {}
	
	public wallet_pay(credit_card c,int a) {
//		this.amount=a+amount;
//		this.pass=p;
//		this.user_name=name;
		this.credit=c;
		if(a<=credit.amount) {
			this.amount_wallet = a+amount_wallet;
			credit.amount-=a;
		}
		else
			System.out.println("you don't have enough money on your your credit set it and try again");
		
	}
//	public String getUser_name() {
//		return user_name;
//	}
//	public void setUser_name(String user_name) {
//		this.user_name = user_name;
//	}
//	public String getpass() {
//		return pass;
//	}
//	public void setpass(String p) {
//		this.pass = p;
//	}
	public int getAmount() {
		return amount_wallet;
	}
	public void setAmount(credit_card c,int a) {
		this.credit=c;
		if(a<=credit.amount) {
			this.amount_wallet = a+amount_wallet;
			credit.amount-=a;
		}
		else
			System.out.println("you don't have enough money on your your credit set it and try again");
	}
	
	@Override
	public void pay() {
		
	}
	public void Withdraw_money(int money) {
		if(money<=amount_wallet )
		{int reminder=amount_wallet-money;
			System.out.println("you pay "+money+" from your wallet the remainder of your balance ( "+reminder+")");
		amount_wallet -=money;}
		else 
			System.out.println("you don't have enough money in your wallet set it and try again");
	}
}
