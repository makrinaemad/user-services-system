

public class specificDiscount extends paymentDecorator{
	public specificDiscount  (payment Decoratorpayment)
    {
        super(Decoratorpayment);
    }
 
    @Override public void pay()
    {
    	Decoratorpayment.pay();
        setDiscount(Decoratorpayment);
    }
 
    private void setDiscount(payment Decoratorpayment)
    {
      // Display message whenever function is called
        System.out.println("20% discount ");
        
    }
}
