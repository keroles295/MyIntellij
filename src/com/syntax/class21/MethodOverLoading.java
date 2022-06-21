package com.syntax.class21;

public class MethodOverLoading {
    static void add(int n1, int n2){
        System.out.println(n1+n2);
    }
    static void add(int n1, int n2, double n3){
        System.out.println(n1+n2+n3);
    }
    static void add(double n1, int n2){
        System.out.println(n1+n2);
    }
    static void add(double n1, double n2){
        System.out.println(n1+n2);
    }

    public static void main(String[] args) {
        add(13,23);
        add(12, 11,2.9);
        add(1.9, 2.9);
        add(1.98, 780);



    }
}
