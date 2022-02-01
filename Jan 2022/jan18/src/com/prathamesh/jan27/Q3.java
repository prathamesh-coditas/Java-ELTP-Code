package com.prathamesh.jan27;
class WageEmployeee {
    int fixedSalary  ;
    int incentive ;
    void ComputeSalary(){
        System.out.println("salary is ::"+(fixedSalary+incentive));
    }
}
class Manager extends WageEmployeee {
    public void printData(){
        super.fixedSalary = 45000;
        super.incentive= 250;
        super.ComputeSalary();
    }
}
public class Q3 {
    public static void main(String[] args) {
        Manager m_one = new Manager();
        m_one.printData();
    }
}
