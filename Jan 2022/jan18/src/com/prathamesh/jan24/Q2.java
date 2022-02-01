package com.prathamesh.jan24;

class Employee {
    int emp_id;
    String emp_name;
    String emp_address;
    int emp_sal;

    Employee() {
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(emp_address);
        System.out.println(emp_sal);
    }

    public void displayEmployeeData() {
        System.out.print(emp_id + " ");
        System.out.print(emp_name + " ");
        System.out.print(emp_address + " ");
        System.out.println(emp_sal + " ");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.emp_id = 2001;
        e1.emp_name = "Ankush";
        e1.emp_address = "Malkapur";
        e1.emp_sal = 11000;
        System.out.println();
        e1.displayEmployeeData();
    }
}
