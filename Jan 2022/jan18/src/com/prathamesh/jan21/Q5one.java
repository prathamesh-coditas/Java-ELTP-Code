package com.prathamesh.jan21;
import java.util.Scanner;
class SortLength {
    public void sortLength(String []str) {
        for ( int i = 1 ; i < str.length ; i++ ) {
            String temp = str[i];
            int j = i - 1;
            while ( j >= 0 && temp.length() < str[j].length() ) {
                str[j + 1] = str[j] ;
                j-- ;
            }
            str[ j + 1 ] = temp ;
        }
        System.out.print("After Sorting: ");
        for ( String string : str )
            System.out.print( string + " " );
        System.out.println();
    }
}
public class Q5one {
    public static void main(String[] args) {


    SortLength obj = new SortLength();
    Scanner scn = new Scanner(System.in);
    int n = 5;
    String[] str = new String[n];
        for (int i = 0 ; i < n ; i++)
            str[i] = scn.next();
        obj.sortLength(str);
        System.out.println("After Replacement: ");

        for (String string : str) {
        string = string.toLowerCase();
        char[] c = string.toCharArray();
        for (int i = 0 ; i < c.length ; i++ ){
            switch(c[i]) {
                case 'a' :
                    c[i] = 'b';
                    break;
                case 'e' :
                    c[i] = 'f';
                            break;
                case 'i' :
                    c[i] = 'j';
                    break;
                case 'o' :
                    c[i] = 'p';
                    break;
                case 'u' :
                    c[i] = 'v';
                    break;
                default :
                    break;
            }
            System.out.print(c[i]);
        }
        System.out.print(" ");
    }
        System.out.println();
}
}

