public class donations implements service {

    String donation_name;
   // String services [] = {"schools","cancer hospital","NGO"};
    // donations(String obj){
    //     this.donation_name=obj;

    // }
    @Override
    public void choose(String obj) {
        this.donation_name=obj;
        if(donation_name=="schools"){
            System.err.println(donation_name);
        }
        else if (donation_name=="cancer hospital"){
            System.err.println(donation_name);
        }
        else if (donation_name=="NGO"){
            System.err.println(donation_name);
        }
        else {
            System.err.println("not found ");
        }
        
    }
    
}