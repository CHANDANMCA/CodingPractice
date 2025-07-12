package com.sixjuly;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};
        int[] merge = new int[arr2.length + arr3.length];

        //System.out.println();
        System.arraycopy(arr2, 0, merge, 0, arr2.length);

        System.arraycopy(arr3, 0, merge, arr3.length, arr3.length);
        for (int a : merge) {
            System.out.println(a);
        }

    }
}
