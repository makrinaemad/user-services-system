public class App {
    public static void main(String[] args) throws Exception {
       String x="mobile";
        user us1=new user();
        us1.signUp("yahia", "yahia@", "123");
        us1.signin("yahia","123");
        us1.setservice(x);
        us1.chooseService("vodafone");
        us1.signin("yahia","123");
        
        
    }
}
