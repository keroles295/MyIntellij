package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repl203 {
    public static void main(String[] args) {
        HashMap<String, Integer>map=new HashMap<>();
        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);

        map.put("mango", 40);

        map.put("mango", 40);
        Iterator<Map.Entry<String, Integer>>entryIterator=map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer>item=entryIterator.next();
            System.out.println("Key = "+item.getKey()+" and value = "+item.getValue());
        }


    }
}
