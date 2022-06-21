package com.syntax.class16;

public class StudentsH {
    String name;
    int sID;
    static int nOfS = 280;
    void studInfo(){
        System.out.println("The student name is "+name+" his Student ID is "+sID);
    }


    public static void main(String[] args) {

        StudentsH s1= new StudentsH();
        s1.name="Peter";
        s1.sID=12345;
        s1.nOfS++;
        StudentsH s2= new StudentsH();
        s2.name="ElHoary";
        s2.sID=12344;
        s2.nOfS++;
        StudentsH s3= new StudentsH();
        s3.name="Mena";
        s3.sID=12334;
        s3.nOfS++;
        s1.studInfo();
        s2.studInfo();
        s3.studInfo();

        System.out.println("The total number of the students = "+nOfS);



    }
}