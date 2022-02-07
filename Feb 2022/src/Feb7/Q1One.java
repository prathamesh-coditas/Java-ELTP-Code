package Feb7;
class Create1{
}
class Make1 extends Create1{
}
public class Q1One {
    public static void main(String[] args) {
        try {
            Create1 c1=new Create1();
            Make1 m1= (Make1)c1;

            // Object class is parent class of every class
            // Hence exception doesn't occur.
            System.out.println(m1);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
