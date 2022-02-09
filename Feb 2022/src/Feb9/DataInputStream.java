package Feb9;

import java.io.*;

public class DataInputStream {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream();
        input.writePrimitiveData();
    }

    public void writePrimitiveData() throws IOException
    {
        File f1=new File("data.txt");
        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try
        {
            fileOutputStream = new FileOutputStream("data.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            System.out.println("File path 1 is::"+f1.getAbsolutePath());
            int[] intArray = { 100, 250, 440, 550, 900 };

            for (int j : intArray)
            {
                dataOutputStream.writeInt(j);
            }

            System.out.println("Successfully written to \'data.txt\' file\n");
        }
        finally
        {
            if (dataOutputStream != null)
            {
                /*
                 * Closing a DataOutputStream will also
                 * close the OutputStream instance to which
                 * the DataOutputStream is writing.
                 */
                dataOutputStream.close();
            }
        }

    }
    }
