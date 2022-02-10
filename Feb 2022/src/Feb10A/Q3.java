package Feb10A;

    import java.io.Console;

public class Q3 {
    public static void main(String[] args) {
        Console c1   = System.console();
        char[] pass;
        c1.format("Enter your details - \n");		// Note1
        String str = c1.readLine("Enter your name ");	// Note2
        pass =c1.readPassword("Enter your password ");	// Note3
        c1.printf("Your details are - \n");
        c1.format("Your username is : %s \n", str);	// Note4
        c1.printf("Your password is : ");
        for(char ch : pass)
            c1.printf("%c", ch); 				// Note5

    }
}
