

public class credit_card implements payment{
	String mobile_num;
	int card_code;
	int amount=0;
	
	public  credit_card() {};
	public credit_card(int a,int code ) {
		this.amount=amount+a;
		this.card_code=code;
	}
	@Override
	public void pay() {}
	public void Withdraw_money(int money) {
		if(money<=amount)
			
		{
			int reminder=amount-money;
			System.out.println("you pay "+money+" via credit card the remainder of your balance ("+reminder+")");
		amount-=money;}
		else 
			System.out.println("you don't have enough money via credit card set it and try again");
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public int getCard_code() {
		return card_code;
	}
	public void setCard_code(int card_code) {
		this.card_code = card_code;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int a,int code) {
		this.amount=amount+a;
		this.card_code=code;
	}

}
