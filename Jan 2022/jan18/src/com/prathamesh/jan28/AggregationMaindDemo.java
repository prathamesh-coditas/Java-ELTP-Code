package com.prathamesh.jan28;

class Address {
    int fno, pno, pin;
    String housename, streetName, areaName, city, state, country;


    public Address(int fno, int pno, int pin, String housename, String streetName, String areaName, String city, String state, String country) {
        this.fno = fno;
        this.pno = pno;
        this.pin = pin;
        this.housename = housename;
        this.streetName = streetName;
        this.areaName = areaName;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String toString() {
        return "Address{" +
                "fno=" + fno +
                ", pno=" + pno +
                ", pin=" + pin +
                ", housename='" + housename + '\'' +
                ", streetName='" + streetName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Employee {
    int emp_id;
    String emp_name;
    Address ref_a;
    float emp_salary;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", ref_a=" + ref_a +
                ", emp_salary=" + emp_salary +
                '}';
    }

    public Employee(int emp_id, String emp_name, Address ref_a, float emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.ref_a = ref_a;
        this.emp_salary = emp_salary;

    }
}
class Student{
    int s_id;
    String s_name;
    Address ref_a;
    float percentage;

    public Student(int s_id, String s_name, Address ref_a, float percentage) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.ref_a = ref_a;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", ref_a=" + ref_a +
                ", percentage=" + percentage +
                '}';
    }
}


public class AggregationMaindDemo {
    public static void main(String[] args) {

        Address obj_1 = new Address(12,1223,443001,"Matruchhya","Ekta Nagar","Gajnan Maharaj Mandir","Buldhana","Maharastra","India");
        Employee obj_e = new Employee(1001,"Prathamesh",obj_1,45000);
        System.out.println(obj_e);
        System.out.println("****************************************");
        Student obj_s= new Student(1002,"smith",obj_1,98.78f);
        System.out.println(obj_s);
    }
}
