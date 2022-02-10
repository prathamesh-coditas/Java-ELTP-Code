package Feb10A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee id::");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter the name of Employee::");
        String ename = br.readLine();
        System.out.println("Enter the salary of Employee::");
        Float esal = Float.parseFloat(br.readLine());
        Employee e2 = new Employee(id, ename, esal);
        System.out.println(e2.displayDetails());
    }
}
