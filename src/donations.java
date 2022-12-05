import java.io.*;
import java.util.*;
public class donations implements service {

    String donation_name;
    Vector<String>  donation = new Vector<String>();
    int numService=3;
    
    public donations() {
    	donation.add("schools");
    	donation.add("cancer hospital");
    	donation.add("NGOs");
    }
    @Override
    public void choose(String obj) {
        this.donation_name=obj;
        for(int i=0;i<donation.size();i++) {
        	if(obj.equals(donation.get(i)))
        		System.err.println("you choose donation servics "+donation.get(i));}
        
    }
    public void show() {
    	 for (int i = 0; i <donation.size(); i++)
             System.out.println(donation.get(i)+" service" );
    }
    
}
