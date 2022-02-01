package com.prathamesh.jan20;
class OneD_Array{
    public void displayArrayElements(){
        int[] rno={11,12,13,14,15,16,17,18,19};
        int n= rno.length;
        for(int i=0;i<n;i++){

            System.out.println("Index is ::"+i+" Value is==>"+rno[i]);
        }
        System.out.println("For each loop");
        //for each loop
        for(int a:rno){
            System.out.println(a);
        }
    }
}
class TwoD_Array{
    void displayArrayElements(){
        int matrix[][]=new int [3][3];


    }
}
public class ArrayDemo {
    public static void main(String[] args) {
    OneD_Array o1= new OneD_Array();
    o1.displayArrayElements();
    }
}
