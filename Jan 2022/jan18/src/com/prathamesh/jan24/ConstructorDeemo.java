package com.prathamesh.jan24;

class Student {
    int rno;
    String name;
    float percentage;

    Student() {
        System.out.println("It is Default Constructor");
        System.out.println(rno);
        System.out.println(name);
        System.out.println(percentage);
    }

    Student(int rno, String name, float percentage) {
        this.rno = rno;
        this.name = name;
        this.percentage = percentage;
    }

    public void displayStudentData() {
        System.out.print(rno + " ");
        System.out.print(name + " ");
        System.out.print(percentage + " ");
    }
}

public class ConstructorDeemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(21, "Prathamesh", 89.5f);
        System.out.println(s2.rno + " " + s2.name + " " + s2.percentage);
        //s2.displayStudentData();
        s1.rno = 22;
        s1.name = "Rutuja";
        s1.percentage = 99.4f;
        s1.displayStudentData();

    }
}
