package Interview;

import java.util.LinkedList;
import java.util.List;

public class Repl192 {
    public static void main(String[] args) {
        //Create an Linked List that will store all prime numbers from 1 to 100
        //
        //Step 1. Create a method that will identify wether number is prime or not
        //
        //Step 2. Add all prime numbers into Linked List
        //
        //Print Linked List:
        LinkedList<Integer>primeNum=new LinkedList<>();
        Integer t=100;
        for(int y=2; y<t; y++) {
            Integer x = y;
            boolean isPrime = true;
            if (x > 1) {
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            if (isPrime) {
                primeNum.add(y);

            } else {
                //System.out.println(x + " is not prime ");
            }


        }
        System.out.println(primeNum);










    }





}
