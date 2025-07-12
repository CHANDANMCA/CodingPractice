package com.ten.july;

import java.util.Map;
import java.util.Stack;

public class ValidateBracket {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) stack.push(c);
            else if (stack.isEmpty() || stack.pop() != map.get(c)) {
                return false;
            }


        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "]{[)}(";

        System.out.println(isValid(s));
    }
}
