package com.prathamesh.jan24;

import java.util.StringTokenizer;

class StringTokenDemo {
    public void showToken() {
        StringTokenizer s1 = new StringTokenizer("Hello Welcome to Coditas Family, This out extented Family", " ");
        System.out.println(s1.countTokens());

        while (s1.hasMoreTokens()) {
            System.out.println(s1.nextToken());
        }
        System.out.println("*****************************");

        StringTokenizer s2 = new StringTokenizer("Hello/Welcome/to/Coditas/Family,/This out extented Family", "/", true);
        while ((s2.hasMoreElements())) {
            System.out.println(s2.nextToken());
        }

    }
}

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenDemo s1 = new StringTokenDemo();
        s1.showToken();

    }
}
