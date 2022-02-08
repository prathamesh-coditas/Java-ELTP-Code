package session15CE;

public class Test {
    public static void main(String args[]){
        RegisterUser obj_r=new RegisterUser();

        try{
            obj_r.validate(15,"Indan");
        }
        catch (InvalidAgeException e){
            System.out.println("Invalidage Exception occurred::"+e.getMessage());
        }
        catch (InvalidCitizenshipException e){
            e.getMessage();
        }
    }
}
