package Feb22;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    @SafeVarargs
    private final void print(List... Cars)
    {
        for (List<String> topic : Cars) {
            System.out.println(topic);
        }
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        List<String> list = new ArrayList<String>();
        list.add("Maruti");
        list.add("BMW");
        list.add("Skoda");
        list.add("Kia");
        obj.print(list);


    }
}