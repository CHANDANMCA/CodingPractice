package com;
import java.util.*;

public class TwoSumIndices {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8, 3};
        int target = 6;

       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==target){
                   System.out.println(i+","+j);
                   return;
               }
           }
       }
        System.out.println("not found index");
    }
}
