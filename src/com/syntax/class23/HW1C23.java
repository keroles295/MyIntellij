package com.syntax.class23;

public class HW1C23 {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism
}
class Student{
    public void study(){
        System.out.println("Student goes to school 5 days");
    }
    public void doHW(){
        System.out.println("Student does the Homework everyday");
    }
    public void goToLib(){
        System.out.println("Student goes to the library once a week");
    }
    public void doResearch(){
        System.out.println("Student does researches every two weeks");
    }

}
class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Student does not have to go to school");

    }

    @Override
    public void doHW() {
        super.doHW();

    }

    @Override
    public void goToLib() {
        System.out.println("Student does not go to the library");

    }

    @Override
    public void doResearch() {
        System.out.println("Student does researches before every class");

    }

}
class CollegeStudent extends Student{
    @Override
    public void study() {
        System.out.println("The college Student goes to school 4 days");

    }

    @Override
    public void doHW() {
        super.doHW();

    }

    @Override
    public void goToLib() {
        System.out.println("Student goes to the library twice a week");

    }

    @Override
    public void doResearch() {
        System.out.println("Student does researches every week");

    }
}
class SchoolStudent extends Student{
    @Override
    public void study() {
        System.out.println("The School Student goes to school 5 days");

    }

    @Override
    public void doHW() {
        System.out.println("Student does the Homework every 3 day");

    }

    @Override
    public void goToLib() {
        System.out.println("Student goes to the library once every two weeks");

    }

    @Override
    public void doResearch() {
        super.doResearch();

    }
}
