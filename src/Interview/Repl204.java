package Interview;

import java.util.*;

public class Repl204 {
    public static void main(String[] args) {
        HashMap<String, String> adrees=new HashMap<>();
        adrees.put("Street", "Patrick ST");
        adrees.put("Suite", "265");
        adrees.put("City", "Vienna");
        adrees.put("Zip","22180");
        adrees.put("Country", "United State");
        //Collection<String>values=adrees.values();
        Collection<String> values=adrees.values();
        Iterator<String> value=values.iterator();
        while (value.hasNext()){
            System.out.println(value.next().toUpperCase());
        }
    }
}
