package com.syntax.class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> sub=new ArrayList<>();
        sub.add("SDFG");
        sub.add("Manual Test");
        sub.add("Java");
        sub.add("Git");
        sub.add("Selenium");
        sub.add(1, "Jira");
        System.out.println(sub.indexOf("Java"));
        System.out.println(sub.size());
        sub.remove("Git");
        System.out.println("sub = " + sub);//soutv----->to printout an array the code for you
        for (int i = args.length - 1; i >= 0; i--) {
            String arg = args[i]; //rit--->this to write a in a reverse
            System.out.println(sub.contains("Selenium"));
            sub.get(0);
            System.out.println("sub.get(0) = " +sub.get(0));
            System.out.println("sub = " + sub);
            sub.clear();
            System.out.println("sub = " + sub);
            


        }

    }
}
