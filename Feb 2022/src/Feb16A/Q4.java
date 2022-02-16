package Feb16A;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Q4 {
    public static void main(String[] args) {

        NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();

        // Add elements using put()
        nmap.put(3, "Prathamesh");
        nmap.put(5, "Chaudhari");
        nmap.put(2, "Nilkanth");
        nmap.put(4, "Bhaskar");
        // Print the contents on the console
        System.out.println("Mappings of NavigableMap : " + nmap);
        // Remove elements using remove()
        nmap.remove(4);
        //after removal
        System.out.println("after remove operation : "+ nmap);
        // Accessing the elements using get()
        System.out.println("*****************************************************");
        System.out.println(nmap.get(3));
        System.out.println(nmap.get(5));
        System.out.println(nmap.get(1));
        System.out.println("********************************************************");
        // set of keys using keySet()
        System.out.println("keyset: " + nmap.keySet());
        System.out.println("************************************************************");
        //Transversing on map
        Iterator<NavigableMap.Entry<Integer, String> > itr= nmap.entrySet().iterator();
        while (itr.hasNext()) {
            NavigableMap.Entry<Integer, String> tr = itr.next();
            System.out.println("Key = " + tr.getKey() + ", Value = " + tr.getValue());
        }
        System.out.println("******************************************************************");
        System.out.println("first entry:"+nmap.firstEntry());
        System.out.println("******************************************************************");
        System.out.println("last entry:"+nmap.lastEntry());
        System.out.println("****************************************************************");
        System.out.println("Floor key Returns the greatest key less than or equal to the given key, or null if there is no such key.:"+nmap.floorKey(5));
        System.out.println("*******************************************************************");
        System.out.println("After the descending map : " + nmap.descendingMap());
    }

}
