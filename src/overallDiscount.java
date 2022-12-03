

public class overallDiscount extends paymentDecorator{
	public overallDiscount (payment Decoratorpayment)
    {
        super(Decoratorpayment);
    }
 
    @Override public void pay()
    {
    	Decoratorpayment.pay();
        setDiscount(Decoratorpayment);
    }
 
    public void setDiscount(payment Decoratorpayment)
    {
      // Display message whenever function is called
        System.out.println("10% discount for first transaction");
    }

}
