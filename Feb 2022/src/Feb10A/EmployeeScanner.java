package Feb10A;

import Feb10.Employee;

import java.util.Scanner;

public class EmployeeScanner {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter Employee id::");
        int id=Integer.parseInt(sc1.nextLine());
        System.out.println("Enter the name of Employee::");
        String ename=sc1.nextLine();
        System.out.println("Enter the salary of Employee::");
        float esal=Float.parseFloat(sc1.nextLine());
        Feb10.Employee e1= new Employee(id,ename,esal);
        System.out.println(e1.displayDetails());
    }
}
