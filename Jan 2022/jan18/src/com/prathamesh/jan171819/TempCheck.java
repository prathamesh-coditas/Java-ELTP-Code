package com.prathamesh.jan171819;

import java.util.Scanner;

class temp{
    public void tempSensetivity(int var){
        switch (var){
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("high");
                break;
            default:
                System.out.println("Abnormal");

        }

    }
}
public class TempCheck {
    public static void main(String[] args) {
        temp c1=new temp();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature:");
        int a=sc.nextInt();
        c1.tempSensetivity(a);
    }
}
