package com.syntax.class18;

public class HW5Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.

    String studentName;
    double mathGrade;
    double physicsGrade;
    double historyGrade;
    public HW5Students(String name, double mG, double pG, double hG){
        studentName=name;
        mathGrade=mG;
        physicsGrade=pG;
        historyGrade=hG;

    }
    double  getAvr(){
        return (mathGrade+physicsGrade+historyGrade)/(3);
    }
    public void printInfo(){
        System.out.println(studentName+" his average is "+getAvr());
    }








}
