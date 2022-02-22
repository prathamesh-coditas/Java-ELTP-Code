package Feb18;

import java.util.PriorityQueue;

enum Signal {
    RED("STOP"),GREEN("GO"),YELLOW("DRIVE VERY SLOW");
    private String action;
    public String getAction()
    {
        return this.action;
    }

    private Signal(String action)
    {
        this.action = action;
    }
}

public class Q2 {
    public static void main(String[] args) {

        PriorityQueue q1= new PriorityQueue();
        q1.add(10);
        q1.add(15);
        q1.add(20);
        q1.add(5);
        q1.poll();
        q1.peek();
        q1.clear();
        System.out.println(q1);
        Signal[] s1 = Signal.values();
        for (Signal signal : s1)
        {
            System.out.println("name : " + signal.name() +
                    " means " + signal.getAction() );
        }
        /*
         name : RED means: STOP
        name : GREEN means: GO
        name : YELLOW means: DRIVE VERY SLOW

         */
    }
}
