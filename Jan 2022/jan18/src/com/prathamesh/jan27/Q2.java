package com.prathamesh.jan27;

class WageEmployee {
    int sales = 10;
    int commission = 10000;

    void ComputeSalary() {
        System.out.println("salary is ::" + (sales * commission));
    }
}

class SalesPerson extends WageEmployee {
    //Overiding Method
    public void ComputeSalary() {
        System.out.println("the sales is ::" + sales + " the commisssion is ::" + commission + "\n the " +
                "salary is ::" + (sales * commission));
    }
}

public class Q2 {
    public static void main(String[] args) {
        SalesPerson s1 = new SalesPerson();
        s1.ComputeSalary();
    }
}

