package Feb16A.Feb16;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue= new PriorityQueue<String>();
        //add elements
        queue.add("B");
        queue.add("A");
        queue.add("C");
        queue.add("E");
        queue.add("D");
        System.out.println("First Element  "+queue.element());
        System.out.println("Peek==>"+queue.peek());
        System.out.println("Next Element is "+queue.element());
        System.out.println("Remove Element"+queue.remove());
        System.out.println("Next Element is "+queue.element());

        //Iterator
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.poll();
        System.out.println("Head Element is "+queue.element());
        System.out.println("********************************");
        //deque










    }
}
