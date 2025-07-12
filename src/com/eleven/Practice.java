package com.eleven;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2 !=0)
            System.out.println("Hello");
        else if(x<=10) System.out.println("Hi");
                if(x>11 && x<=20) System.out.println("Hello");
                if(x>20) System.out.println("Bye");



    }
}
