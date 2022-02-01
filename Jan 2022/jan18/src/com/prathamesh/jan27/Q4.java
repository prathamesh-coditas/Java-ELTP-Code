package com.prathamesh.jan27;
import java.util.Scanner;
class Employees {
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Employees(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employees[] emp = new Employees[2];
        for (int i = 0; i <emp.length ; i++) {
            int temp_id = sc.nextInt();sc.nextLine();
            String temp_name = sc.nextLine();
            int temp_salary = sc.nextInt();
            Employees e = new Employees(temp_id, temp_name,temp_salary );
            emp[i]=e;
        }
        for (Employees e:emp) {
            System.out.println("Employee id ::"+e.getEmp_id());
            System.out.println("Employee Name ::"+e.getEmp_name());
            System.out.println("Employee Salary::"+e.getEmp_salary());
        }
    }
}
