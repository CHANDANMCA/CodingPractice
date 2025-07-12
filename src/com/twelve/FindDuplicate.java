package com.twelve;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80);
        HashSet<Integer> hs = new HashSet<>();
       // list.stream().filter(s -> !hs.add(s)).forEach(System.out::println);
        list.stream().map(s->s*2).forEach(System.out::println);*/
        String name="hello java programming language of hello of";
        List<String> list = Arrays.asList(name.split(" "));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
