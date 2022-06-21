package com.syntax.class17;

public class HWWithAsghar2 {
    String name;
    String id;
    static int numberOfSt;

    public static void main(String[] args) {
        HWWithAsghar2 t1=new HWWithAsghar2();
        t1.name="Kokoi";
        t1.id="I1234";
        numberOfSt=1; //if we are inside the same class we can access static varaible inside static methods by just
        //writting the name of that variable we don not need to creat an object
        System.out.println( t1.name);
        System.out.println( t1.id);
        System.out.println( numberOfSt);




    }

}
