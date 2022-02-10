package Feb10;
//setPointer==>read as well as write
//seek
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemoNew  {
    public static void main(String[] args) {

        try {
            int i = 284;

            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("src/session17/test12.txt", "rw");

            raf.seek(50);
            // write something in the file:Iteration 1
            raf.writeInt(65);//A

            // set the file pointer at 0 position
            raf.seek(0);

            // print the int
            System.out.println("" + raf.readInt());

            /**  // set the file pointer at 0 position:iteration2
             raf.seek(2);

             // write something in the file:Iteration 2
             raf.writeInt(i);//284

             // set the file pointer at 0 position
             raf.seek(2);

             // print the int
             System.out.println("print i:" + raf.readInt());


             /** //new data: Iteration 3
             System.out.println("***** Print Int ********");
             // set the file poi2nter at 2 position
             raf.seek(2);
             // write something in the file
             raf.writeInt(68);
             raf.seek(2);
             // print the int
             System.out.println(":" + raf.readInt());

             //Iteration 4
             System.out.println("***** Print String ********");

             //new data:start writing from 3rd position
             raf.seek(17);
             String s="Hello , i am new";
             // write something in the file
             raf.writeChars(s);
             // set the file pointer at  16 position
             raf.seek(0);
             // print the string
             System.out.println("" + raf.readLine());
             */
            //new string

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

//   A
//     A