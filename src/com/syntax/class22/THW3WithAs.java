package com.syntax.class22;

public class THW3WithAs {

}
class Programings{
     Programings(){
         System.out.println("I love Programing language ");
     }
     Programings(String str){
         System.out.println("I love "+str);
     }

    public static void main(String[] args) {
        new Programings();// it Creating an object but we do not assain it
        new Programings("Java");
    }
}
