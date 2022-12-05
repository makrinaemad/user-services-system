import java.util.Vector;

public class landLine_service implements service {

    String service_name;
    Vector<String> landline= new Vector<String>();
    int numService=2;
    public landLine_service() {
    	landline.add("quarter");
    	landline.add("monthely");
    }
    @Override
    public void choose(String obj) {
        this.service_name=obj;
        for(int i=0;i<landline.size();i++) {
        	if(obj.equals(landline.get(i)))
        		System.err.println("you choose landline servics "+landline.get(i));
        
    }}

    public void show() {
      	 for (int i = 0; i <landline.size(); i++)
               System.out.println(landline.get(i)+" service" );
      }
}
