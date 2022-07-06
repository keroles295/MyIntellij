package Interview;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Repl194 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        countries.removeIf(num->num.startsWith("A"));
        List<String>newList=new ArrayList<>();
        newList.addAll(countries);
        System.out.println(newList);

        




    }
}



