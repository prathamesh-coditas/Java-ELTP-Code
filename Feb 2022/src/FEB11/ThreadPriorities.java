package FEB11;

import org.omg.CORBA.PUBLIC_MEMBER;
class MyThr extends Thread{
    public MyThr (String name){
        super(name);
    }
    public void run(){
        int i=24;
//        System.out.println("Thank You"+" "+this.getName());
        while(true){
            System.out.println("Thank You::"+this.getName());
        }
    }
}
public class ThreadPriorities {

    public static void main(String[] args) {
        //Ready Queqe: T1 T2 T3 T4 T5
        MyThr t1= new MyThr("Prathamesh");
        MyThr t2= new MyThr("Prathamesh2");
        MyThr t3= new MyThr("Prathamesh3");
        MyThr t4= new MyThr("Prathamesh4");
        MyThr t5= new MyThr("Prathamesh5(Most Imp)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The id of thread t is:: "+t1.getId());


    }
}
