package com.prathamesh.jan171819;

import java.util.Scanner;

class OldAge{
    public int oldest(int a,int b,int c){
        int large=0;
        if((a>=b)&&(a>=c)){

                large=a;

        }
        else if((b>=a)&&(b>=c)){

                large=b;
            }

        else{
                large=c;
        }
        return large;

    }
    public int youngest(int a,int b,int c){
        int small=0;
        if(a<=b){
            if(a<=c)
            {
                small=a;
            }
        }
        else if((b<=a)){
            if(b<=c){
                small=b;
            }
        }
        else{
            small=c;
        }
        return small;
    }
}
public class Age {
    public static void main(String[] args) {
        OldAge check_1= new OldAge();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age of First Person:");
        int x=sc.nextInt();
        System.out.print("Enter the age of Second Person:");
        int y= sc.nextInt();
        System.out.print("Enter the age of Third Person:");
        int z= sc.nextInt();
        int old=check_1.oldest(x,y,z);
        int young=check_1.youngest(x,y,z);
        if(old==x){
            System.out.println("Oldest Person is First Person with age "+x);
        }
        else if(old==y){
            System.out.println("Oldest Person is Second Person with age "+y);
        }
        else{
            System.out.println("Oldest Person is Third Person with age "+z);
        }
        if(young==x){
            System.out.println("Youngest Person is First Person with age "+x);
        }
        else if(young==y){
            System.out.println("Youngest Person is Second Person with age "+y);
        }
        else{
            System.out.println("Youngest Person is Third Person with age "+z);
        }
    }
}
