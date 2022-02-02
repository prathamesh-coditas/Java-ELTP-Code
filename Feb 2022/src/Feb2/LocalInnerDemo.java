package Feb2;
class LOuter{
    int rno=5;
    public void show(){
        System.out.println("Show of LOuter");
    }
    public void display(){
        //Local Variable
        String name="Local Inner Class";
        //Local inner class
        class LInner{
            void msg(){
                System.out.println("Name is::"+name+" With Roll Number::"+rno);
            }
        }
        LInner obj_l= new LInner();
        obj_l.msg();
    }
}
public class LocalInnerDemo {
    public static void main(String[] args) {
        LOuter obj_Lo= new LOuter();
        obj_Lo.display();
    }
}
