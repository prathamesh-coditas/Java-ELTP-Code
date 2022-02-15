package Feb15List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new Vector<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l1.add(null);
        List<Integer> l2 = new Vector<>();
        l2.add(5);
        l2.add(6);
        l2.add(7);

        // Itereating by for loop
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("**********************************************");
        //      // Itereating by for each
        for (Integer i: l1){
            System.out.println(i);
        }
        //add one list into another list
        l2.addAll(l1);
        //      // Itereating by  iterator
        Iterator<Integer> it = l2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("**********************************************");

        // list of method
        System.out.println(l1.isEmpty());
        System.out.println(l1.remove(1));
        System.out.println(l1.retainAll(l2));
        System.out.println(l1.contains(3));
    }
}
