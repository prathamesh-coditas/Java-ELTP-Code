package Feb15;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionNeedDemo {
    public static void main(String[] args) {
        int a[] = new int []{1,2,3,4,5,6,7,8};
        Vector<Integer>v=new Vector<>();
        Hashtable<Integer,String>h= new Hashtable<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        h.put(1,"Prathamesh");
        h.put(2,"Rutuja");
        h.put(3,"Choti");
        h.put(4,"");

        System.out.println(a[3]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));
    }
}
