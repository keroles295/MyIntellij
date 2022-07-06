package com.syntax.class26;

import java.util.ArrayList;

public class Task2 {
    //Create an arraylist of cars and retrieve all the values using 3 different ways
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Kia");
        cars.add("Tesla");
        System.out.println(cars);
        for(int i=0; i<cars.size(); i++){
            System.out.print(cars.get(i)+" ");
        }
        System.out.println();
        for (String cars1:cars){
            System.out.print(cars1+" ");
        }

    }
}
