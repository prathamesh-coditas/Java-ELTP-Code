package com.prathamesh.jan21;
import java.util.Arrays;
import java.util.Scanner;

class Duplicate {
    public String removeDuplicates(char str[]) {
        int n = str.length;
        int index = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}

public class Q3 {
    public static void main(String[] args) {
        Duplicate d1 = new Duplicate();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:: ");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        char str2[] = str1.toCharArray();
        String remove_duplicate = d1.removeDuplicates(str2);
        System.out.println("String after removal of Duplicates::" + remove_duplicate);

    }
}