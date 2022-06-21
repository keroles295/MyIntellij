package com.syntax.class17;

public class HWWithAshgerT1 {
    String empID;
    int salary;
    //whenever we are sure that two objects of class can have different values for
    // a variable or if we have to share that variable between two or mor methods of that class we should
    //always go with instance varaible.
    static String cEO="Sumair";

    public static void main(String[] args) {
        HWWithAshgerT1 em=new  HWWithAshgerT1();
        em.empID="I1234";
        em.salary=23456;

        HWWithAshgerT1 em1= new  HWWithAshgerT1();
        em1.salary=2345678;
        em1.empID="I12345";
        System.out.println(em.empID);
        System.out.println(em.salary);
        System.out.println(em1.empID);
        System.out.println(em1.salary);

    }

}
