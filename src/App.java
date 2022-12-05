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
     while(true) { System.err.println("Welcome to our Fawry System ...");
      System.err.println("***********************************");
      System.err.println("Choose : \n1.for signUP \n2.for signIN ");
      Scanner sc=new Scanner(System.in);
      int signNUM=sc.nextInt();
      
     // user us=new user();
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
         for(int i=0;i<us.size();i++) {
        	 if(name.equals( us.get(i).getName())&&password.equals(us.get(i).getPassword())) {
        		 us.get(i).signin(name, password);
        	 }
        	 else  {
        		 System.err.println("The name or the password is incorrect");
        	 }
       //  us.signin(name, password);
      }}
      while(us.get(num_us).isSignout()) {
         System.err.println("\nEnter the number of what you want..\n1-Search\n2-Choose Service to pay\n3-Check Discount\n4-Ask for refund\n5-Add money in the wallet \n6-show wallet money \n7-sign out ");
         Scanner sc4=new Scanner(System.in);
         String num=sc4.nextLine();
         if(num.equals("1")) {
        	 us.get(num_us).search();
         }
         else if(num.equals("2")) {
        	// us.get(num_us).search();
           System.err.println("Type the service you want \n -Mobile \n -Internet \n -Landline  \n -Donation ");
           Scanner sc40=new Scanner(System.in);
           String servname=sc40.nextLine();
           us.get(num_us).setservice(servname);
           Scanner sc5=new Scanner(System.in);
           String serv=sc5.nextLine();
           us.get(num_us).chooseService(serv);
           us.get(num_us).pay();
         }
         else if(num.equals("3")) {
        	 us.get(num_us).Check_Discount();
         }
         else if(num.equals("4")) {
        	 us.get(num_us).request_refund();;
         }
         else if(num.equals("5")) {
        	 System.err.println("Enter amount of the money");
        	 Scanner sc1 = new Scanner(System.in);
     		int n = sc1.nextInt();
        	 us.get(num_us).setwallet(n);
         }
         else if(num.equals("6")) {
        	 System.err.println("Your balance is "+us.get(num_us).getwallet());
         }
         else if(num.equals("7")) {
        	 us.get(num_us).setSignout(false);;
         }
         else
        	 System.err.println("not valid");}
      us.get(num_us).setSignout(true);  
      System.err.println("if you want end the application enter 0 \n"
      		+ "else enter 1");
      Scanner sc1 = new Scanner(System.in);
		int end = sc1.nextInt();
		if(end==0)
			break;
		else
			continue;
     
     }
//      System.err.println("Type the service you want \n -Mobile Service \n -Internet Service \n -Landline Servie \n -Donations service");
//      Scanner sc4=new Scanner(System.in);
//      String servname=sc4.nextLine();
//      us.setservice(servname);
//      // 2
//
//      us.chooseService("vodafone");
//      System.err.println(""); 
      
      


      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   //    String x = "mobile";

   //    Admin ad = Admin.getInstance();

   //    user us1 = new user();
   //    us1.signUp("yahia", "yahia@", "123");
   //    us1.set_sevice_provider("wallet");
   //    us1.signin("yahia", "123");
   //    us1.setservice(x);
   //    us1.chooseService("vodafone");
   //    us1.signin("yahia", "123");
   //    us1.pay();
   //    us1.setwallet(5);
   //    System.err.println("your balance is " + us1.getwallet());
   //    us1.signin("yahia", "123");
   //    us1.pay();
   //    us1.request_refund();

   //    ad.make_specific_discount("donation");
   //    user us2 = new user();

   //    us2.signUp("Eman", "Eman@yahoo.com", "1234");
   //    us2.set_sevice_provider("wallet");
   //    us2.signin("Eman", "1234");
   //    us2.setservice("donation");
   //    us2.chooseService("donation");
   //    us2.signin("Eman", "1234");
   //    us2.Check_Discount();
   //    us2.pay();
   //    us2.setwallet(5);
   //    System.err.println("your balance is " + us2.getwallet());
   //    us2.signin("Eman", "1234");
   //    us2.pay();
   //    us2.request_refund();

   //    ad.request_list();
   //    us2.search();

   // }
}
}