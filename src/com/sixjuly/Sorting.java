package com.sixjuly;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {


    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,3,47,4,8,9);
        arr.stream().sorted((a,b)->b-a).forEach(System.out::print);

    }
}
