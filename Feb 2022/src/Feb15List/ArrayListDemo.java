package Feb15List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(3);
        s.add(5);
        s.add(7);
        s.add(9);

        ArrayList<Integer> s1 = new ArrayList<>();
        s1.add(2);
        s1.add(4);
        s1.add(6);
        s1.add(8);
        s1.add(10);

        // s.addAll(s1);
        //access way1
        for (Integer i : s) {
            System.out.println(i);
        }
        System.out.println("*************************************");
        // access way 2
        Object arr[] = s.toArray();
        for (int i = 0; i < s.size(); i++) {
            System.out.println(arr[i]);
        }
        System.out.println("****************************************");
        //access way3
        //Using Iterator
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("**************Set of Methods of Set***************");
        s.addAll(s1);
        System.out.println("Contains or not==>" + s.contains(3));
        System.out.println("6 Contains or not==>" + s.contains(6));
        System.out.println("Contains s1 or not ==>" + s.containsAll(s1));
        System.out.println("Empty or not==>" + s.isEmpty());
        System.out.println("Equal or nor==>" + s.equals(s1));
        System.out.println("Size is==>" + s.size());
        System.out.println("********************************************");
        System.out.println("Before retain::" + s);
        System.out.println("Retain==>" + s.retainAll(s1));
        System.out.println("After Retain==>" + s);
        System.out.println("*********************************************");
        System.out.println("Adding element at particular index==>"+" 1000");
        s.add(0,1000);
        System.out.println("After adding the element==>"+s.get(0));

    }
}
/*
ArrayLinkList=== Work
         1) Null ==> null value allowed
        2) Duplicate==> Allowed
        3) Order==> Insertion Order
 */