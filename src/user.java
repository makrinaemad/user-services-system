
public class user implements payment{
    service s;
    String serviceName;
    String name;
    String email;
    String password;
    int wallet=0;
    boolean signup=false;
    boolean signin=false;
    payment p= new credit_card();

    public user() {
    	 System.err.println("your balance is "+wallet);
    }
    void signin(String name, String pass){
        this.name=name;
        this.password=pass;
        System.err.println("hello sir "+name);

        
    }
    void signUp(String name, String email,String pass){
        this.name=name;
        this.email=email;
        this.password=pass;
        signup=true;
      
    }
    void chooseService(String serviceObj){
        this.serviceName=serviceObj;
        s.choose(serviceName);
    }
    void setservice(String obj){
        if(obj=="mobile"){
            this.s=new mobile_services();
        }
        else if(obj=="internet"){
            this.s=new internet_service();
        }
        else if(obj=="landline"){
            this.s=new landLine_service();
        }
        else if(obj=="donation"){
            this.s=new donations();
        }
        else {
            System.err.println("not found");
        }

    }
    public void setwallet(int amount){
    	this.wallet=amount;
    }
    public int getwallet(){
    	return wallet;
    }

	 public void set_sevice_provider(String s) {
		if(s=="credit") {
			 p= new credit_card();
		}
		else if(s=="cache") {
			p=new cache();
		}
		else if(s=="wallet") {
			p=new wallet_pay();
		}
	}
		@Override
	public void pay() {
			if(signup==false&& signin==false) {
				p.pay();
			}
			 if (signup==false){
		            signin=false;
		           p.pay();
		        }
		        else if(signup==true){
		            signin=true;
		            signup=false;
		            payment p1 = new overallDiscount(p);
		             p1.pay();
		            // p=new credit_card();
		        }
			
	}
    
}





























