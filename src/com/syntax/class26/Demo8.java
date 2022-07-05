package com.syntax.class26;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subSeen=new ArrayList<>();
        subSeen.add("SDFG");
        subSeen.add("Manual Test");
        subSeen.add("Java");
        subSeen.add("Git");
        subSeen.add("Selenium");

        ArrayList<String> futureSub=new ArrayList<>();
        futureSub.add("TestNG");
        futureSub.add("Cucumber");
        futureSub.add("SQL");
        futureSub.add("API");
        futureSub.add("Jenkins");
        futureSub.add("AWS");
        futureSub.add("Docker");
        futureSub.add("APIUM");

        ArrayList<String> allSub=new ArrayList<>();
        allSub.addAll(subSeen);
        allSub.addAll(futureSub);
        System.out.println("allSub = " + allSub);

        ArrayList<String> allSub2=new ArrayList<>();//shift +end
        allSub.addAll(subSeen);
        allSub.addAll(1, futureSub);//
        //inser the data starting from index 1 and will push the existing data towards the end
        System.out.println("allSub2 = " + allSub2);




    }
}
