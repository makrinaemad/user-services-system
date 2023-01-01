package com.Fawrey.Syetem.user_pay.user_service;
import java.util.ArrayList;
import java.util.Vector;

public class mobile_services implements service {
    String service_name;
    public ArrayList<String> mobile = new ArrayList<String>();
    int numService = 4;

    public mobile_services() {
        mobile.add("vodafone");
        mobile.add("etsalat");
        mobile.add("we");
        mobile.add("orange");
    }

    @Override
    public String choose(String obj) {
        // this.service_name=obj;
    	String str=null;
        for (int i = 0; i < mobile.size(); i++) {
            if (obj.equals(mobile.get(i)))
                str=mobile.get(i);
        }
        
        return "you choose moblle service :"+str;
    }

    public  ArrayList<String>  show() {
       return mobile;
}
}
