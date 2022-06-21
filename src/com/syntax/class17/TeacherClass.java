package com.syntax.class17;

public class TeacherClass {
    public static void main(String[] args) {
        Teacher techer=new Teacher();
        techer.name="Tost";
        techer.schoolName="Naisyty";
        /*
        Because printInfoo is public, so we can call it in
        other classes and because its the part of teacher
        class it can access the private fields
         */
        techer.printInfoo();
    }
}
