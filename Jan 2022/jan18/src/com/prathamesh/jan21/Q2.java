package com.prathamesh.jan21;

import java.util.Scanner;

class Count {
    public int countVowels(String str) {
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e'
                    || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o'
                    || str1.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public int countConsonants(String str) {
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e'
                    || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o'
                    || str1.charAt(i) == 'u') {
            } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Count c1 = new Count();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:: ");
        String str = sc.nextLine();
        int vowel_Count = c1.countVowels(str);
        int consonants_Count = c1.countConsonants(str);
        System.out.println("Number of vowels in String:: " + vowel_Count);
        System.out.println("Number of consonants in String:: " + consonants_Count);
    }
}
