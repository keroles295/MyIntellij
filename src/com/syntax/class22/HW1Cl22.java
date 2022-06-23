package com.syntax.class22;

public class HW1Cl22 {
    //create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends HW1Cl22 {

}
class Masters extends HW1Cl22 {
    @Override
    void getPrerequisite(){
        System.out.println("To get a Master degree you need Bachelor");
    }
}
class TestDeg{
    public static void main(String[] args) {
        HW1Cl22 d=new HW1Cl22();
        d.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();
    }
}
