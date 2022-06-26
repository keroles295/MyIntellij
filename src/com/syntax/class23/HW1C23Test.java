package com.syntax.class23;

public class HW1C23Test {
    public static void main(String[] args) {
        Student [] studentsTest={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student student:studentsTest){
            student.doHW();
            student.doResearch();
            student.goToLib();
            student.study();
            System.out.println("=================================================");
            System.out.println("=================================================");
        }



    }
}
