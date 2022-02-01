package com.prathamesh.jan28;

import java.util.Scanner;

class Dob {
    int date;
    int month;
    int year;

    public Dob() {

    }

    public Dob(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date of Birth: " + date +
                "/" + month +
                "/" + year;
    }
}

class Emplo_yee {
    int e_id;
    String name;
    int salary;
    Dob e_dob;

    public Emplo_yee() {

    }

    public Emplo_yee(int e_id, String name, int salary, Dob e_dob) {
        this.e_id = e_id;
        this.name = name;
        this.salary = salary;
        this.e_dob = e_dob;
    }

    @Override
    public String toString() {
        return "Emplo_yee{" +
                "e_id=" + e_id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", e_dob=" + e_dob +
                '}';
    }
}


public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date of Birth:");
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        Dob obj_d1 = new Dob(date, month, year);
        System.out.println(obj_d1);
        System.out.println("**********************************");
        Scanner sc_2 = new Scanner(System.in);
        System.out.println("Enter the Empolyee name: ");
        String name = sc_2.nextLine();
        System.out.println("Enter the Empolyee id: ");
        int e_id = sc_2.nextInt();
        System.out.println("Enter the Empolyee Salary: ");
        int salary = sc_2.nextInt();
        Emplo_yee obj_e1 = new Emplo_yee(e_id, name, salary, obj_d1);
        System.out.println(obj_e1);
    }
}
