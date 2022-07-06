package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2Wi {
    public static void main(String[] args) {
        //Creat arrylist of cars, and retrive them  in three diferrent ways
        ArrayList<String>cars=new ArrayList<>();
        cars.add("Honda");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Toyota");
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(cars);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Iterator<String> iterator= cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
