package FEB11;

public class Q1 extends Thread{
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println("In for loop::"+i+"==>"+Thread.currentThread());
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Q1 t1= new Q1();
        t1.start();
        //t1.start();
        /* if we try start one thread two times the Exception in thread "main" java.lang.IllegalThreadStateException
        * */
//        ThreadDemo t2= new ThreadDemo();
//        t2.start();

        //System.out.println("Thread Started"+Thread.currentThread());

        //methods
        //chnage name of thread
//        t1.setName("Abc");
//        t2.setName("def");
//
//        //set priority
//        t1.setPriority(1);//Abc
//        t2.setPriority(10);//def



    }
}

