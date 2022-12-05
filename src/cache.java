

public class cache implements payment{
String mobile_num;
	int amount;
	public cache () {}
	public cache (String mob,int a) {
		this.amount=amount+a;
		this.mobile_num=mob;
	}
	
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(String mob,int a) {
		this.amount=amount+a;
		this.mobile_num=mob;
	}
	@Override
	public void pay() {
		
	}
	public void Withdraw_money(int money) {
		if(money<=amount)
		{int reminder=amount-money;
			System.out.println("you pay "+money+" cache the remainder of your balance ("+reminder+")");
		amount-=money;}
		else 
			System.out.println("you don't have enough money cache set it and try again ");
	}

}
