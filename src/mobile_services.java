import java.util.Vector;

public class mobile_services implements service{
    String service_name;
    Vector<String> mobile= new Vector<String>();
    int numService=4;
    public mobile_services() {
    	mobile.add("vodafone");
    	mobile.add("etsalat");
    	mobile.add("we");
    	mobile.add("orange");
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
        else {
        	 System.err.println("you choose mobile servics ("+service_name+")");
        }
    }
    public void show() {
   	 for (int i = 0; i <mobile.size(); i++)
            System.out.println(mobile.get(i)+" service" );
   }
    
}
