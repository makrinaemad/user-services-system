public class landLine_service implements service {

    String service_name;
    // landLine_service(String obj){
    //     this.service_name=obj;
    // }
   // String services [] = {"monthely","quarter"};
    @Override
    public void choose(String obj) {
        this.service_name=obj;
        if(service_name=="quarter"){
            System.err.println(service_name);
        }
        else if (service_name=="monthely"){
            System.err.println(service_name);
        }
        else {
            System.err.println("not found ");
        }
        
        
    }
    
}
