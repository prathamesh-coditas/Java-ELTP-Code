    package com.prathamesh.Inheritance;

    import java.util.Scanner;

    class Employee {
        int hrs, rate;
        String name;

        Employee(int hrs, int rate, String name) {
            this.hrs = hrs;
            this.rate = rate;
            this.name = name;
        }

        Employee(String name) {
            this.name = name;
        }

        void computeSalary() {
            System.out.println("Salary is" + " " + hrs * rate);
        }

        public String toString() {
            return ("Hrs is: " + hrs + " " + "rate is: " + rate + " " + "Name is: " + name);
        }
    }

    class Manager extends Employee {
        int fixedSalary, incentives;

        Manager(String name, int fixedSalary, int incentives) {
            super(name);
            this.fixedSalary = fixedSalary;
            this.incentives = incentives;
        }

        @Override
        void computeSalary() {
            int salary = fixedSalary + incentives;
            System.out.println("Salary is: " + salary);
        }

        public String toString() {
            return "Name is: " + name + " " + "fixedSalary is: " + fixedSalary + " " + "Incentives are: " + incentives;
        }
    }

    class WageEmployee extends Employee {
        WageEmployee(int hrs, int rate, String name) {
            super(hrs, rate, name);
        }

        @Override
        void computeSalary() {
            System.out.println("Salary is" + " " + hrs * rate);
        }

        public String toString() {
            return ("Hrs is: " + hrs + " " + "rate is: " + rate + " " + "Name is: " + name);
        }
    }

    class SalesPerson extends WageEmployee {
        int sales, commission;


        SalesPerson(int hrs, int rate, String name, int sales, int commission) {
            super(hrs, rate, name);
            this.sales = sales;
            this.commission = commission;
        }

        @Override
        void computeSalary() {
            int salary = hrs * rate + sales + commission;
            System.out.println("Salary is" + " " + salary);
        }

        public String toString() {
            return "Hrs is: " + hrs + " " + "rate is: " + rate + " " + "Name is: " + name + " " + "sales is: " + sales + " " + "Commission is: " + commission;
        }
    }

    class TestEmployee {
        void print(Employee[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public class Ques_1 {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("How many Employees: ");
            int n = inp.nextInt();
            Employee[] arr = new Employee[n];
            for (int i = 0; i < n; i++) {
                System.out.println("manager/wage/sales ?");
                String category = inp.next();
                if (category.equals("manager")) {
                    System.out.println("Enter name,fixedsalary,incentives");
                    String name = inp.next();
                    int fixedsalary = inp.nextInt();
                    int incentives = inp.nextInt();
                    Manager obj_m = new Manager(name, fixedsalary, incentives);
                    arr[i] = obj_m;
                    obj_m.computeSalary();
                    System.out.println(obj_m.toString());
                } else if (category.equals("sales")) {
                    System.out.println("Enter hrs,rate,name,sales,commission ");
                    int hrs = inp.nextInt();
                    int rate = inp.nextInt();
                    String name = inp.next();
                    int sales = inp.nextInt();
                    int commission = inp.nextInt();
                    SalesPerson obj_s = new SalesPerson(hrs, rate, name, sales, commission);
                    arr[i] = obj_s;
                    obj_s.computeSalary();
                    System.out.println(obj_s.toString());
                } else {
                    System.out.println("Enter hrs,rate,name");
                    int hrs = inp.nextInt();
                    int rate = inp.nextInt();
                    String name = inp.next();
                    WageEmployee obj_w = new WageEmployee(hrs, rate, name);
                    arr[i] = obj_w;
                    obj_w.computeSalary();
                    System.out.println(obj_w.toString());
                }

            }
            TestEmployee obj_t = new TestEmployee();
            obj_t.print(arr);

        }
    }
