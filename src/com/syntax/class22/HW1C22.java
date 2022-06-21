package com.syntax.class22;

public class HW1C22 {
    //reate a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.
}
class Degree{
    static void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Degree{

}
class Masters extends Degree{
    static void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Test {
    public static void main(String[] args) {
        Degree pitp=new Degree();
        pitp.getPrerequisite();
        Masters pitp1=new Masters();
        pitp.getPrerequisite();
        Bachelors pitp2=new Bachelors();
        pitp.getPrerequisite();

    }}
