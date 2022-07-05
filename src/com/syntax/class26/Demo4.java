package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Zameer");
        names.add("Kevin");
        names.add("Pietro");
        names.add("Abdo");
        System.out.println(names);
        names.remove("Kevin");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);



    }
}
