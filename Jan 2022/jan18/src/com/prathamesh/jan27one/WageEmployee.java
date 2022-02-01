package com.prathamesh.jan27one;

import java.util.Scanner;

public class WageEmployee extends Employee{
    int hrs;
    int rate;

    WageEmployee(){
        super();
    }

    WageEmployee(int hrs,int rate){
        super();
    }
    @Override
    public String toString(){
        return "Hours: "+this.hrs+" Rate: "+this.rate;
    }
    @Override
    public void computeSalary(){
         this.emp_salary+=hrs*rate;
    }
    @Override
    public void acceptData(Scanner sObj,int id){
        System.out.println("*****************\nEnter Details for WagePerson:\n*****************");
        super.acceptData(sObj,id);
        System.out.println("Enter Hours: ");
        this.hrs=sObj.nextInt();
        System.out.println("Enter Rate: ");
        this.rate=sObj.nextInt();
    }
    @Override
    public void display(){
        System.out.println("\n*****************\nPrinting WagePerson Details:\n*****************");
        this.computeSalary();
        super.display();
        System.out.println(this.toString());
    }
}
