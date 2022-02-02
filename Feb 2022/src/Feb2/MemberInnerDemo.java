package Feb2;
class MemberOuter{
    private String fanme="Prathamesh";
    class MemberInner{
        String lname="Chaudhari";
        public void displayData(){
            System.out.println("Full Name is::"+fanme+" "+lname);
        }
    }
}
public class MemberInnerDemo {
    public static void main(String[] args) {
        MemberOuter obj_mo= new MemberOuter();
        MemberOuter.MemberInner obj_mi= obj_mo.new MemberInner();
        obj_mi.displayData();
    }
}
