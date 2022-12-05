import java.util.Scanner;

public class App {
   /**
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
      
      System.err.println("Welcome to our Fawry System ...");
      System.err.println("***********************************");
      System.err.println("Choose : \n1.for signUP \n2.for signIN ");
      Scanner sc=new Scanner(System.in);
      int signNUM=sc.nextInt();
      user us=new user();
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
         
         us.signUp(name, email, password);
      }
      if(signNUM==2){
         String name,password;
         System.err.println("Enter your name :");
         Scanner sc1=new Scanner(System.in);
         name=sc1.nextLine();
         System.err.println("Enter your password :");
         Scanner sc2=new Scanner(System.in);
         password=sc2.nextLine();
         
         us.signin(name, password);
      }
      System.err.println("Type the service you want \n -Mobile Service \n -Internet Service \n -Landline Servie \n -Donations service");
      Scanner sc4=new Scanner(System.in);
      String servname=sc4.nextLine();
      us.setservice(servname);
      // 2

      us.chooseService("vodafone");
      System.err.println(""); 
      
      


      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
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