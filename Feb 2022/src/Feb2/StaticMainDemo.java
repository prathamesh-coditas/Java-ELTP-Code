package Feb2;
class AnimalN{
    private String fname="Simba";
    private static String lname="Chaudhari";

    public static void eat(){
        System.out.println("Being Animal I eat");
    }
    class Reptile{
        public void show(){
            System.out.println("I am Reptile class::"+fname+" "+lname);
        }
    }
    //static==> only static data is accesible
    static class Mammal{
        //nomal method==>non static
        public void show(){
            System.out.println("I am Reptile class::"+lname);
        }
        public static void sound(){
            System.out.println("I am sound method of mammal class");
        }
    }
}

public class StaticMainDemo {
    public static void main(String[] args) {
        AnimalN obj_a= new AnimalN();
    //Create object
        AnimalN.Reptile rep= obj_a.new Reptile();
    }
}
