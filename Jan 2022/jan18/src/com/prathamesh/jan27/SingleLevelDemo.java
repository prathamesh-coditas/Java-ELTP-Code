package com.prathamesh.jan27;
class Parent{
    int aadhar_card=12345;
    String name="Prathamesh";
    public void displayData(){
        System.out.println("Display parent details::"+aadhar_card+ " Name::"+name);
    }
}
class Child extends Parent{
    int pan_id=56767; //own data
    String name="Chaudhari";
    public void displayData(){

        super.displayData();

        System.out.println("Display child details::"+pan_id+" Name:"+name);
        System.out.println("Aadhar Card::"+aadhar_card);
    }
}
public class SingleLevelDemo {
    public static void main(String[] args) {
    Child c1= new Child();
    c1.aadhar_card=1234;
    c1.pan_id=5678;
    c1.name="Prathamesh";
    c1.displayData();
    c1.aadhar_card=5365;
    }
}
