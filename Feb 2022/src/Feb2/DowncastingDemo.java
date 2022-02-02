package Feb2;
class Parent{

}
public class DowncastingDemo extends Parent{
    public void display(){
        System.out.println("I am Display Method");
    }
    public static void show(Parent p1){
        if(p1 instanceof DowncastingDemo){
            DowncastingDemo i= (DowncastingDemo) p1;//type casting ==> downcasting
            i.display();
        }
    }
    public static void main(String[] args) {
        Parent p2= new DowncastingDemo();
        DowncastingDemo.show(p2);
    }
}
