package Feb10A;

import java.io.*;
public class Q5 {
    public static void main(String args[])
            throws FileNotFoundException
    {
        InputStream is = null;
        OutputStream os = null;

        try {

            is = new FileInputStream("Feb 2022/src/Feb9/a2.txt");
            os = new FileOutputStream("Feb 2022/src/Feb9/a3.txt");
            // remaining code
        }
        finally {
            try {
                if (is != null)
                    is.close();
            }
            catch (IOException e) { /* handle */
            }
            try {
                if (os != null)
                    os.close();
            }
            catch (IOException e) { /*handle */
            }
        }
    }
}
