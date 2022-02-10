package Feb10;

public class CLADemo {
    public static void main(String[] args) {
        System.out.println("Command Line Argument::");
        int x = Integer.parseInt(args[4]); //first arguments
        int y = Integer.parseInt(args[1]); //second arguments
        int sum = x + y;
        System.out.println("The sum of x and y is: " +sum);

    }
}
