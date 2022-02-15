package Feb15Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new Hashtable<Integer, String>();
        m.put(1, "A");
        m.put(3, "B");
        m.put(5, "C");
        m.put(7, "D");
        m.put(9, "E");
        //Travelles through the map
        for (Map.Entry m1 : m.entrySet()) {
            System.out.println("Key==>" + m1.getKey() + " " + "==>Value:" + m1.getValue());
        }
        //Method
        System.out.println("*************************************");
        System.out.println("Contains key or not==>" + m.containsKey(3));
        System.out.println("Contains valur or not==>" + m.containsValue("D"));
        System.out.println("Size is==>" + m.size());
        System.out.println("Empty==>" + m.isEmpty());
        m.replace(1, "Prathamesh");
        System.out.println(m.get(1));



/*
    HashTable==>
            1) Null ==> Allowed
            2) Duplicate ==> Not Allowed
            3) Order ==> The stored data is neither in sorted order nor preserves the insertion order.
*/
    }
}

