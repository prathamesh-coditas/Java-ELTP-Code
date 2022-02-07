package Feb7;

class Car {
}

class Hatchback extends Car {
}

class Suv extends Car {
}

public class Q1 {
    public static void main(String[] args) {
        try {
            Car c1 = new Hatchback();
            Hatchback h1 = (Hatchback) c1;
            Car c2 = new Suv();
            Hatchback h2 = (Hatchback) c2;
        } catch (ClassCastException e) {
            System.err.println("Exception_Caught!");
            e.printStackTrace();
        }
    }
}
