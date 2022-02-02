package Feb1Assingment;

class Shape {
    void calculateArea(int length, int breath){
        System.out.println("The area of Rectangle is "+(length*breath));
    }
    void calculateArea(double base , double height){
        System.out.println("The area of Triangle is "+(0.5*base*height));
    }
    void calculateArea(int radius){
        System.out.println("The area of Circle is "+(Math.PI*radius*radius));
    }
}

public class Q2 {
    public static void main(String[] args) {
    Shape s1= new Shape();
    s1.calculateArea(5);
    s1.calculateArea(5,10);
    s1.calculateArea(10d,5d);
    }

}
