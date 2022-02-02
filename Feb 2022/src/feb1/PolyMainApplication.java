package feb1;

class Animal {
    public void eat() {
        System.out.println("Every Animal Eats his/her favourite food");
    }

    public void sound() {
        System.out.println("Every Animal is having their particular sound");
    }
}

class Dog extends Animal {
    int billa_no = 121;
    String name = "Rio", colour = "Brown", breed = "Labrador";

    public Dog(int billa_no, String name, String colour, String breed) {
        this.billa_no = billa_no;
        this.name = name;
        this.colour = colour;
        this.breed = breed;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog likes to eat bone as well as cookies");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barkes like bhow-bhow");
    }

    public void show_details() {
        System.out.println("Dog name is::" + name + "It is of bread::" + breed + "and its billa no is::" + billa_no);
    }
}
class Cat extends Dog{
    public Cat(int billa_no, String name, String colour, String breed) {
        super(billa_no, name, colour, breed);
        System.out.println("Cat billa no::"+billa_no+" name is::"+name+"Colour is::"+colour+" of bread "+breed);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat likes to drink milk and eat fish");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Cat makes meow meow");
    }

}

public class PolyMainApplication {
    public static void main(String[] args) {
        Animal obj_a;
        Cat obj_c = new Cat(12345,"Lucy","frown","Persion");
        obj_c.eat();
        obj_c.sound();

    }
}
