package com.company;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4,3));
        System.out.println(add("5", "8"));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static int add(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}