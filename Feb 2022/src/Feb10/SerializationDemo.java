package Feb10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Employee obj_1 =new Employee(121,"Prathamesh",121000f);
        FileOutputStream out= new FileOutputStream("Feb 2022/src/Feb10/EmpSerialNew.txt");
        ObjectOutputStream obj_o= new ObjectOutputStream(out);
        obj_o.writeObject(obj_1);
        System.out.println("Serialization done Sucessfully");
    }
}
//¬í sr Feb10.EmployeeŒ4÷,ÀB‡o I eidF esalL enamet Ljava/lang/String;xp   yGìT t
//Prathamesh