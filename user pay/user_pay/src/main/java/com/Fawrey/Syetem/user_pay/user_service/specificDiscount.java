package com.Fawrey.Syetem.user_pay.user_service;

import com.Fawrey.Syetem.user_pay.Model.Admin;
//import com.Fawrey.Syetem.user_pay.Model.discount;
public class specificDiscount extends paymentDecorator{
	String s=null;
	public static Admin ad = Admin.getInstance();
	public specificDiscount  (payment Decoratorpayment)
    {
        super(Decoratorpayment);
    }
	
    @Override public int pay()
    {
    	Decoratorpayment.pay();
        return setDiscount (Decoratorpayment);
    }
 
    private int setDiscount(payment Decoratorpayment)
    {;
    d+=20;
    //d.setMessage("20% discount ");
     return d;
        //System.out.println("20% discount ");
        
    }
    public void make_specific_discount(String n) {
		ad.setService(n); 

	}

	public String get_specific_discount() {

		return ad.getService();
	}
    
}
