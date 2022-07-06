package Interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Reple206 {
    public static void main(String[] args) {
        HashMap<String, String>map=new HashMap<>();
        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        Collection<Map.Entry<String, String>>mape=map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : mape) {
            System.out.println(stringStringEntry.getKey()+" : "+stringStringEntry.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        HashMap<String, String>newMap=new HashMap<>();
        newMap.putAll(map);
        newMap.remove("ONE");
        newMap.remove("FOUR");
        Collection<Map.Entry<String, String>>newMape=newMap.entrySet();
        for (Map.Entry<String, String> stEntry2 : newMape) {
            System.out.println(stEntry2.getKey()+" : "+ stEntry2.getValue());
        }
    }
}
