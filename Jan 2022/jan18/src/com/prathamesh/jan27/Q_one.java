package com.prathamesh.jan27;

import java.util.Scanner;

class Employee {
    int hours;
    int rate;

    public void computeSalary() {
        System.out.println("The salary is" + (hours * rate));
    }
}

class WageEmploye extends Employee {
    int hrs;
    int rate;

    public void computeSalary() {
        System.out.println("The salary of WageEmployee is" + (hrs * rate));
    }

    public WageEmploye(int hrs, int rate) {
        this.hrs = hrs;
        this.rate = rate;
    }

    public String toString() {
        return "no of hrs are::" + hrs + " and rate is ::" + rate + "";
    }
}

public class Q_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs = sc.nextInt();
        int rate = sc.nextInt();
        WageEmploye e1 = new WageEmploye(hrs, rate);
        e1.computeSalary();
        System.out.println(e1);
    }
}
