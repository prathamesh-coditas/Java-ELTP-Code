package com.prathamesh.jan27one;

import java.util.Scanner;

class SalesPerson extends WageEmployee{
        int sales;
        int commission;

        SalesPerson(){
        }

        SalesPerson(int sales,int commission){
            this.sales=sales;
            this.commission =commission;
        }

        @Override
        public String toString(){
            return "Sales: "+this.sales+ " Commission: "+this.commission;
        }

        @Override
        public void acceptData(Scanner sObj, int id,Employee employee){
            System.out.println("*****************\nEnter Details for SalesPerson:\n*****************");
            employee.acceptData(sObj,id);
            System.out.println("Enter Sales: ");
            this.sales=sObj.nextInt();
            System.out.println("Enter Commission: ");
            this.commission= sObj.nextInt();
        }

        @Override
        public void computeSalary(Employee e){
            e.emp_salary += this.sales*this.commission;
        }

        @Override
        public void display(Employee e){
            System.out.println("\n*****************\nPrinting SalesPerson Details:\n*****************");
            this.computeSalary(e);
            e.display();
            System.out.println(this.toString());
        }
    }