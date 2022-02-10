package Feb10;

import java.io.*;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj=new ObjectInputStream(new FileInputStream("Feb 2022/src/Feb10/EmpSerialNew.txt"));
        Employee obj_e1= (Employee) obj.readObject();
        System.out.println("Deserialization Done..!!");
        System.out.println("Employee id::"+obj_e1.eid+"\nName is::"+obj_e1.ename+"\n Salary::"+obj_e1.esal);

    }

}
