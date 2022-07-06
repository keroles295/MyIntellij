package com.syntax.class28;

import java.util.HashMap;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);

    }
}
