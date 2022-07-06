package com.syntax.class26;

import java.util.ArrayList;

public class Task5 {
    //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1; i<=500; i++){
            if(i%2==0){
                numbers.add(i);
            }

        }

        System.out.println(numbers);

      for(int y=0; y<=numbers.size(); y++){
          if(numbers.get(y)%5==0){
           numbers.remove(y);

          }
       }
        System.out.println(numbers);

    }
}
