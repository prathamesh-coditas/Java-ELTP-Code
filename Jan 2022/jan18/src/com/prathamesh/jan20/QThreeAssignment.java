package com.prathamesh.jan20;
class PassDate{
    public void printTillTodayDate(){
        for(int i =1; i<=31; i++){
            if(i>20 && i<=31 )
                continue;
            System.out.println(i+"January");
        }
    }
}
public class QThreeAssignment {
    public static void main(String[] args) {
        PassDate obj= new PassDate();
        obj.printTillTodayDate();
    }
}


