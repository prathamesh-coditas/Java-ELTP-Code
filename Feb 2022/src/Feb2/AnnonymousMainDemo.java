package Feb2;
abstract class Shape{
    abstract void area();
}
interface Animal{
    void eat();
}
public class AnnonymousMainDemo {
    public static void main(String[] args) {
        Shape shape= new Shape() {
            @Override
            void area() {
                System.out.println("I am Shape class's Annoymous way to deal with it");
            }
        };
        shape.area();

        //interface
        Animal animal= new Animal() {
            @Override
            public void eat() {
                System.out.println("I am eat method of animal Interface");
            }
        };
        animal.eat();

    }
}
