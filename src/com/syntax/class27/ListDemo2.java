package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends=new ArrayList<>(); //recommended
        legends.add("Hamid");
        legends.add("Tara");
        legends.add("Hefht");
        legends.add("Naveed");
        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Hundun");

        ArrayList<String >allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
        allStudents.removeAll(moreStudents);//this the opposite to addAll method
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);


    }
}