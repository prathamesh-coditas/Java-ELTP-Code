package com.prathamesh.jan20;
class ForDemo{
    void displayData(){
        for(int i=10;i>=0;i--){
            System.out.print(i);
            if (i == 6)
                break;
        }
        System.out.println(" ");
    }
}
class WhileDemo{
    void displayData(){
        int i=1;
        while(i<=5){
            i++;
            if(i==3)
                continue;
            System.out.println(i);
        }
    }
}
class DoWhileDemo{
    void displayData(){
        int i=1;
        do{
            System.out.print(i);
            i++;
        }while (i <=1);
    }
}
public class ForLoopDemo {
    public static void main(String[] args) {
        ForDemo obj_f= new ForDemo();
        obj_f.displayData();
        WhileDemo w1= new WhileDemo();
        w1.displayData();
        DoWhileDemo d1=new DoWhileDemo();
        d1.displayData();
    }
}
