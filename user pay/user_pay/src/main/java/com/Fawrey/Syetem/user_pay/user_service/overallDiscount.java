package com.Fawrey.Syetem.user_pay.user_service;

//import com.Fawrey.Syetem.user_pay.Model.discount;

public class overallDiscount extends paymentDecorator{
	String s=null;
	public overallDiscount (payment Decoratorpayment)
    {
        super(Decoratorpayment);
    }
 
    @Override public int pay()
    {
    	Decoratorpayment.pay();
        return setDiscount(Decoratorpayment);
    }
 
    public int setDiscount(payment Decoratorpayment)
    {   d+=10;
   // d.setMessage("10% discount for first transaction");
      // Display message whenever function is called
    	return d;
    }


}
