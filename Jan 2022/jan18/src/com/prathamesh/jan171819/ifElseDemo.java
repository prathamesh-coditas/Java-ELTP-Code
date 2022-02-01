package com.prathamesh.jan171819;

import java.util.Scanner;

class checkEvenOdd{
    public void evenOdd(int a){
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
public class ifElseDemo {
    public static void main(String[] args) {
        checkEvenOdd check_1=new checkEvenOdd();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=sc.nextInt();
        check_1.evenOdd(a);
    }
}
