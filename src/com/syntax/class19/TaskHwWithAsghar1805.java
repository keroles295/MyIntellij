package com.syntax.class19;

public class TaskHwWithAsghar1805 {
    String name;
    double gM1;
    double gM2;
    double gM3;

    TaskHwWithAsghar1805(String name, double gradeM1, double gradeM2, double gradeM3){
        gM1=gradeM1;
        gM2=gradeM2;
        gM3=gradeM3;
        this.name=name;
    }
    public void caculatAverage(){
        double averageGrade=(gM1+gM2+gM3)/3;
        System.out.println(name);
    }
}
