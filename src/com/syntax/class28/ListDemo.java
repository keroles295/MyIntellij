package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object [] arr={"Hamid", 10.98, "Name"};// bad programing
        for(Object obj:arr){
            if(obj instanceof String){
                //instanceof is checks if a variable contains a specfic type of object
                System.out.println(((String)obj).length());
            }
        }

    }
}
