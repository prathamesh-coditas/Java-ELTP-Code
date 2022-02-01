package com.prathamesh.jan21;


public class Q4 {
    public static void main(String[] args) {
        String str = "   Prathmesh Chaudhari        ";
        String str1 = str.trim();
        System.out.println("String after the trim operation:: " + str1);
        System.out.println(str1.charAt(5));
        System.out.println("Unicode value of Character present at" +
                " index 5 is::" + str1.codePointAt(5));
    }
}
