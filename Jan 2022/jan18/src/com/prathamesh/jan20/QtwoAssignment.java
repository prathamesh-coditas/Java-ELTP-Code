package com.prathamesh.jan20;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Calendar;

class Day{
    String str;
    String [] day = {"Monday" ," Tuesday " , " Wednesday " ,"Thursday", " Friday  " , " Saturday " ,
            " Sunday "};
    public void skipTodaysDay(){
        Calendar cal = Calendar.getInstance();
        Format f = new SimpleDateFormat("EEEE");
        str = f.format(new Date());
        //System.out.println("Day Name: "+str);
        for(int i =0; i<day.length;i++){
            if(day[i].equals(str))
                continue;
            System.out.println(day[i]);
        }
    }
    public void getDate(){

    }
}


public class QtwoAssignment {
    public static void main(String[] args) {
        Day obj_d1 = new Day();
        obj_d1.skipTodaysDay();
        obj_d1.getDate();
    }

}
