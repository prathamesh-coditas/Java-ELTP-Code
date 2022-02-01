package com.prathamesh.jan31;

abstract class Shape {
    public abstract void area();
}

class Circle extends Shape {
    @Override
    public void area() {
        float r = 3.5f;
        System.out.println("Area of Circle:: " + Math.PI * r * r);
    }
}

class Square extends Shape {
    @Override
    public void area() {
        float side = 4.0f;
        System.out.println("Area of Square:: " + 4 * side);
    }
}

class Cylinder extends Circle {
    @Override
    public void area() {
        float height = 3.0f;
        float r = 4.0f;
        double area = 2 * Math.PI * r * height + 2 * Math.PI * r;
        System.out.println("Area of Cylinder::" + area);
    }
}

class Rectangle extends Square {
    @Override
    public void area() {
        float length = 4.8f;
        float bradth = 3.2f;
        double area = length * bradth;
        System.out.println("Area of Rectangle::" + area);

    }
}

public class Q4 {
    public static void main(String[] args) {
        Shape s_test[] = new Shape[4];
        s_test[0] = new Square();
        s_test[1] = new Circle();
        s_test[2] = new Cylinder();
        s_test[3] = new Rectangle();
        for(int i=0;i<4;i++){
            s_test[i].area();
        }
    }
}