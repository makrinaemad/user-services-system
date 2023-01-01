package com.Fawrey.Syetem.user_pay.user_service;
import java.io.*;
import java.util.*;
public class donations implements service {

    String donation_name;
    ArrayList<String>  donation = new ArrayList<String>();
    int numService=3;
    
    public donations() {
    	donation.add("schools");
    	donation.add("cancer hospital");
    	donation.add("NGOs");
    }
    @Override
    public String choose(String obj) {
        this.donation_name=obj;
        String str =null;
        for(int i=0;i<donation.size();i++) {
        	if(obj.equals(donation.get(i)))
        		{
        		str=donation.get(i);
        		}
        }
        return "you choose donations service :"+str ;
   }
    public ArrayList<String>  show() {
    	return donation;
    
}
}
