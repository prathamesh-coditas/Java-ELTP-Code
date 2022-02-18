package Feb18;

import java.sql.SQLOutput;

class Vdemo{
    public void display(String bid,int... name){
        System.out.println("Batch Code is::"+bid);
        for(int s1:name){
            System.out.println(s1+" ");
        }
    }
}
public class VarargsDemo {
    public static void main(String[] args) {
        Vdemo obj_v= new Vdemo();
        System.out.println("**************************Iteration1********************");
        System.out.println("SUing 5 Prameters:");
    }
}
