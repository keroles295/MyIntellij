package com.syntax.class22;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHolidays=8000;
    void calcaulatePrintSalary(){
        System.out.println(baseSalary);
    }
    void calcaulatePrintHoliday(){
        System.out.println(baseHolidays);
    }

}
class Managers extends Employee{
    void calcaulatePrintSalary(){
        System.out.println(baseSalary*2+20000);
    }
    void calcaulatePrintHoliday(){
        System.out.println(baseHolidays*2+10000);
    }

}
class Developer extends Employee{
    void calcaulatePrintSalary(){
        System.out.println(baseSalary*2+5000);
    }
    void calcaulatePrintHoliday(){
        System.out.println(baseHolidays*2+4000);
    }
}
class QA extends Employee{
    void calcaulatePrintSalary(){
        System.out.println(baseSalary*2+9000);
    }
    void calcaulatePrintHoliday(){
        System.out.println(baseHolidays*2+9000);
    }
    }
class OfficeBOy extends Employee{

        }



