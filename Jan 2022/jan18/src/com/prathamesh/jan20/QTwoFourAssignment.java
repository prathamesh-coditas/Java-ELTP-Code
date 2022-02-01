package com.prathamesh.jan20;

public class QTwoFourAssignment {
    public static void main(String[] args) {
        String[] name = new String[]{"pratham", "prathamesh", "Pratha", "prathamesh", "Prathamesh"};
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i]==name[j]) {
                    System.out.println(name[i]);
                }

            }
        }
    }
}

