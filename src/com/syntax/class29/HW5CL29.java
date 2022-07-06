package com.syntax.class29;

import java.util.*;

public class HW5CL29 {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object.
    // Print each object details.

}
class Person{
    private String name;
    private  String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void displayInfo(){
        System.out.println(name+" "+lastName+" is "+age+" years old and his/her salary is "+salary);
    }
}
class TestP{
    public static void main(String[] args) {

        TreeMap<String, Person>map=new TreeMap<>();
        map.put("Id12", new Person("Pito", "Botros", 24, 1123456));
        map.put("Id13", new Person("Mila", "Botros", 22, 3323445));
        map.put("Id14", new Person("Mariam", "Khalil", 24, 5544456));
        map.put("Id15", new Person("Kiroles", "Mena", 24, 6623456));
        map.put("Id18", new Person("Mena", "Adel", 24, 23456));
        map.put("Id19", new Person("Atonio", "BoShra", 24, 9456));
        map.put("Id17", new Person("Beshoy", "Weasa", 24, 7456));
        map.put("Id11", new Person("Nabil", "Nabil", 24, 999456));
        Collection<Map.Entry<String, Person>> inf=map.entrySet();
        for (Map.Entry<String, Person> stringPersonEntry : inf) {
            System.out.println("Person info = " + stringPersonEntry.getKey());
            stringPersonEntry.getValue().displayInfo();
        }


    }}
