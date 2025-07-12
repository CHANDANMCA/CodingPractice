package com.sixjuly;

public class ArraysTest {

    public static int[] delete(int[] arr, int num){
        int[] arr1=new int[arr.length-1];
        int index=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != num) {
                arr1[index++] = arr[i];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 0, 5, 7, 0, 8};

        int[] delete = delete(arr, 1);
        for(int a:delete){
            System.out.println(a);
        }
    }
}
