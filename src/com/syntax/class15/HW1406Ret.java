package com.syntax.class15;

public class HW1406Ret {
    boolean isPrime(int x){
        boolean isPrime=true;
        if(x>1) {

            for(int i=2;i<x;i++) {
                if(x%i==0) {  // if the number that user has provided if that number is completely divisable by any other number
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        HW1406Ret task6=new HW1406Ret();
        task6.isPrime(54);
        System.out.println(task6.isPrime(15));
    }

}
