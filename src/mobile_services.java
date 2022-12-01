public class mobile_services implements service{
    String service_name;
    //String services [] = {"vodafone","etsalat","we","orange"};
    // mobile_services(String obj){
    //     this.service_name=obj;
    // }

    @Override
    public void choose(String obj) {
        this.service_name=obj;
        if(service_name=="vodafone"){
            System.err.println("you choose mobile servics ("+service_name+")");
        }
        else if (service_name=="etsalat"){
            System.err.println(service_name);
        }
        else if  (service_name=="we"){
            System.err.println(service_name);
        }
        else if (service_name=="orange"){
            System.err.println(service_name);
        }
        else {
            System.err.println("not found ");
        }
    }
    
}
