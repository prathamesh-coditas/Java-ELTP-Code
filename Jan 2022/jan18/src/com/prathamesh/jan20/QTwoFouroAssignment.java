package com.prathamesh.jan20;

import java.util.Arrays;
class Remove_Duplicate{
    public void printArrayWoDuplicate(int []arr){
        int n= arr.length;
        int[] arr1= new int[n];
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i< n-1;i++){
            if((arr[i]!= arr[i+1])){
                arr1[j++]= arr[i];
            }
        }
        arr1[j++]= arr[arr.length-1];
        for (int k : arr1){
            if(k!=0)
                System.out.println(k);
        }

    }
}
public class QTwoFouroAssignment {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,3,6,7,2,4,9,2,6,7,8,9};
        Remove_Duplicate obj = new Remove_Duplicate();
        obj.printArrayWoDuplicate(arr);
    }
}
