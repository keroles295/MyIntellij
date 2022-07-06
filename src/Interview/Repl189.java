package Interview;

import java.util.LinkedList;

public class Repl189 {
    public static void main(String[] args) {
        LinkedList<Integer>numbers=new LinkedList<>();
        for(int i=50; i<100; i++){
           numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(num->num%3!=0);
        System.out.println(numbers);
    }
}
