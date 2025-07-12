package com.sixjuly;

import java.util.HashSet;

public class LongestSubString {
    static String logestSubString(String str) {

        String longestStillNow = "";
        String longestOveral = "";
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (hs.contains(ch)) {
                longestStillNow = "";
                hs.clear();
            }
            hs.add(ch);
            longestStillNow += ch;
            if (longestOveral.length() < longestStillNow.length()) {
                longestOveral = longestStillNow;
            }
        }
        return longestOveral;
    }

    public static void main(String[] args) {
        String name = "chandan";
        System.out.println(logestSubString(name));

    }
}
