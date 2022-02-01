package com.prathamesh.jan21;

import java.util.Arrays;
import java.util.Scanner;


class Operation {
    public void sort(String[] s, int n) {
        for (int i = 1; i < n; i++) {
            String temp = s[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = temp;
        }
    }

    public void printArraystring(String str[], int n) {
//        for (int i = 0; i < n; i++)
//            System.out.print(str[i] + " ");
        for (String a : str) {
            System.out.println(a + "");
        }
    }

    public boolean isVowel(char ch) {
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u') {
            return false;
        }
        return true;
    }

    public String replace_Consonants(char[] s) {
        // Start traversing the string
        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i])) {
                // if character is z,
                // than replace it with character b
                if (s[i] == 'z') {
                    s[i] = 'b';
                }

                // if the alphabet is not z
                else {

                    // replace the element with
                    // next immediate alphabet
                    s[i] = (char) (s[i] + 1);

                    // if next immediate alphabet is vowel,
                    // than take next 2nd immediate alphabet
                    // (since no two vowels occurs consecutively
                    // in alphabets) hence no further
                    // checking is required
                    if (isVowel(s[i])) {
                        s[i] = (char) (s[i] + 1);
                    }
                }
            }
        }
        return String.valueOf(s);
    }
}

class GFG {

    // Function to check if a character is
    // vowel or not
    public boolean isVowel(char ch) {
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u') {
            return false;
        }
        return true;
    }

    // Function that replaces consonant with
    // next immediate consonant alphabetically
    public String replaceConsonants(char[] s) {
        // Start traversing the string
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 2) {

            }
            if (!isVowel(s[i])) {

                // if character is z,
                // than replace it with character b
                if (s[i] == 'z') {
                    s[i] = 'b';
                }

                // if the alphabet is not z
                else {

                    // replace the element with
                    // next immediate alphabet
                    s[i] = (char) (s[i] + 1);

                    // if next immediate alphabet is vowel,
                    // than take next 2nd immediate alphabet
                    // (since no two vowels occurs consecutively
                    // in alphabets) hence no further
                    // checking is required
                    if (isVowel(s[i])) {
                        s[i] = (char) (s[i] + 1);
                    }
                }
            }
        }
        return String.valueOf(s);
    }


}

public class Q5 {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        Scanner sc = new Scanner(System.in);
        int size = 5;
        String[] arr = new String[size];
        System.out.print("Enter the First Name:: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
            System.out.print("Enter Next name:: ");
        }
        System.out.println(Arrays.toString(arr));
        op1.sort(arr, size);
        op1.printArraystring(arr, size);
        System.out.println("");

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            sb.append(2);
        }
        String str = sb.toString();
        System.out.println(str);

        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        GFG g1 = new GFG();
        System.out.println(g1.replaceConsonants(ch));
    }
}


