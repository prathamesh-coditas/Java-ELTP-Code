package com.prathamesh.jan171819;

import java.util.Scanner;

class FindGreat{
    public int great_Two(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
public class GreaterTwo {
    public static void main(String[] args) {
        FindGreat f1=new FindGreat();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number:");
        int b=sc.nextInt();
        System.out.print("Enter Second Number:");
        int c= sc.nextInt();
        int out=f1.great_Two(b,c);
        System.out.println("Greatest Number is: "+out);
    }
}
