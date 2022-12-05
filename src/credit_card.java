

public class credit_card implements payment{
	String mobile_num;
	int card_code;
	int amount;
	@Override
	public void pay() {
		System.out.println("via credit card");
		
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
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
