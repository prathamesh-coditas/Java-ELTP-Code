package Feb9;
//read data from multiple files
import java.io.*;

public class SequenceInStream {
    public static void main(String args[]) throws IOException {

        FileInputStream fin1=new FileInputStream("Feb 2022/src/Feb9/txt1.txt");
        FileInputStream fin2=new FileInputStream("Feb 2022/src/Feb9/txt2.txt");
        FileOutputStream fout=new FileOutputStream("foutput.txt");

        SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
        int i;
        while((i = sin.read()) != -1) {
            System.out.print((char)i);
        }
        sin.close();
        fin1.close();
        fin2.close();
        fout.close();
        System.out.println("\nDone..");

    }
}
