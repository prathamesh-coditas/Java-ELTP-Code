package feb1;

class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public double getArea() {
        System.out.println("Invalid");
        return 0;
    }
}

class Rectangle extends Shape {
    private int length, width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private int base, height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape obj_1;
        Triangle t1 = new Triangle("Green", 10, 5);
        System.out.println(t1);
        System.out.println("Area of triangle is:: " + t1.getArea());
        Rectangle r1 = new Rectangle("Red", 5, 6);
        System.out.println(r1);
        System.out.println("Area of Rectangle is:: " + r1.getArea());

    }
}
