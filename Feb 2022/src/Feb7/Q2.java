package Feb7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int a, b;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a & b: ");
        try {
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            str = String.valueOf(a + b);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
