package com.Fawrey.Syetem.user_pay.user_service;
import java.util.ArrayList;
import java.util.Vector;

public class landLine_service implements service {

    String service_name;
    ArrayList<String> landline= new ArrayList<String>();
    int numService=2;
    public landLine_service() {
    	landline.add("quarter");
    	landline.add("monthely");
    }
    @Override
    public String  choose(String obj) {
        this.service_name=obj;
        String str=null;
        for(int i=0;i<landline.size();i++) {
        	if(obj.equals(landline.get(i)))
        		str=landline.get(i);
        }
        return "you choose landline service :"+str;
    }

    public  ArrayList<String> show() {
      	return landline;
}
}
