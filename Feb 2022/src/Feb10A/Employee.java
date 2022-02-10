package Feb10A;

import java.io.Serializable;

//any feild never want tobe part of serialization, declare it as
public class Employee implements Serializable {
    int eid;
    String ename;
    float esal;

    public Employee(int eid, String ename, float esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }

       public String displayDetails() {
        return "Employee{" +
                "ID=" + eid +
                ", Employee Name='" + ename + '\'' +
                ", Employee Salary=" + esal +
                '}';
    }
}
