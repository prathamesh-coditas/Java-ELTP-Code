package FEB11;

public class Q2 extends Thread{
    @Override
    public void run() {
        System.out.println("In Thread");
    }

    public static void main(String[] args) {
        Q2 q2= new Q2();
        q2.start();
        q2.run();
    }
}
