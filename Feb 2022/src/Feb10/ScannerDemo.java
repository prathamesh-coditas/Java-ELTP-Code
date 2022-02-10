package Feb10;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, id and marks of student::");
        int id= Integer.parseInt(sc.nextLine());
        System.out.println("ID is::"+id);
        float percentage =Float.parseFloat(sc.nextLine());
        System.out.println("Percentage is::"+percentage);
        String name= sc.nextLine();
        System.out.println("Name is::"+name);
    }
}
