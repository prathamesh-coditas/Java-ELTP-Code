package Feb10A;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
public class Q4 {
    public static void main(String[] args) throws FileNotFoundException {
        //write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("My Name is Prathamesh");
        writer.flush();
        writer.close();
        //write in File using PrintWriter
        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File("Feb 2022/src/Feb10A/a1.txt"));
        writer1.write("I am Prathamesh Cool..");
        writer1.flush();
        writer1.close();
    }
}

