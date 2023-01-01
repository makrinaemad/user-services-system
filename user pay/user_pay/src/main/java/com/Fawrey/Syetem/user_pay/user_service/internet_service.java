package com.Fawrey.Syetem.user_pay.user_service;
import java.util.ArrayList;
import java.util.Vector;

public class internet_service implements service {

    String service_name;
     ArrayList<String> internet= new ArrayList<String>();
    int numService=4;
    public internet_service() {
    	internet.add("vodafone");
    	internet.add("etsalat");
    	internet.add("we");
    	internet.add("orange");
    }
    @Override
    public String choose(String obj) {
        this.service_name=obj;
        String str = null;
        for(int i=0;i<internet.size();i++) {
        	if(obj.equals(internet.get(i)))
        		str =internet.get(i);
        }
		return "you choose internet service :"+str;
        
    }
    public ArrayList<String>  show() {
     	 return internet;
}
}
