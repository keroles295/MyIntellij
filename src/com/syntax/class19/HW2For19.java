package com.syntax.class19;

public class HW2For19 {

}
class G {
    public static void printH(){
        System.out.println("Method printG in class H");
    }
}
class E extends G {
    public static void main(String[] args) {
        E.printH();
    }
}