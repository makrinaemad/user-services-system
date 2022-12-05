import java.util.Vector;

public class internet_service implements service {

    String service_name;
    Vector<String> internet= new Vector<String>();
    int numService=4;
    public internet_service() {
    	internet.add("vodafone");
    	internet.add("etsalat");
    	internet.add("we");
    	internet.add("orange");
    }
    @Override
    public void choose(String obj) {
        this.service_name=obj;
        for(int i=0;i<internet.size();i++) {
        	if(obj.equals(internet.get(i)))
        		System.err.println("you choose internet servics "+internet.get(i));}

        
    }
    public void show() {
     	 for (int i = 0; i < internet.size(); i++)
              System.out.println( internet.get(i)+" service" );
     }
}
