package Feb21;
//FUNCTIONAL INTERFACE

@FunctionalInterface
interface FunctionalInterfaceOne{
    //abstract method
    void abstractFunction(int x);

    //DEFAULT
    default void add(){
        System.out.println("Default Add method");
    }

    //STATIC
    static void sub(){
        System.out.println("Static sub method");
    }
}

public class LambdaDemo {
    public static void main(String args[]){

        FunctionalInterfaceOne ref_f=(int x)-> System.out.println(10 * x);
        ref_f.abstractFunction(12);
        ref_f.add();
        FunctionalInterfaceOne.sub();
    }
}