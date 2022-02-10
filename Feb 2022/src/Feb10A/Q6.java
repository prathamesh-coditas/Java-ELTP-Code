package Feb10A;

import java.io.*;

class passwdAuth1
{

    public static void main(String args[])
    {
        try
        {
            String logFileName = args[0];
           // logFileName.toString().replaceAll("\\\\", "/");
            System.out.println(args[0]);
           //System.out.println(logFileName);
            File f = new File(logFileName);
            System.out.println(f);
            boolean access_granted = false;
            String password = "";
            int integer = 5;

            if (args.length == 2)
            {
                System.out.println("Checking command-line password");
                password = password + args[1];
                if (password.equals("3dTAqb.7"))
                {
                    access_granted = true;
                    System.out.println("Password matches.");
                }
                else
                    System.out.println("Command-line password does not match");
            }//end if

            if (access_granted)
            {
                //File f = new File("Feb 2022/src/Feb10A/log.txt");
                System.out.println("Access granted!");
                PrintWriter out = new PrintWriter(new FileOutputStream(f, true));
                out.println();
                out.print("Updated...");

                FileInputStream fin=new FileInputStream(f);

                if(f.exists()){
                    System.out.println("Reading operation");
                    int i=0;
                    while((i=fin.read())!=-1){
                        System.out.print((char)i);
                    }
                }
                out.println();
                out.flush();
                out.close();
            }//end if

        }//end try
        catch (Exception e)
        {
            System.out.println("an error has occured.");
            //e.printStackTrace();
        }


    }//end main
}//end class