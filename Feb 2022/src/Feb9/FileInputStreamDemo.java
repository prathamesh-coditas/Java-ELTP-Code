package Feb9;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f=new File("Feb 2022/src/Feb9/a1.txt");

        FileInputStream fin=new FileInputStream(f);

        if(f.exists()){
            System.out.println("Reading operation");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("Sorry,File not found");
    }
}
