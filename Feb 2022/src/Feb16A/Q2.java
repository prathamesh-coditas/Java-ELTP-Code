package Feb16A;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {

        ArrayDeque<Integer> de = new ArrayDeque<>();

        de.offer(23);
        de.offerFirst(12);
        de.offerLast(45);
        de.offer(26);
        de.add(56);
        de.addLast(21);
        de.push(76);
        de.push(26);

        System.out.println(de);
        System.out.println("adq is empty : "+de.isEmpty());
        System.out.println("size of adq is : "+de.size());
        System.out.println("does adq contain 45 : "+de.contains(45));

        System.out.println("peek element is "+de.peek());
        System.out.println("peek first element is "+de.peekFirst());
        System.out.println("peek last element is "+de.peekLast());

        System.out.println(de.poll());
        System.out.println("Poll() " +de);

        System.out.println(de.pollFirst());
        System.out.println("pollFirst() " +de);

        System.out.println(de.pollLast());
        System.out.println("pollLast() " +de);

        System.out.println(de);
        System.out.println(de.element());
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
        System.out.println(de.pop());
        de.removeFirstOccurrence(26);
        System.out.println(de);
    }

}









