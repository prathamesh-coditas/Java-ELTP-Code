package com.prathamesh.jan20;

import java.util.Arrays;

class JuggedAddition{
    public void printAddition(int[][] arr1,int[][] arr2){
        for(int i =0;i<arr1.length;i++){
            for(int j = 0; j<arr1[i].length;j++){
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of two jagged array is");
        System.out.println(Arrays.deepToString(arr1));
    }

}
public class QTwoFiveAssignment {
    public static void main(String[] args) {
        JuggedAddition j1=new JuggedAddition();
        int[][] arr1 = {{1, 3}, {6, 4, 5}};
        int[][] arr2 = {{1, 3}, {6, 4, 5}};
        j1.printAddition(arr1,arr2);
    }
}
