package com.prathamesh.jan171819;
import java.util.Scanner;
class Day{
    public void displayDayData(String s) {
        switch (s){
            case "Monday":
                System.out.println("Its a Monday");
                break;
            case "Tuesday":
                System.out.println("Its a Tuesday");
                break;
            case "Wednesday":
                System.out.println("Its a Wednesday");
                break;
            case "Thurday":
                System.out.println("Its a Thurday");
                break;
            case "Friday":
                System.out.println("Its a Friday");
                break;
            default:
                System.out.println("Its a Weekend");
        }
    }
}
public class SwitchDemo {
    public static void main(String[] args) {
        Day obj_d= new Day();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Day Name::");
        String day=sc.nextLine();
        obj_d.displayDayData(day);
    }
}
