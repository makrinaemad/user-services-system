
public class user {
    service s;
    String serviceName;
    String name;
    String email;
    String password;
    boolean signup=false;
    boolean signin=false;
    void signin(String name, String pass){
        this.name=name;
        this.password=pass;
        System.err.println("hello sir "+name);
        if (signup==false){
            signin=false;
        }
        else if(signup==true){
            signin=true;
            signup=false;
            System.err.println("discount here ");
        }
        
    }
    void signUp(String name, String email,String pass){
        this.name=name;
        this.email=email;
        this.password=pass;
        signup=true;
    }
    void chooseService(String serviceObj){
        this.serviceName=serviceObj;
        s.choose(serviceName);
    }
    void setservice(String obj){
        if(obj=="mobile"){
            this.s=new mobile_services();
        }
        else if(obj=="internet"){
            this.s=new internet_service();
        }
        else if(obj=="landline"){
            this.s=new landLine_service();
        }
        else if(obj=="donation"){
            this.s=new donations();
        }
        else {
            System.err.println("not found");
        }

    }
    
}





























