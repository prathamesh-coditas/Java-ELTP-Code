package Feb10A;

public class EmployeeCLI {
    public static void main(String[] args) {
        System.out.println("Enter details of Employee in CLA as id, name , salary");
        int eid = Integer.parseInt(args[0]);

        String ename = args[1];

        float esal = Float.parseFloat(args[2]);

        Employee e4 = new Employee(eid, ename, esal);
        System.out.println(e4.displayDetails());
    }
}
