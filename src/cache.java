

public class cache implements payment{
String mobile_num;
	int amount;
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void pay() {
		System.out.println("cache payment");
		
	}

}
