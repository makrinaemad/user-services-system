//import src.payment;

public class paymentDecorator implements payment{
	 protected payment Decoratorpayment;
	 
	    // Method 1
	    // Abstract class method
	    public paymentDecorator(payment Decoratorpayment)
	    {
	        // This keywordd refers to current object itself
	        this.Decoratorpayment = Decoratorpayment;
	    }
	 
	    // Method 2 - draw()
	    // Outside abstract class
	    public void pay() { Decoratorpayment.pay(); }
}
