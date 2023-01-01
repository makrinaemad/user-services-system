package com.Fawrey.Syetem.user_pay.user_service;
//import src.payment;
//import com.Fawrey.Syetem.user_pay.Model.discount;
public class paymentDecorator implements payment{
	 protected payment Decoratorpayment;
	 int d=0;
	    public paymentDecorator(payment Decoratorpayment)
	    {
	 
	        this.Decoratorpayment = Decoratorpayment;
	    }
	 
	    public int pay(payment Decoratorpayment) {return Decoratorpayment.pay(); }

		@Override
		public int pay() {
			// TODO Auto-generated method stub
			return d;
		}

//		@Override
//		public String Withdraw_money(int a, int cost) {
//			// TODO Auto-generated method stub
//			return null;
//		}
}
