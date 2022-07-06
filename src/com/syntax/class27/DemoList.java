package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        //we can store the object of a class inside a variable of type parent class
        //interface if that class implements that
        List<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("Tara");
        legends.add("Hefht");
        legends.add("Naveed");

        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Pietro"));
        Object[] arr= legends.toArray();
        System.out.println(arr[0]);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String>someStudents=new ArrayList<>();
        someStudents.add("Naveed");
        someStudents.add("Tara");
        System.out.println(legends.containsAll(someStudents));






    }
}
