package com.prathamesh.jan28;

import com.sun.javaws.IconUtil;

class Shape {
    float area;

    public void calculate_area() {
        System.out.println("Shape are is::" + area);
    }
}

class Circle extends Shape {
    float r = 2f, area_circle = 0.0f;

    @Override
    public void calculate_area() {
        //super.calculate_area();
        area_circle = (float) (Math.PI * r * r);
        System.out.println("Area of Circle is::"+area_circle);

    }
}
class Rectangle extends Shape{
    int l=2,b=5,area_rectangle=0;

    @Override
    public void calculate_area() {
        super.calculate_area();
        area_rectangle=l*b;
        System.out.println("Area of Rectangle is::"+area_rectangle);
    }
}

public class MainApplication {
    public static void main(String[] args) {
        //way 1
        //specific object
        Shape obj_s= new Shape();
        obj_s.calculate_area();

        //specific object
        Circle obj_c= new Circle();
        obj_c.calculate_area();
        System.out.println("**************");
        Shape obj_s1= new Circle();
        //way 3

        Shape obj_s2;//polymorphic variable
        obj_s2=new Circle();
        obj_s2.calculate_area();

        obj_s2=new Rectangle();
        obj_s2.calculate_area();

        //way 4

    }
}
