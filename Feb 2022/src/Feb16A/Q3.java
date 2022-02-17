package Feb16A;

import java.util.*;

class Employee implements Comparable {
    int id;
    String name;
    float Salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        String name = employee.name;
        return this.name.compareTo(name);

    }


}

class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.Salary - o2.Salary);
    }
}

class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Employee> list1 = new ArrayList<Employee>();
        list1.add(new Employee(1001, "B", 120000f));
        list1.add(new Employee(1002, "S", 2500f));
        list1.add(new Employee(1003, "A", 3500f));
        list1.add(new Employee(1004, "H", 4000f));
        list1.add(new Employee(1005, "P", 3000f));
        list1.add(new Employee(1006, "K", 45000f));
        System.out.println("**********************For Case one whose salary is greater than 15000****************************");
        Collections.sort(list1, new SortBySalary());
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getSalary() > 15000)
                System.out.println(list1.get(i));
        }
        System.out.println("************************  For Case Two sorted by there names   ***********************************");
        Collections.sort(list1, new SortByName());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        Collections.sort(list1);
        System.out.println("*****************************BY USING COMPARABLE For Case one whose  salary is greater than 15000********************************************");
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getSalary() > 15000)
                System.out.println(list1.get(i));
        }
        System.out.println("*****************************BY Using COMPARABLE For Case Two sorted by there names********************************************************");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        /*
        **********************For Case one whose  salary is greater than 15000****************************
        Employee{id=1006, name='K', Salary=45000.0}
        Employee{id=1001, name='B', Salary=120000.0}
        ************************  For Case Two sorted by there names   ***********************************
        Employee{id=1003, name='A', Salary=3500.0}
        Employee{id=1001, name='B', Salary=120000.0}
        Employee{id=1004, name='H', Salary=4000.0}
        Employee{id=1006, name='K', Salary=45000.0}
        Employee{id=1005, name='P', Salary=3000.0}
        Employee{id=1002, name='S', Salary=2500.0}
        *****************************BY USING COMPARABLE For Case one whose  salary is greater than 15000********************************************
        Employee{id=1001, name='B', Salary=120000.0}
        Employee{id=1006, name='K', Salary=45000.0}
        *****************************BY Using COMPARABLE For Case Two sorted by there names********************************************************
        Employee{id=1003, name='A', Salary=3500.0}
        Employee{id=1001, name='B', Salary=120000.0}
        Employee{id=1004, name='H', Salary=4000.0}
        Employee{id=1006, name='K', Salary=45000.0}
        Employee{id=1005, name='P', Salary=3000.0}
        Employee{id=1002, name='S', Salary=2500.0}

        Process finished with exit code 0

         */

    }
}
