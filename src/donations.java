import java.io.*;
import java.util.*;
public class donations implements service {

    String donation_name;
    Vector<String>  donation = new Vector<String>();
    int numService=3;
    
    public donations() {
    	donation.add("schools");
    	donation.add("cancer hospital");
    	donation.add("NGO");
    }
    @Override
    public void choose(String obj) {
        this.donation_name=obj;
        if(donation_name=="schools"){
            System.err.println(donation.get(0));
        }
        else if (donation_name=="cancer hospital"){
            System.err.println(donation.get(1));
        }
        else if (donation_name=="NGO"){
            System.err.println(donation.get(2));
        }
//        else {
//            System.err.println("not found ");
//        }
        
    }
    public void show() {
    	 for (int i = 0; i <donation.size(); i++)
             System.out.println(donation.get(i)+" service" );
    }
    
}
