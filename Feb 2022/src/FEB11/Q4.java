package FEB11;

class t2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 12; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Q4 extends Thread {
    public static void main(String[] args) {
        t2 obj1 = new t2();
        Thread t = new Thread(obj1);
        t.start();
        //Output
        /*
            v1 3 5 7 9 11
            Process finished with exit code 0
         */
    }
}
