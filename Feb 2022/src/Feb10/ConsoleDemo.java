package Feb10;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String name = c.readLine();
        System.out.println("Enter password:");
        char pwd[] = c.readPassword();
        String upwd = new String(pwd);
        if (name.equals("rt") && upwd.equals("rt")) {
            System.out.println("Welcome ::" + name + " You are valid user");
        } else {
            System.out.println("Sorry you are not valid user");
        }
    }
}
