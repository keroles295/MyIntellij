package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo5 {
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);
        Iterator<String >iterator= fruits.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
            
        }
        for(String frt:fruits){
            System.out.println("frt = " + frt);
        }

    }
}
