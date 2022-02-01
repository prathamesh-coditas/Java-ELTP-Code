package com.prathamesh.jan25;
class Employee{
    private int emp_id;
    private String emp_name;
    private String emp_address;
    private float emp_salary;

    public void setEmp_id(int emp_id){
        this.emp_id=emp_id;
    }
    public int getEmp_id(){
        return emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public void setEmp_salary(float emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public float getEmp_salary() {
        return emp_salary;
    }

    public String getEmp_address() {
        return emp_address;
    }
}
public class EmployeeMainApplication {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.setEmp_id(1010);
        e1.setEmp_name("Prathamesh");
        System.out.println(e1.getEmp_id());
        System.out.println(e1.getEmp_name());
    }
}
