package Feb15Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> s= new TreeSet();
        s.add(1);
        s.add(3);
        s.add(5);
        s.add(7);
        s.add(9);

        TreeSet<Integer> s1= new TreeSet();
        s1.add(2);
        s1.add(4);
        s1.add(6);
        s1.add(8);
        s1.add(10);

        // s.addAll(s1);
        //access way1
        for(Integer i:s){
            System.out.println(i);
        }
        System.out.println("*************************************");
        // accesss way 2
        Object arr[]=s.toArray();
        for(int i=0;i<s.size();i++){
            System.out.println(arr[i]);
        }
        System.out.println("****************************************");
        //access way3
        //USING ITTRATOR
        Iterator<Integer>it=s.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("**************Set of Methods of Set***************");
        s.addAll(s1);
        System.out.println("Contains or not==>"+s.contains(3));
        System.out.println("6 Contains or not==>"+s.contains(6));
        System.out.println("Contains s1 or not ==>"+s.containsAll(s1));
        System.out.println("Empty or not==>"+s.isEmpty());
        System.out.println("Equal or nor==>"+s.equals(s1));
        System.out.println("Size is==>"+s.size());
        System.out.println("********************************************");
        System.out.println("Before retain::"+s);
        System.out.println("Retain==>"+s.retainAll(s1));
        System.out.println("After Retain==>"+s);
        System.out.println("*********************************************");

//        Treeset
//        1) Null ==> cannot contain null values
//        2) Duplicate==> Not Allowed
//        3) Order==> Insertion Order
    }
}