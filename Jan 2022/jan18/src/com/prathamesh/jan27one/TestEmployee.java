package com.prathamesh.jan27one;

import java.util.Scanner;

public class TestEmployee extends Employee{
    public static void main(String args[]){
        Scanner sObj = new Scanner(System.in);

        Employee[] emp = new Employee[4];

        emp[0] = new Manager();
        emp[1] = new WageEmployee();
        emp[2] = new SalesPerson();

        emp[3]= new Employee();

        for(int i=0;i<2;i++){
            emp[i].acceptData(sObj,i+1);
        }
        emp[2].acceptData(sObj,3,emp[3]);


        System.out.println("*****************\nDisplaying Data: \n*****************");
        for(int i=0;i<2;i++){
            emp[i].display();
        }

        emp[2].display(emp[3]);
    }
}
