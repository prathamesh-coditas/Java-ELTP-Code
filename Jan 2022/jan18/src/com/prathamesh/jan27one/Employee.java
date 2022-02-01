package com.prathamesh.jan27one;

import java.util.Scanner;
/*
1. Create class WageEmployee extending Employee class with attributes as hrs (int)and rate(int)
and method computeSalary() to calculate the salary.Print the salary and details of WageEmployee.
(Note: Use the previous Employee classes.
Accept the values from the user..Default, Parameterised Constructor and toString() to be written in all the classes)
2. Create SalesPerson class extending WageEmployee with attributes as sales(int)
and commission (int). Override the ComputeSalary() in Salesperson class and print the
salary and details of SalesPerson
3. Create Manager class extending Employee class with attributes as fixedsalary(int)
and incentives(int) and method computeSalary() to calculate the salary of Manager.
Print the salary and details of Manager
4. Write a TestEmployee class to print the details of all types of employees (use array[] of Employee class)
 */
public class Employee {
    int id;
    String name;
    String address;
    float emp_salary;

    Employee() {
    }

    Employee(int id, String name, String address, float emp_salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.emp_salary = emp_salary;
    }

    public String displayBasicData() {
        return "Id: " + this.id + " Name: " + this.name + " Address: " + this.address + " Employee Salary: " + emp_salary;
    }

    public void computeSalary() {
    }

    public void computeSalary(Employee e){

    }

    public void acceptData(Scanner scanObj, int id) {
        this.id = id;
        scanObj.nextLine();
        System.out.println("Enter Name: ");
        this.name = scanObj.nextLine();
        System.out.println("Enter Address: ");
        this.address = scanObj.nextLine();
    }

    public void acceptData(Scanner scanObj,int id,Employee e){
        e.acceptData(scanObj,id);
    }

    public void display() {
        System.out.println(this.displayBasicData());
    }

    public void display(Employee e){
        e.display();
    }
}

