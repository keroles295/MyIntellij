package com.syntax.class28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HW4C28 {
    public static void main(String[] args) {
        //Create a Set collection that will hold Objects of Student Type.
        // In this set we do not care about the insertion order.
        // Each student object should have name and studentID.
        // Display name of each student.
        Set<HW4C28>studentType=new HashSet<>();
        studentType.add(new HW4C28("Keroles",12 ));
        studentType.add(new HW4C28("Pietro", 13));
        studentType.add(new HW4C28("Mariam", 14));
        studentType.add(new HW4C28("Mike", 15));
        studentType.add(new HW4C28("Ibram", 16));
        studentType.add(new HW4C28("Ahmed", 17));
        studentType.add(new HW4C28("Ali", 18));
        for (HW4C28 student : studentType) {
            System.out.println("studentName = " + student.name);
            System.out.println("student ID = " + student.stunetID);
        }



        }
    String name;
    int stunetID;

    HW4C28(String name, int stunetID) {
        this.name = name;
        this.stunetID = stunetID;


    }

}

