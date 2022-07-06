package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(44);
        numbers.add(56);
        numbers.add(78);
        numbers.add(12);
        numbers.add(44);
        System.out.println(numbers);
        // when we pass the list to the constrcutor of the Set and java will create
                // a set out of that list using the same approach we get a list  back from the set
                numbers=new ArrayList<>(new LinkedHashSet<>(numbers));
      /*  LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(); //Creating a set
        linkedHashSet.addAll(numbers); // adding all the elements from the list to the set
        numbers=new ArrayList<>(); //create a new array
        numbers.addAll(linkedHashSet); // adding unique elements*/

        System.out.println(numbers);




    }
}
