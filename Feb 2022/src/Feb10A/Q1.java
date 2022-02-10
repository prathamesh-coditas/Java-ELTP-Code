package Feb10A;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter id, marks and name of student::");
        //1. reading the complete line for the integer and parsing it as an integer

        //int id= Integer.parseInt(sc.nextLine());
        //System.out.println("ID is::"+id);
        //float percentage =Float.parseFloat(sc.nextLine());
        //System.out.println("Percentage is::"+percentage);
        //String name= sc.nextLine();
        //System.out.println("Name is::"+name);


        // 2. by consuming the leftover new line using the nextLine() method.
        System.out.println("Enter id, marks and name of student::");
        int id = sc.nextInt();
        System.out.println("ID is::" + id);
        float percentage = sc.nextFloat();
        System.out.println("Percentage is::" + percentage);
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Name is::" + name);

    }
}
