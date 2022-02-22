package Feb22;

import java.util.*;
public class Q3	 {
    public static void main(String[] args) {
        Set<String> set = Set.of("BMW", "Audi", "Merc");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
// for Map
        Map<String, Integer> map = Map.of("BMW", 1 , "Audi", 2, "Merc", 3);
        for(Map.Entry<String, Integer>  et : map.entrySet()){
            System.out.println("value  "+et.getValue() +"  "+"  Key "+ et.getKey());
        }
    }
}
