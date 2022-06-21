package com.syntax.class16;

public class StaticDemo {
    static int noOfEmployees=20;
    String name;
    static void method1(){
        System.out.println(noOfEmployees);
        //System.out.println(name);// because each object will be having a seprate copy of this name
    }
    void methods(){
        System.out.println( noOfEmployees);
    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Koiko";
        st.methods();
        StaticDemo st2=new StaticDemo();
        st2.name="Marooo";
        st2.methods();

    }




}
