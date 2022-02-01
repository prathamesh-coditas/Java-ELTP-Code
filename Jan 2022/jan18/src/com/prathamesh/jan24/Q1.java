package com.prathamesh.jan24;
import java.util.StringTokenizer;

class Case_one {
    public void showToken(String str) {
        StringTokenizer s2 = new StringTokenizer(str, "+()%/[0-9]", false);
        while (s2.hasMoreTokens()) {
            System.out.println(s2.nextToken());
        }
    }
}

class Case_Two {
    public void showToken(String str) { StringTokenizer s1 = new StringTokenizer(str, "() +%*/", false);
        while (s1.hasMoreElements()) {
            System.out.println(s1.nextToken());
        }
        System.out.println("*******************");
        StringTokenizer s2 = new StringTokenizer(str, "320() ", false);
        while (s2.hasMoreElements()) {
            System.out.println(s2.nextToken());
        }
    }

}


public class Q1 {
    public static void main(String[] args) {
        String str = "3 + (20%2) * (20/2)";
        Case_one c1 = new Case_one();
        Case_Two c2 = new Case_Two();
        c1.showToken(str);
        System.out.println("*********************");
        c2.showToken(str);
    }
}
