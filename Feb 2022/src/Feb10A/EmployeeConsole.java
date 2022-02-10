package Feb10A;

import java.io.Console;

public class EmployeeConsole {
    public static void main(String[] args) {
        Console c1 = System.console();
        System.out.println("Enter Employee id::");
        int eid = Integer.parseInt(c1.readLine());
        System.out.println("Enter the name of Employee::");
        String ename = c1.readLine();
        System.out.println("Enter the salary of Employee::");
        Float esal = Float.parseFloat(c1.readLine());
        Employee e3 = new Employee(eid, ename, esal);
        System.out.println(e3.displayDetails());


    }
}

