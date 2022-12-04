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
        if(service_name=="vodafone"){
        	 System.err.println("you choose mobile servics ("+service_name+")");
        }
        else if (service_name=="etsalat"){
        	 System.err.println("you choose mobile servics ("+service_name+")");
        }
        else if  (service_name=="we"){
        	 System.err.println("you choose mobile servics ("+service_name+")");
        }
        else if (service_name=="orange"){
        	 System.err.println("you choose mobile servics ("+service_name+")");
        }

        
    }
    public void show() {
     	 for (int i = 0; i < internet.size(); i++)
              System.out.println( internet.get(i)+" service" );
     }
}
