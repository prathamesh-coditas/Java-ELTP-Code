package com.prathamesh.jan21;

import java.util.Scanner;

class Operations {
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
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }

}


public class Q1 {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        Scanner sc = new Scanner(System.in);
        int size = 3;
        String[] arr = new String[size];
        System.out.print("Enter the First String:: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
            System.out.println("Enter Next name:: ");
        }
        op1.sort(arr, size);
        op1.printArraystring(arr,size);

    }
}


