package com.syntax.class24;

public class StudentsTester {
    public static void main(String[] args) {
       Students [] students1={new SchoolStudent1(), new CollegeStydent1(), new SyntaxStudent1()};
       for(Students stN: students1){
           stN.doHW1();
           stN.practice();
           stN.study();
           System.out.println("==========");
       }
       for(int i=0; i<students1.length; i++){
           students1[i].study();
           students1[i].practice();
           students1[i].doHW1();

       }




    }
}
