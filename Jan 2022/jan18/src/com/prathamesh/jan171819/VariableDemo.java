package com.prathamesh.jan171819;
/*Program Types of varibles and their uses
* local varible ==> mandatory to intialize and not able to access using an ibject
*
* */
class Student{
    //instance varible
    String address;
    //static Varible
    static float percentage =88.5f;

    public void displayData() {
        int rno=56;
        String name="Prathamesh";
        System.out.println("Student Details are::");
        System.out.println("Roll Number is:: "+rno+" name is::"+name);
        System.out.println("Address is:: "+address);
        System.out.println("Percetnage are:: "+ percentage);
    }
}
public class VariableDemo {

      public static void main(String[] args) {
        System.out.println("Variable Demo");
        Student obj_s=new Student();
        obj_s.displayData();
        obj_s.address="Pune";
        Student.percentage++;
        obj_s.displayData();


    }
}
