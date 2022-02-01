package com.prathamesh.jan20;
import java.util.Arrays;

public class QTwoOneAssignment {
    public static void main(String[] args){
        int a[] = {5,2,3,5,5,6,7,8,3,2};
        int b[] = {5,2,3,5,5,6,7,8,3,2};
        for(int i : a){
            System.out.print(i);
        }
        Arrays.sort(a);
        for(int i : b){
            System.out.println(i);
        }
        Arrays.fill(a,10);
        System.out.println("using string method");
        System.out.println(Arrays.toString(a));
    }
}
