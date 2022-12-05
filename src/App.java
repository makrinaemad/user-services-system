import java.util.Scanner;
import java.util.Vector;

public class App {
   /**
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
	   Vector<user>  us = new Vector<user>();
	   user u =new user();
	   int num_us=0;
     while(true) {
    	 System.err.println("Enter 1 or 2\nAdmin or User");
    	 Scanner sc100 = new Scanner(System.in);
  		int a = sc100.nextInt();
  		if(a==1) {
  			
  		}
  		else {
    	 System.err.println("Welcome to our Fawry System ...");
      System.err.println("***********************************");
      System.err.println("Choose : \n1.for signUP \n2.for signIN ");
      Scanner sc=new Scanner(System.in);
      int signNUM=sc.nextInt();
      
      if(signNUM==1){
         String name,email,password;
         System.err.println("Enter your name :");
         Scanner sc1=new Scanner(System.in);
         name=sc1.nextLine();
         System.err.println("Enter your email :");
         Scanner sc2=new Scanner(System.in);
         email=sc2.nextLine();
         System.err.println("Enter your password :");
         Scanner sc3=new Scanner(System.in);
         password=sc3.nextLine();
         boolean sign=false;
         for(int i=0;i<us.size();i++) {
        	 if(name.equals( us.get(i).getName())) {
        		 System.err.println("the name already exist");
        	 }
        	 else if(email.equals(us.get(i).getEmail())) {
        		 System.err.println("the Email already exist");
        	 }
        	 else
        	 { sign=true;
        	 num_us++;
        	 }
         }
         if(sign||num_us==0)
         {us.add(u);
        	 us.get(num_us).signUp(name, email, password);
         System.err.println("for sign in\nEnter your name :");
         Scanner sc10=new Scanner(System.in);
         name=sc10.nextLine();
         System.err.println("Enter your password :");
         Scanner sc20=new Scanner(System.in);
         password=sc20.nextLine();
         for(int i=0;i<us.size();i++) {
        	 if(name.equals( us.get(i).getName())&&password.equals(us.get(i).getPassword())) {
        		 us.get(i).signin(name, password);
        	 }
        	 else  {
        		 System.err.println("The name or the password is incorrect");
        	 }}
      }}
      else if(signNUM==2){
         String name,password;
         System.err.println("Enter your name :");
         Scanner sc1=new Scanner(System.in);
         name=sc1.nextLine();
         System.err.println("Enter your password :");
         Scanner sc2=new Scanner(System.in);
         password=sc2.nextLine();
         if(us.size()==0)
        	 System.err.println("The name or the password is incorrect");
         boolean correct=false;
         for(int i=0;i<us.size();i++) {
        	 if(name.equals( us.get(i).getName())&&password.equals(us.get(i).getPassword())) {
        		 us.get(i).signin(name, password);
        		 correct=true;
        	 }
        	 if(i==us.size()-1&&correct==false)  {
        		 System.err.println("The name or the password is incorrect");
        	 }
      }}
      else
    	  System.err.println("Enter 1 or 2");
      while(us.get(num_us).isSignout()) {
         System.err.println("\nEnter the number of what you want..\n1-Search\n2-Choose Service to pay\n3-Check Discount\n4-Ask for refund\n5-Add money in the wallet \n6-Set credit card or Cache payment  \n7-sign out ");
         Scanner sc4=new Scanner(System.in);
         String num=sc4.nextLine();
         if(num.equals("1")) {
        	 us.get(num_us).search();
         }
         else if(num.equals("2")) {
           System.err.println("Type the service you want \n -Mobile \n -Internet \n -Landline  \n -Donation ");
           Scanner sc40=new Scanner(System.in);
           String servname=sc40.nextLine();
           us.get(num_us).setservice(servname);
           Scanner sc5=new Scanner(System.in);
           String serv=sc5.nextLine();
           us.get(num_us).chooseService(serv);
           System.err.println("Enter \n1-for(credit) \n2-for (cache) \n3-for (withdraw from your wallet)");
           Scanner sc11=new Scanner(System.in);
           int no=sc11.nextInt();
           System.err.println("Enter the amount");
           Scanner sc0=new Scanner(System.in);
           int money=sc0.nextInt();
        	   us.get(num_us).pay(money,no);
         }
         else if(num.equals("3")) {
        	 us.get(num_us).Check_Discount();
         }
         else if(num.equals("4")) {
        	 us.get(num_us).request_refund();;
         }
         else if(num.equals("5")) {

        	 us.get(num_us).set_sevice_provider("wallet");
         }
        else if(num.equals("6")) {
         System.err.println("Enter 1 or 2 to set");
         Scanner sc11=new Scanner(System.in);
         int m=sc11.nextInt();
         if(m==1) {
        	 us.get(num_us).set_sevice_provider("credit");
         }
         else if(m==2) {
        	 us.get(num_us).set_sevice_provider("cache");
         }
         else {System.err.println("not valid");}
        }
         else if(num.equals("7")) {
        	 us.get(num_us).setSignout(false);;
         }
         else
        	 System.err.println("not valid");}
      us.get(num_us).setSignout(true);  }
      
      
      System.err.println("if you want end the application enter 0 \n"
      		+ "else enter 1");
      Scanner sc1 = new Scanner(System.in);
		int end = sc1.nextInt();
		if(end==0)
			break;
		else
			continue;
     
     }
      
     
}
}