package com.prathamesh.jan20;
import java.util.Arrays;
import java.util.Collections;
public class QTwoTwoAssignment {
    public static void main(String[] args) {
        Integer a[] = {1,7,5,9,15,23,12};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort( a, Collections.reverseOrder());
        for (int i:a){
            System.out.println(i);
      }
    }
}
