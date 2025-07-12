package com.sixjuly;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,4,7,3};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);

            }
        }
        System.out.println("Duplicates"+duplicates);
    }
}
