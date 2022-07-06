package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW1CL29 {
    // *Create a class Insurance that will have an attribute as insuranceName and unimplemented
    // behaviour as getQuote and cancelInsurance.
    //Create 3 subclasses Car, Pet, Health.
    //Car class has it's own attribute as carModel and Class Pet has petType attribute.
    //Create 3 objects of the sub classes and store them in ArrayList.
    //Using for loop/advanced for loop/ iterator access all methods of the class.*/
    public static void main(String[] args) {
        List<Insurancee>classes=new ArrayList<>();
        classes.add(new Car1());
        classes.add(new Health1());
        classes.add(new Health1());
        System.out.println("Advanced For Loop");
        for (Insurancee aClass : classes) {
           aClass.cancelInsurance();
           aClass.getQuote();
        }
        System.out.println("For Loop");
        for(int i=0; i<classes.size(); i++){
            classes.get(i).getQuote();
            classes.get(i).cancelInsurance();
        }
        System.out.println("Iterator Way");
        Iterator<Insurancee>iterator=classes.iterator();
        while (iterator.hasNext()){
            Insurancee insurancee=iterator.next();
            insurancee.getQuote();
            insurancee.cancelInsurance();
        }
    }
}
abstract class Insurancee{
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car1 extends Insurancee {
  String carModel;

    @Override
    void getQuote() {
        System.out.println("Please enter your car model to get start your quote ");
    }

    @Override
    void cancelInsurance() {
        System.out.println("You will lost your money when you cancel your policy");
    }
}
class Pet1 extends Insurancee{
    String petType;

    @Override
    void getQuote() {
        System.out.println("The owners can get quotes");
    }

    @Override
    void cancelInsurance() {
        System.out.println("To cancel your pet insurance you need to submite your request before 15 days");
    }
}
class Health1 extends Insurancee{
    @Override
    void getQuote() {
        System.out.println("You can fet a Quote easily");
    }

    @Override
    void cancelInsurance() {
        System.out.println("You can cancel it");
    }
}
