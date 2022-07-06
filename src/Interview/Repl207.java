package Interview;

import java.util.*;

public class Repl207 {
    public static void main(String[] args) {
        HashMap<String, String>map=new HashMap<>();
        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");
        Collection<Map.Entry<String, String>> setM=map.entrySet();
        System.out.println("HashMap Before Replace :");
        for (Map.Entry<String, String> setMEn : setM) {
            System.out.println(setMEn.getKey()+" : " + setMEn.getValue());
        }
        System.out.println("------------------");
       map.replace("THREE", "ASEL");
       map.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        for (Map.Entry<String, String> setMEn : setM) {
            System.out.println(setMEn.getKey()+" : " + setMEn.getValue());
        }

        //HashMap<String, String>newMap=new HashMap<>();
       // newMap.putAll(map);


      //  for (Map.Entry<String, String> sty : newMap.entrySet()) {
           // System.out.println(sty.getKey()+" : "+sty.getValue());
       // }

        //Iterator<Map.Entry<String, String>>itera=newMap.entrySet().iterator();
         //while (itera.hasNext()){
             //Map.Entry<String, String>keyValue=itera.next();
           //System.out.println(keyValue.getKey()+" : "+keyValue.getValue());
        //}


    }
}
