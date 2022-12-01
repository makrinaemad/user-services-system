public class internet_service implements service {

    String service_name;
    // internet_service(String obj){
    //     this.service_name=obj;
    // }
   // String services [] = {"vodafone","etsalat","we","orange"};
    @Override
    public void choose(String obj) {
        this.service_name=obj;
        if(service_name=="vodafone"){
            System.err.println(service_name);
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
