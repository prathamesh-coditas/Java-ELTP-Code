package Feb16A;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {
        Queue <Integer> q1= new LinkedList<>();
        //add elements
        q1.add(10);
        q1.add(5);
        q1.add(6);
        q1.add(2);
        q1.add(3);
            System.out.println("First Element  "+q1.element());
        System.out.println("Peek==>"+q1.peek());
        System.out.println("Next Element is "+q1.element());
        System.out.println("Remove Element"+q1.remove());
        System.out.println("Next Element is "+q1.element());

        //Iterator
        Iterator itr=q1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        q1.poll();
        System.out.println("Head Element is "+q1.element());
        System.out.println("********************************");
        q1.offer(23);
        q1.offer(26);
        q1.add(56);
        System.out.println("Check the contained in Linked List"+q1.contains(26));
        System.out.println("******************************************************");
        Object arr[]= q1.toArray();
        for(int i=0;i<q1.size();i++){
            System.out.println(arr[i]);
        }
        /*
        First Element  10
Peek==>10
Next Element is 10
Remove Element10
Next Element is 5
5
6
2
3
Head Element is 6
********************************
Check the contained in Linked Listtrue
******************************************************
6
2
3
23
26
56

         */

    }
}
