package Feb9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class IOTest{
    public void readFile(){
        try {
            FileInputStream fis =new FileInputStream("Feb 2022/src/Feb9/Io1.txt");
            DataInputStream dis = new DataInputStream(fis);
            int i;
            while((i=dis.read())!=-1){
                dis.readUTF();
                //System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    String str = "My Name is Prathamesh";

    public void writeFile(){
        try {
            FileOutputStream fos = new FileOutputStream("Feb 2022/src/Feb9/Io1.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            byte b[]=str.getBytes();
            dos.writeUTF(String.valueOf(b));
            dos.flush();
            dos.close();
            System.out.println("\nwritten successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
public class DataInputOutputStream {
    public static void main(String[] args) {
        IOTest o1 = new IOTest();
        o1.readFile();
        o1.writeFile();
    }
}
