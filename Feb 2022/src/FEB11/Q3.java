package FEB11;

class t1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is Running");

    }
}

public class Q3 {
    public static void main(String[] args) {
        t1 obj1 = new t1();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        Thread t3 = new Thread(obj1);
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.setName("Prathamesh1");
        t2.setName("Prathamesh2");
        t3.setName("Prathamesh3");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getId());
        System.out.println(t3.getName());
        System.out.println(t3.getId());
        System.out.println("t1 Priority::" + t1.getPriority());
        System.out.println("t2 Priority::" + t2.getPriority());
        System.out.println("t3 Priority::" + t3.getPriority());
        //Output:
        /*
        Prathamesh1
        Thread is Running
        11
        Prathamesh2
        12
        Prathamesh3
        13
        t1 Priority::1
        Thread is Running
        t2 Priority::10
        t3 Priority::5
        Thread is Running
        These are the methods in Thread CLASS.
         */


    }
}
