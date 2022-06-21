package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployerTester {
    public static void main(String[] args) {


        Employee nee=new  Employee();
        nee.name="NOmoi";
        System.out.println(nee.manager);
        nee.printMang();


        //nee.salary=234567;//we can not acces it is private
       // nee.department="IT zipooo";//Because we can not acess





    }
}
