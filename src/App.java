public class App {
    public static void main(String[] args) throws Exception {
       String x="mobile";
        user us1=new user();
        us1.signUp("yahia", "yahia@", "123");
      //  us1.set_sevice_provider("wallet");
        us1.signin("yahia","123");     
        us1.setservice(x);
        us1.chooseService("vodafone");
        us1.signin("yahia","123");
        us1.pay();
        us1.setwallet(5);
        System.err.println("your balance is "+us1.getwallet());
        us1.signin("yahia","123");
        us1.pay();
        
        user us2=new user();
        us2.signUp("y", "ya", "12");
          us2.set_sevice_provider("wallet");
          us2.signin("y","12");     
          us2.setservice(x);
          us2.chooseService("we");
          us2.signin("y","12");
          us2.pay();
          us2.setwallet(5);
          System.err.println("your balance is "+us1.getwallet());
          us2.signin("y","12");
          us2.pay();
        
    }
}
