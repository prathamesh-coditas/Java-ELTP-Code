package com.prathamesh.jan31;
abstract class Vehical{
    public abstract void engine();
}
class Car extends Vehical{
    @Override
    public void engine() {
        System.out.println("Car has good engine");
    }
}
class Truck extends Vehical{
    @Override
    public void engine() {
        System.out.println("Truck has bad engine");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Vehical obj_c;
        obj_c=new Car();
        obj_c.engine();
        obj_c=new Truck();
        obj_c.engine();
    }
}
