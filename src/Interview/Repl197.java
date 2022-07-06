package Interview;

import java.util.*;

public class Repl197 {
    public static void main(String[] args) {
        //Create Map in which we want to store keys in Ascending order
        //Extract all keys and it values and print them in the format below:

        TreeMap<String, String>market=new TreeMap<>();
        market.put("1 item", "apple");
        market.put("2 item", "banana");
        market.put("3 item", "pear");
        market.put("4 item", "tomato");
        market.put("5 item", "mango");
        market.put("6 item", "kiwi");
       Iterator<Map.Entry<String, String>>iteems=market.entrySet().iterator();
        while (iteems.hasNext()){
            Map.Entry<String, String>keyvalue=iteems.next();
            System.out.println("Key is "+keyvalue.getKey()+" and the value is "+keyvalue.getValue());
        }






    }
}
