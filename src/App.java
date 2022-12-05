public class App {
   public static void main(String[] args) throws Exception {
      String x = "mobile";

      Admin ad = Admin.getInstance();

      user us1 = new user();
      us1.signUp("yahia", "yahia@", "123");
      us1.set_sevice_provider("wallet");
      us1.signin("yahia", "123");
      us1.setservice(x);
      us1.chooseService("vodafone");
      us1.signin("yahia", "123");
      us1.pay();
      us1.setwallet(5);
      System.err.println("your balance is " + us1.getwallet());
      us1.signin("yahia", "123");
      us1.pay();
      us1.request_refund();

      ad.make_specific_discount("donation");
      user us2 = new user();

      us2.signUp("Eman", "Eman@yahoo.com", "1234");
      us2.set_sevice_provider("wallet");
      us2.signin("Eman", "1234");
      us2.setservice("donation");
      us2.chooseService("donation");
      us2.signin("Eman", "1234");
      us2.Check_Discount();
      us2.pay();
      us2.setwallet(5);
      System.err.println("your balance is " + us2.getwallet());
      us2.signin("Eman", "1234");
      us2.pay();
      us2.request_refund();

      ad.request_list();
      us2.search();

   }
}
