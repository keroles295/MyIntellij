package com.syntax.class21;

public class MethodsOverLoading2 {
    void method(){
        System.out.println("1");
    }
    void method(String name){
        System.out.println("2");
    }
    void method(String name,int num){
        System.out.println("3");
    }
    void method(int num2, int num){
        System.out.println("4");
    }
    void method(int num,String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        MethodsOverLoading2 m=new MethodsOverLoading2();
        m.method("Hamid", 28);
        m.method("pietro");
        m.method(23, 45);
        m.method(29, "Keroles");
        m.method();
    }
}
