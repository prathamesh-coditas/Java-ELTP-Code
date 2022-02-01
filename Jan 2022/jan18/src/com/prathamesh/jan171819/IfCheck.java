package com.prathamesh.jan171819;

import java.util.Scanner;

class IntCheck{
    public void checkOut(int x){
        if(x==0){
            x=x+2;
            System.out.println("X="+ x);
        }
        else if(x==1){
            x=x+4;
            System.out.println("X="+ x);
        }
        else if(x==2){
            x=x+6;
            System.out.println("X="+ x);
        }

    }
}
public class IfCheck {
    public static void main(String[] args) {
        IntCheck i1= new IntCheck();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int b=sc.nextInt();
        i1.checkOut(b);
    }
}
