package com.syntax.class17;


import com.syntax.class16.Dog;

public class Tester {
    public static void main(String[] args) {
        /*
        If classes exist inside the same package
        they are imported automatically
         */
        //Manger =" I can not access it";//
        Employee employ=new Employee();
        Dog doge= new Dog();
        employ.name="Lolo";
        //employ.salary=12345;// because it is private in Employee class
        employ.department="IT USA";
        employ.printDepartment();
        employ.printName();



    }
}
