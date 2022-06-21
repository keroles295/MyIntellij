package com.syntax.class16;

public class SyntaxEmployee {
    int empID;
    int salary;
    static String setCEO ="Sumair";
    void infoDisplay(){
        System.out.println("The empID is"+empID+" his salary is "+salary+" and the CEO is"+setCEO);
    }

    public static void main(String[] args) {
        SyntaxEmployee em1= new SyntaxEmployee();
        em1.empID=12343;
        em1.salary=276380;
        em1.infoDisplay();

        SyntaxEmployee em2=new SyntaxEmployee();
        em2.empID=23456;
        em2.salary=200000;
        em2.infoDisplay();





    }


}
