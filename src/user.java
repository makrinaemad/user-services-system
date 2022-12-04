import java.util.Scanner;
public class user {
    public service s;
   public String serviceName;
    public String name;
    public String email;
    public String password;
    public int wallet=0;
    public boolean signup=false;
  
    public  payment p= new credit_card();
    public Admin Admn=new Admin();
    
    public user(Admin a) {
    	 this.Admn=a;
    }
    void signin(String name, String pass){
        this.name=name;
        this.password=pass;
        System.err.println("hello "+name);

        
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

    }

   
    public void setwallet(int amount){
    	this.wallet=amount;
    }
    public int getwallet(){
    	return wallet;
    }

	 public void set_sevice_provider(String name) {
		if(name=="credit") {
			 p= new credit_card();
		}
		else if(name=="cache") {
			this.p=new cache();
		}
		else if(name=="wallet") {
			this.p=new wallet_pay();
		}
	}
		
	public void pay() {
		if(Admn.get_specific_discount()==serviceName&&signup==true) {
			 payment p1 = new specificDiscount(p);
			 payment p2 = new overallDiscount(p1);
             p2.pay();
             signup=false;
		}
		else if(Admn.get_specific_discount()==serviceName) {
			 p= new specificDiscount(p);
             p.pay();
		}

		else if(signup==true){
		            signup=false;
		            payment p1 = new overallDiscount(p);
		             p1.pay();
		         
		        }
		        	else 
		        		p.pay();
			 
			
	}
	public void Check_Discount() {
		if(signup==true){
			 System.err.println("you have 10% discount for the first transaction");
		}
		
		if(Admn.get_specific_discount()==serviceName) {
			System.err.println("you have 20% discount for all "+serviceName);
		}
	}
	
	public void search() {
		System.err.println("1-Mobile Service.");
		System.err.println("2-Internet Service.");
		System.err.println("3-Landline Service.");
		System.err.println("4-Donation Service.");
		System.err.println("if you want to choose any service enter its number");
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         
        if(num==1) 
        	{service s1=new mobile_services(); 
        	s1.show();
        	}
        else if(num==2)
        	{service s1=new internet_service();
        	s1.show();
        	}
        else if(num==3) {
        	service  s1=new landLine_service();
        	s1.show();
        	}
        else if(num==4)
        	{service s1=new donations();
        	s1.show();}
        else
        	System.err.println("not valid");
		
	}
	

}





























