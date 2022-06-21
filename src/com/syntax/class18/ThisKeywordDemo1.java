package com.syntax.class18;

public class ThisKeywordDemo1 {
    String name="Instance";
    void printName(){
        String name="Local";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeywordDemo1 t =new ThisKeywordDemo1();
        t.printName();
    }

}
