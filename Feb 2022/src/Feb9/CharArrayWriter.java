package Feb9;
//write same data into multiple files at the same time
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriter {
    public static void main(String args[]) throws IOException {
        java.io.CharArrayWriter out=new java.io.CharArrayWriter();
        out.write("Aarti here, welcome all");

        FileWriter f1=new FileWriter("Feb 2022/src/Feb9/a1.txt");
        FileWriter f2=new FileWriter("Feb 2022/src/Feb9/a2.txt");
        FileWriter f3=new FileWriter("Feb 2022/src/Feb9/a3.txt");

        System.out.println("Success.....");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);

        f1.close();
        f2.close();
        f3.close();
    }
}

/**
 *
 *              A
 *              A   A
 *              A   A   A
 */