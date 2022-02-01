package com.prathamesh.jan27one;

import java.util.Scanner;

public class Manager extends Employee{
        int fixedSalary;
        int incentives;

        Manager(){}

        Manager(int fixedSalary,int incentives){
            this.fixedSalary =fixedSalary;
            this.incentives =incentives;
        }
    @Override
        public String toString(){
            return "FixedSalary: "+this.fixedSalary + " Incentives: "+this.incentives;
        }
    @Override
        public void computeSalary(){
            emp_salary+= this.fixedSalary +this.incentives;
        }
    @Override
        public void acceptData(Scanner sObj, int id){
            System.out.println("*****************\nEnter Details for Manager:\n*****************");
            super.acceptData(sObj,id);
            System.out.println("Enter Fixed Salary: ");
            this.fixedSalary=sObj.nextInt();
            System.out.println("Enter Incentives: ");
            this.incentives=sObj.nextInt();
        }
    @Override
        public void display(){
            System.out.println("\n*****************\nPrinting Manager Details:\n***************** ");
            this.computeSalary();
            super.display();
            System.out.println(this.toString());
        }
    }
