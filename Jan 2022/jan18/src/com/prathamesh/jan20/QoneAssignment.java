package com.prathamesh.jan20;
class Days{
    String [] day = {"Monday" ," Tuesday " , " Wednesday " , " Friday  " , " Saturday " , " Sunday "};
    public void printDay(){
        for(int i =0; i<day.length;i++){
            System.out.println(day[i]);
        }
}}
public class QoneAssignment {
    public static void main(String[] args) {
        Days d1=new Days();
        d1.printDay();
    }
}

