package com.syntax.class22;

public class AdvanceCalc {
   //

   static void sum(int ... arr){
       //System.out.println(arr[0]);
       int sum=0;
       for(int i=0; i< arr.length; i++){

          // System.out.print(arr[i]+" ");
           sum+=arr[i];

       }
       System.out.println("Sum of all the parameter values is "+sum);
    }
    static void printNames(String ... names){
       for (String name: names){
           System.out.println(name);
       }
    }

    public static void main(String[] args) {
        //sum(3, 4, 5, 8,9);
        int age=24;
       // String name;
        //if(age>18){
           /// name="Time to go work";
        //}else{
         //   name="Enjoy no working";
          //        System.out.println(name);
        String name2=age>18?"Time to go work":"Enjoy no working";
    }

}
