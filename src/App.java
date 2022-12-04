public class App {
    public static void main(String[] args) throws Exception {
       String x="mobile";
       Admin a =new Admin();
       // user us1=new user(a);
      
//        us1.signUp("yahia", "yahia@", "123");
//      //  us1.set_sevice_provider("wallet");
//        us1.signin("yahia","123");     
//        us1.setservice(x);
//        us1.chooseService("vodafone");
//        us1.signin("yahia","123");
//        us1.pay();
//        us1.setwallet(5);
//        System.err.println("your balance is "+us1.getwallet());
//        us1.signin("yahia","123");
//        us1.pay();
        a.make_specific_discount("donation");
        user us2=new user(a);
        
        us2.signUp("y", "ya", "12");
          us2.set_sevice_provider("wallet");
          us2.signin("y","12");     
          us2.setservice("donation");
          us2.chooseService("donation");
          us2.signin("y","12");
          us2.Check_Discount();
          us2.pay();
          us2.setwallet(5);
          System.err.println("your balance is "+us2.getwallet());
          us2.signin("y","12");
          us2.pay();
       us2.search();
         // a.check_discount(us2);
         // us2.pay();
         // us2.Check_Discount();
        
    }
}
