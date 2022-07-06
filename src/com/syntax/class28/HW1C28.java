package com.syntax.class28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW1C28 {
    public static void main(String[] args) {
       // How can you remove all duplicates from ArrayList?
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        HashSet<String> alistHash=new HashSet<>();
        alistHash.addAll(aList);
        aList.clear();
        aList.addAll(alistHash);
        System.out.println("aList = " + aList);



    }
}
