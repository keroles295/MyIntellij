package com.syntax.class15;

public class VariableDemo2 {
    int num=10;//whenever you have to share some info in more than one method you should to use instance variable
    void method1(){
        int num2=90;
        System.out.println(num);
    }
    void method2(){
        //System.out.println(num2);
        System.out.println(num);
    }
}
